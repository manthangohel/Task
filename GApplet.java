import java.applet.*;
import java.awt.*;
public class GApplet extends Applet
{
	public void paint(Graphics g)
	{
		
		
		g.fillRect(100, 100,100, 100);
		g.drawSquare(100,50);
		g.fillSquare(100,100);
		g.setColor(Color.RED);
		g.fillOval(300, 160, 200, 100);
	}
}
/*
<applet code="GApplet" height="500" width="700" border="1">
</applet>
*/