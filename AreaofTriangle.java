package geometric;
import java.util.*;
public class AreaofTriangle {

	public static void main(String[] args) 
	{
		double area;
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the length of a triangle");
		int length=obj.nextInt();
		System.out.println("enter the width of a triangle");
		int width=obj.nextInt();
		area=(double)(length*width)/2;
		System.out.println("area of a triangle is :"+area);
	}
}
