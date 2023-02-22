import java.io.*;
import java.util.Scanner;
public class p_1
{
	public static void main(String args[])
	{
	System.out.println("1. Area Of Circle");
	System.out.println("2. Area Of Triangular");
	System.out.println("3. Area Of Rectangle");
	System.out.println("->Select And Enter Any Option: ");
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	switch(num)
		{
			case 1: 
				System.out.println("Enter Radius Of Circle: ");
				double r = s.nextFloat();
				double areaCircle = (22*r*r)/7;
				System.out.println("Area Of Circle Is: "+areaCircle);
				break;
			case 2:
				System.out.println("Enter Base And Height Of Triangle: ");
				double base = s.nextFloat();
				double height = s.nextFloat();
				double areaTriangle = (base*height)/2;
				System.out.println("Area Of Triangle Is: "+areaTriangle);
				break;
			case 3:
				System.out.println("Enter Length And Breadth Of Rectangle: ");
				int length = s.nextInt();
				int breadth = s.nextInt();
				int areaRectangle = length*breadth;
				System.out.println("Area Of Ractangle Is: "+areaRectangle);
				break;
			default:System.exit(0);
		}
	}
}