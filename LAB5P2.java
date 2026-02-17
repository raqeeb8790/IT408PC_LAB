import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface bullet{
	String  str();
	double dbl();
}


class AnnotationMain{
	@bullet(str="camlin",dbl=15.326)
	public static void anyMethod() throws NoSuchMethodException{
		Method mtd=AnnotationMain.class.getMethod("anyMethod");
		
		bullet b=mtd.getAnnotation(bullet.class);
		System.out.println("string:"+b.str());
		System.out.println("double"+b.dbl());
		
	}
	public static void main(String[]args) throws NoSuchMethodException{
		anyMethod();
	}
}
