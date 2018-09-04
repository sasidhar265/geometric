package geometric;
import java.util.*;
public class PerimeterofTriangle {

	public static void main(String[] args) 
	{
		int perimeter;
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the value of a");
		int a=obj.nextInt();
		System.out.println("enter the value of b");
		int b=obj.nextInt();
		System.out.println("enter the value of c");
		int c=obj.nextInt();
		perimeter=a+b+c;
		System.out.println("the perimeter of the triangle is");
		System.out.println(perimeter);
	}

}
