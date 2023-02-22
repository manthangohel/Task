class NewThreadOE extends Thread
{
    NewThreadOE(String threadname)
    {
        super(threadname);
    }
    public void run()
    {
        if( getName().equals("Odd")==true)  
        {
            for(int i=1;i<=50;i=i+2)
            {
                System.out.print("\nOdd: " + i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Exception Occurred.");
                }
            }
        }
        else
        {
            for(int i=2;i<=50;i=i+2)
            {
                if(i%10==0)
                System.out.println();
                System.out.print("\nEven: " + i);
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("Exception Occurred.");
                }
            }
        }
    }
}
public class OddEvenExample
{
    public static void main(String[] args)
    {
        NewThreadOE t1 = new NewThreadOE("Odd");
        NewThreadOE t2 = new NewThreadOE("Even");
        t1.start();
        t2.start();
    }
}