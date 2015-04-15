import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Graphics;
/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dot
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    private int y;
    public Dot(int x, int y)
    {
        x=x;
        y=y;
    }
    public void draw(Graphics2D g2)
    {
        Rectangle dot = new Rectangle(x, y,1,1);
        g2.setColor(Color.BLACK);
        g2.draw(dot);
    }
}
