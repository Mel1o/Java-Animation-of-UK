
import java.awt.*;
import java.awt.geom.*;

public class Rectangle implements DrawingObject {
    private double xstart;
    private double ystart;
    private double xend;
    private double yend;
    private Color color;
    /** Constructs a rectangle. will need for the buildings class a lot**/
    public Rectangle(double xstart, double ystart, double xend, double yend, Color color){
        this.xstart =xstart;
        this.ystart =ystart;
        this.xend=xend;
        this.yend=yend;
        this.color =color;
    }
    /** Draws rectangles**/
    @Override
    public void draw(Graphics2D g2d) {
        Rectangle2D.Double c= new Rectangle2D.Double(xstart,ystart,xend-xstart,yend-ystart);
       g2d.setColor(color);
       g2d.fill(c);
    }
    /** do not need this to be called**/
    @Override
    public void move(double distance) {
    }
    /** Do not need this for this class**/
    @Override
    public void changeColor(float h1, float s1, float v1, float h2, float s2, float v2, float times) {
        System.out.print("hi");
    }
    
}
