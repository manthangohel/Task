
/*<APPLET CODE = MyAppBan.class WIDTH = 300 HEIGHT = 100>
</APPLET>*/

import java.awt.*;
import java.applet.*;

public class MyAppBan extends Applet implements Runnable 
{
   	String msg="   <* TKM College Of Engineering *>   ";
  	Thread t=null;
   	int state;
   	boolean stopflag;

   	public void init() 
   	{
   		setSize(300,100);
   		t=new Thread(this);
   		try
   		{
   			t.start();
   			t.suspend();
		} 
   		catch (Exception e) 
   		{
   			System.out.println("Error : "+ e);
		}
  	}

   	public void start ()
   	{
   		stopflag = false;
   		t.resume();
   	}

   	public void run() 
   	{
   		char ch;
   		while(true)
   		{
   			try
      			{
         				repaint();
          				Thread.sleep(250);
         				ch = msg.charAt(0);
          				msg = msg.substring(1,msg.length());
          				msg += ch;
         				if(stopflag)
             				break;
         			} 
			catch(Exception e)
			{
				System.out.println("Error : "+ e);
			}
	   	}
	}

	public void stop()
	{
	   	stopflag=true;
	   	try
   		{
			t.suspend();
		} 
   		catch (Exception e) 
   		{
   			System.out.println("Error : "+ e);
		}
	
	}

	public void paint(Graphics g) 
	{
	   	g.drawString(msg,50,30);
	}
}