import java.applet.Applet;
import java.awt.*;
public class practical3 extends Applet
/* <applet code="practical3" width="500" height="500">
</applet>
*/
{

    public void init()
    {
        super.init();
        setSize(350,350);
    }
    public void paint(Graphics s)
    {
        int x1=100,y1=100,y2=50;
        s.setColor(Color.green);
        s.drawRect(100, 100, 100, 50);
      
        for(x1=100;x1<300;x1=x1+5)
        {
            try
            {
                Thread.sleep(1000);
                s.fillRect(x1, y1, 5, y2);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    } 

}
