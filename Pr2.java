import java.applet.Applet;
import java.awt.*;
/* <applet code="Pr2" width="500" height="300">
</applet>
*/
public class Pr2 extends Applet
{
public void paint(Graphics g)
{
for(int i=0;i<=10;i++)
{
g.setColor(Color.red);
g.fillOval(225,i*50,70,40);
}
}
}