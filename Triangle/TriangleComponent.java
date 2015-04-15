import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class TriangleComponent extends JComponent
{
    public int x;
    public int y;
    public int count=0;
    public int count1=0;
    public int[] coords=new int[3];
    public int[] coords1=new int[3];
    public class MousePressListener extends JComponent implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            x=event.getX();
            y=event.getY();
            coords[count]=x;
            coords1[count]=y;
            count++;
        }
        public void mouseReleased(MouseEvent event)
        {
        }
        public void mouseClicked(MouseEvent event)
        {
        }
        public void mouseEntered(MouseEvent event)
        {
        }
        public void mouseExited(MouseEvent event)
        {
        }
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Dot d=new Dot(coords[count],coords1[count]);
        
        repaint();
    }
}