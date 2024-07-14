/**
	This is for making the cars in the canvas. Can be given values to have different speeds on the Bridge part of the canvas.
	
	@author Simeon, Marc Gerald M. (204722)
	@version April 11, 2021
**/

/*
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
*/
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Area;

public class Cars implements DrawingObject{
    
    private Color color=Color.getHSBColor(0.55f, 0.81f, 0.784f);
    private double x=-50;
    private Area a1;
    private Area a2;
    private Area a3;
    private Area a4;
    
    private float num1;
    private float num2;
    private float num3;
    private float h;
    private float s;
    private float v;
    private boolean day=true;
    /** for instantiating the shapes to make a car silhouette. took me a while to figure out how round rectangles work, sadly **/
    @Override
    public void draw(Graphics2D g2d) {
        a1= new Area(new RoundRectangle2D.Double.Double(5+x, 523, 40, 23, 10, 5));
        a2= new Area(new Ellipse2D.Double.Double(8+x, 540, 10, 10));
        a3= new Area(new Ellipse2D.Double.Double(32+x, 540, 10, 10));
        a4= new Area(new Rectangle2D.Double.Double(455, 500, 700, 600));
        a1.add(a2);
        a1.add(a3);
        a1.subtract(a4);
 
        g2d.setColor(color);
        g2d.fill(a1);
    }
    /** this is for the x values of the car to update so that it would look like it is moving and go vroom vroom.**/
    @Override
    public void move(double distance) {
        x=x+distance;
        if(x>=455){
            x=-50;
        }
    }
    /** for the cars to change color synonymous with the buildings**/
    public void changeColor(float h1, float s1, float v1,float h2, float s2, float v2,float times ) {
        
            num1=(h2-h1)/times;
            num2=(s2-s1)/times;
            num3=(v2-v1)/times;
        
        if (day==true){
            h=h+num1;
            s=s+num2;
            v=v+num3;
            
        
            color = Color.getHSBColor(h+h1, s+s1, v+v1);
                if(h+h1>=h2){
                    day=false;
                }
                
        }
        
        
        else if(day==false){
            h=h-num1;
            s=s-num2;
            v=v-num3;
            
            color = Color.getHSBColor(h+h1, s+s1, v+v1);
                if(h+h1<=h1){
                    day=true;
                }
                
        }    
    }
    
}
