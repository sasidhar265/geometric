package geometric;
import java.util.*;
public class AreaofSquare {

	public static void main(String[] args) 
	{
		int area;
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the size of side");
		int side=obj.nextInt();
		area=side*side;
		System.out.println("the area of a square is");
		System.out.println(area);
	}
}
