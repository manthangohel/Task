import java.util.Scanner;
class Swap
{
	public static void main(String[] args)
	{
		int x,y,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Number:");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before swapping numbers:"+x+""+y);
		t=x;
		x=y;
		y=t;
		System.out.println("After Swapping:"+x+""+y);
		System.out.println();
	}
}