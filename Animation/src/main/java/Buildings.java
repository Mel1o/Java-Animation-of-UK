/**
	This is for buildings the buildings, Ha Ha. Basically, anything in the animation that stays still is in this class.
        The only values that update is the HSB values.
	
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

public class Buildings implements DrawingObject  {
    
    private Color color=Color.getHSBColor(0.558f, 0.72f, 0.882f);
    
    private Triangle t1;
    private Triangle t2;
    private Square s1;
    private Square s2;
    private Circle c1;
    private Rectangle r1;
    private Rectangle r2;
    private Rectangle r3;
    private Rectangle r4;
    private Rectangle r5;
    private Rectangle r6;
    private Rectangle r7;
    private Rectangle r8;
    private Rectangle r9;
    private Rectangle r10;
    private Rectangle r11;
    private Rectangle r12;
    private Rectangle r13;
    private Rectangle r14;
    
    private Rectangle r15;
    private Rectangle r16;
    private Rectangle r17;
    private Rectangle r18;
    private Rectangle brij1;
    private Rectangle brij2;
    private Rectangle brij3;
    private Line line;
    private Line line2;
    private Line line3;
    private Line line4;
    private Line line5;
    private Line line6;
    private Line line7;
    
    
    private Area w1;
    private Area w2;
    private Area a1;
    private Area a2;
    private Circle center;
    private Line l1;
    private Line l2;
    
    private Rectangle h1;
    private Rectangle h2;
    private Rectangle h3;
    private Rectangle h4;
    private Rectangle h5;
    private Rectangle h6;
    private Rectangle h7;
    private Rectangle h8;
    private Rectangle h9;
    private Rectangle h10;
    
    private Rectangle k1;
    private Rectangle k2;
    private Rectangle k3;
    private Rectangle k4;
    private Rectangle k5;
    private Rectangle k6;
    private Rectangle k7;
    private Rectangle k8;
    private Rectangle k9;
    private Rectangle k10;
    
    private Triangle ht;
    private Triangle ht1;
    private Triangle ht2;
    
    private Triangle kt;
    private Triangle kt1;
    private Triangle kt2;
    
    private final int x=85;
    private final int y =x*2;
    private final int z =x*3;
    
    private float num1;
    private float num2;
    private float num3;
    private float h;
    private float s;
    private float v;
    private boolean day=true;  
    /** This is for instantiating all the unmoving shapes in the canvas, this was so tedious**/
    @Override
    public void draw(Graphics2D g2d) {
      
        
        Rectangle2D.Double b1= new Rectangle2D.Double(462.5,175,100,110);
        g2d.setColor(color);
        g2d.fill(b1);
        
        Rectangle2D.Double b2= new Rectangle2D.Double(452.5,180,120,100);
        g2d.setColor(color);
        g2d.fill(b2);
        
        Rectangle2D.Double land= new Rectangle2D.Double(602, 575, 500, 100);
        g2d.setColor(color);
        g2d.fill(land);
        
        t1 = new Triangle(462.5,65,80,100,color);
        t2 = new Triangle(482.5,9,76.5,60,color);
        
        s1 = new Square(472.5,190,80,color);
        s2 = new Square(470.5,188,84,Color.white);
        c1 = new Circle(475,192.5,75,Color.white);
        
        r1 = new Rectangle(472.5,290,552.5,350,color);
        r2 = new Rectangle(457,355,567,370,color);
        r3 = new Rectangle(459,288,468,352,color);
        r4 = new Rectangle(556.5,288,565.5,352,color);
        
        r5 = new Rectangle(472.5,290+x,552.5,350+x,color);
        r6 = new Rectangle(457,355+x,567,370+x,color);
        r7 = new Rectangle(459,288+x,468,352+x,color);
        r8 = new Rectangle(556.5,288+x,565.5,352+x,color);
        
        r9 = new Rectangle(472.5,290+y,552.5,350+y,color);
        r10 = new Rectangle(457,355+y,567,370+y,color);
        r11 = new Rectangle(459,288+y,468,352+y,color);
        r12 = new Rectangle(556.5,288+y,565.5,352+y,color);
        
        r13 = new Rectangle(462.5,150,562.5,170,color);
        r14 = new Rectangle(482.5,85,542.5,115,color);
        
        r15 = new Rectangle(482.5,293+z,542,350+z,color);
        r16 = new Rectangle(449,288+z,478,352+z,color);
        r17 = new Rectangle(546.5,288+z,575.5,352+z,color);
        r18 = new Rectangle(449,355+z,575.5,370+z+x,color);
        
        
        a1= new Area(new Ellipse2D.Double(627,200,350, 350));
        a2= new Area(new Ellipse2D.Double(637,210,330, 330));
        a1.subtract(a2);
        g2d.fill(a1);
        
        w1= new Area(new Ellipse2D.Double(657,230,290, 290));
        w2= new Area(new Ellipse2D.Double(662,235, 280, 280));
        w1.subtract(w2);
        g2d.fill(w1);
        
        
        center =new Circle(782,355,40,color);
        l1= new Line(802,370,700,758,8,color);
        l2= new Line(802,370,904,758,8,color);
        
        ht= new Triangle(70,355,43,30,color);
        ht1= new Triangle(50,372,25,15,color);
        ht2= new Triangle(105,372,25,15,color);
        
        h1= new Rectangle(67,400,103,450,color);
        h2= new Rectangle(50,400,65,450,color);
        h3= new Rectangle(105,400,120,450,color);
        
        h4= new Rectangle(50,452,120,460,color);
        h5= new Rectangle(67,462,103,487,color);
        h6= new Rectangle(67,490,103,515,color);
        h7= new Rectangle(67,518,103,548,color);
        
        h8= new Rectangle(53,460,65,550,color);
        h9= new Rectangle(105,460,117,550,color);
        h10= new Rectangle(40,550,130,700,color);
        
        int space=267;
        kt= new Triangle(70+space,355,43,30,color);
        kt1= new Triangle(50+space,372,25,15,color);
        kt2= new Triangle(105+space,372,25,15,color);
        
        k1= new Rectangle(67+space,400,103+space,450,color);
        k2= new Rectangle(50+space,400,65+space,450,color);
        k3= new Rectangle(105+space,400,120+space,450,color);
        
        k4= new Rectangle(50+space,452,120+space,460,color);
        k5= new Rectangle(67+space,462,103+space,487,color);
        k6= new Rectangle(67+space,490,103+space,515,color);
        k7= new Rectangle(67+space,518,103+space,548,color);
        
        k8= new Rectangle(53+space,460,65+space,550,color);
        k9= new Rectangle(105+space,460,117+space,550,color);
        k10= new Rectangle(40+space,550,130+space,700,color);
        
        brij1 = new Rectangle(0,550,451,565,color);
        brij2 = new Rectangle(110,445,320,450,color);
        brij3 = new Rectangle(110,452,320,455,color);
        
        line =new Line(380,430,462,480,2,color);
        line3 = new Line(400,442,400,550,0,color);
        line4 = new Line(420,455,420,550,0,color);
        line5 = new Line(440,468,440,550,0,color);
        
        line2 =new Line(57,430,-4,465,2,color);
        line6 = new Line(35,442,35,550,0,color);
        line7 = new Line(15,455,15,550,0,color);
        
        line.draw(g2d);
        line2.draw(g2d);
        line3.draw(g2d);
        line4.draw(g2d);
        line5.draw(g2d);
        line6.draw(g2d);
        line7.draw(g2d);
        
        
        brij1.draw(g2d);
        brij2.draw(g2d);
        brij3.draw(g2d);
        
        ht1.draw(g2d);
        ht2.draw(g2d);
        ht.draw(g2d);
        h1.draw(g2d);
        h2.draw(g2d);
        h3.draw(g2d);
        h4.draw(g2d);
        h5.draw(g2d);
        h6.draw(g2d);
        h7.draw(g2d);
        h8.draw(g2d);
        h9.draw(g2d);
        h10.draw(g2d);
        
        kt1.draw(g2d);
        kt2.draw(g2d);
        kt.draw(g2d);
        k1.draw(g2d);
        k2.draw(g2d);
        k3.draw(g2d);
        k4.draw(g2d);
        k5.draw(g2d);
        k6.draw(g2d);
        k7.draw(g2d);
        k8.draw(g2d);
        k9.draw(g2d);
        k10.draw(g2d);
        
        
        
        r1.draw(g2d);
        r2.draw(g2d);
        r3.draw(g2d);
        r4.draw(g2d);
        r5.draw(g2d);
        r6.draw(g2d);
        r7.draw(g2d);
        r8.draw(g2d);
        r9.draw(g2d);
        r10.draw(g2d);
        r11.draw(g2d);
        r12.draw(g2d);
        
        r13.draw(g2d);
        r14.draw(g2d);
        
        r15.draw(g2d);
        r16.draw(g2d);
        r17.draw(g2d);
        r18.draw(g2d);

        
        t1.draw(g2d);
        s2.draw(g2d);
        s1.draw(g2d);
        c1.draw(g2d);
        t2.draw(g2d);
        
        center.draw(g2d);
        l1.draw(g2d);
        l2.draw(g2d);
        
    }
    /** this is for transitioning 2 colors into each other which was pretty cool to see work**/
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
    /** don't need this method for this class but forced to make it**/
    @Override
    public void move(double distance) {
        System.out.println("this is not supposed to move");
    }
}
