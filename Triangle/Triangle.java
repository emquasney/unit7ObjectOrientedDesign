import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
public class Triangle
{
    private static final int FRAME_WIDTH=100;
    private static final int FRAME_HEIGHT=150;
    private JFrame frame;
    private JPanel panel;
    public Triangle()
    {
        frame=new JFrame();
        panel=new JPanel();
        TriangleComponent comp=new TriangleComponent();
        frame.add(comp);
        frame.add(panel);
        MousePressListener listener=new MousePressListener();
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public class MousePressListener extends JComponent implements MouseListener
    {
        private int x;
        private int y;
        public void mousePressed(MouseEvent event)
        {
            x=event.getX();
            y=event.getY();
            repaint();
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
    public static void main(String[] args)
    {
        Triangle viewer=new Triangle();
    }
}