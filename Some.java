import java.awt.*;
import java.applet.*;
/* <applet code="Some" width=500 height=500>
</applet> */
public class Some extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.RED);
g.fillOval(80,50,50,50);
g.setColor(Color.GREEN);
g.fillRect(50,120,100,50);
g.setColor(Color.YELLOW);
int x1[]={50, 100, 150, 50};
int y1[]={250, 200, 250, 250};
int n1=4;
g.fillPolygon(x1, y1, n1);
g.setColor(Color.YELLOW);
g.fillRect(200,200,50,50);
int x2[]={120,220,220,120};
int y2[]={120,20,220,120};
int n2=4;
g.fillPolygon(x2,y2,n2);

}
}