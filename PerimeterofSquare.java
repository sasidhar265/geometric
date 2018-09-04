package geometric;
import java.util.*;
public class PerimeterofSquare {
	public static void main(String[] args) 
	{
		int perimeter;
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the size of side");
		int side=obj.nextInt();
		//perimeter=4*side;
		perimeter=(2*side)+(2*side);
		System.out.println("the perimeter of the square is");
		System.out.println(perimeter);
	}

}
