package geometric;
import java.util.*;
public class PerimeterofRectangle {

	public static void main(String[] args) 
	{
		int perimeter;
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the size of length");
		int length=obj.nextInt();
		System.out.println("enter the size of width");
		int width=obj.nextInt();
		perimeter=(2*length)+(2*width);
		System.out.println("the perimeter of Rectangle is");
		System.out.println(perimeter);
	}

}
