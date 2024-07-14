/**
	This is a class that creates balls and lines. For the Ferris wheel part of the canvas. 
        * Although this only instantiates the parts of the Ferris wheel that moves. Every other part is in the Building class.
	
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
public class Balls implements DrawingObject {
    private Circle ball;
    private Line l1;
    private Line l2;
    private Line l3;
    private Color color=Color.getHSBColor(0.558f, 0.72f, 0.882f);
    private double x;
    
    private float num1;
    private float num2;
    private float num3;
    private float h;
    private float s;
    private float v;
    private boolean day=true;
    /** This should make the moving parts of the Ferris WHeel. Called London Eye. **/
    @Override
    public void draw(Graphics2D g2d) {
        g2d.rotate(Math.toRadians(x),802,375);
        for(int z=0;z<=32;z+=1){
        g2d.rotate(Math.toRadians(11.25),802,375);
        l1= new Line(802,233,802,375,0,color);
        l2= new Line(802,205,785,235,1,color);
        l3= new Line(802,205,819,235,1,color);
        ball = new Circle(789.5,175,25,color);
        l1.draw(g2d);
        l2.draw(g2d);
        l3.draw(g2d);
        ball.draw(g2d);
        }
    }
    /** For the wheel to spin**/
    @Override
    public void move(double distance) {
        x=x+distance;
        
    }
    /** This should change the color of London Eye. should be the same with buildings**/
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
