import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <applet code="Pr4" width="500" height="300">
</applet>
*/
public class pr4 extends Applet implements MouseListener,MouseMotionListener  {
 
 String msg="";
 
 int x,y;
 public void init()
 {
  super.init();
  setSize(400,400);
  addMouseListener(this);
  addMouseMotionListener(this);
        }
 
        public void paint(Graphics s)
 {
  
  showStatus(msg);
  s.fillRect(x, y, 10, 10);
  s.drawString("x: "+x+" Y:"+y, 20,20);
 }

 
 public void mouseDragged(MouseEvent e) {
   x=e.getX();
             y=e.getY();
  msg="X="+x+"Y="+y;
  repaint();
  
 }

 @Override
 public void mouseMoved(MouseEvent e) {
  // TODO Auto-generated method stub
  
   x=e.getX();
      y=e.getY();
  
  repaint();
  msg="X="+x+"Y="+y;
  
 
  
 }

  public void mouseClicked(MouseEvent arg0) {
  
  
 }

 
 public void mouseEntered(MouseEvent arg0) {
  
  
 }

 
 public void mouseExited(MouseEvent arg0) {
  
 }

 
 public void mousePressed(MouseEvent arg0) {
  
  
 }

 
 public void mouseReleased(MouseEvent arg0) {
  
  
 }


}