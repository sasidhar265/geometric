package geometric;
import java.util.*;
public class AreaofRectangle {

	public static void main(String[] args) 
	{
		int area;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the length of rectangle");
		int length=obj.nextInt();
		System.out.println("enter the width of rectangle");
		int width=obj.nextInt();
		area=length*width;
		System.out.println("the area of rectangle is");
		System.out.println(area);
	}

}
