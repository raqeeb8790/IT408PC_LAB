import java.io.*;

class FileMain{
	public static void main(String[] args) throws IOException{
		File f=new File("Epson.java");
		if(f.exists()){
			System.out.println("The file already exists");
		}
		else{
			f.createNewFile();
			System.out.println("File Exists: "+f.exists());
		}
	}
}
