
import java.util.Scanner;
class ExceptionMain{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		try{
			int age = s.nextInt();
			if(age < 18)
				throw new AgeException("sorry not eligible");
			else
				System.out.println("please cast your vote");
		}catch(AgeException ae){
			System.out.println(ae.getMessage());
		}
	}
}
class AgeException extends Exception{
	public AgeException(String msg){
		super(msg);
	}
}
