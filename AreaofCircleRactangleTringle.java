package mainpackage;
import java.util.*;
public class AreaofCircleRactangleTringle
{
	public static double AreaofCircle(double radius)
{
	return 3.14*radius*radius;
}
public static double AreaoRactangle(double length,double width)
{
	return length*width;
}
public static double AreaofTringle(double basewidth,double hight)
{
	return(basewidth*hight)/2;
}
public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter The Radius Of circle:");
	double radius=sc.nextDouble();
	system.out.println("Enter The Length Of Ractangle");
	double length=sc.nextDouble();
	system.out.println("Enter The Width Of Ractangle:");
	double width=sc.nextDouble();
	system.out.println("Enter The basewidth Of tringle");
	double basewidth=sc.nextDouble();
	system.out.println("Enter The hight Of traingle:");
	double hight=sc.nextDouble();

double areaofcircle=AreaofCircle(radius);
System.out.println("The Area of circle is:"+areaofcircle);
double areaofractangle=AreaofRactangle(length,width);
System.out.println("The Area Of Ractangle is:"+areaofRactangle);
double areaoftringle=AreaofTringle(basewidth,hight);
System.out.println("The Area Of Tringle is:"+areaofTringle);
}
}
