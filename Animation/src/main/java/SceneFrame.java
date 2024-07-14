
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
public class SceneFrame {
    
    private JFrame frame;
    private JButton button;
    private SceneCanvas sceneCanvas;
    private Timer timer;
    private Boolean bool=true;
    /** This just makes the Frame and also the Button. Pretty much just copied Sir Choobs Tutorial**/
    public SceneFrame(){
        
        frame=new JFrame();
        button =new JButton("PLAY");
        sceneCanvas = new SceneCanvas(1024,768, Color.WHITE);
        
    }
    /** This is for setting up the GUI**/
    public void setUpGUI(){
        Container cp=frame.getContentPane();
        frame.setTitle("Midterm Project- Simeon, Marc Gerald M. - 204722");
        cp.add(button,BorderLayout.EAST);
        cp.add(sceneCanvas,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    /** This will be used to set up the listener for the button as the name suggests**/
    public void setUpButtonListener(){
        
        ButtonListener bl=new ButtonListener();
        button.addActionListener(bl);
    }
    /** This will be in charge of calling the update values of all the classes then repainting them **/
    private class ButtonListener implements ActionListener{  
        
         ActionListener tP = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            double degrees = 1;
            double push=6.666666667;
            sceneCanvas.returnBuilding().changeColor(0.558f, 0.72f, 0.882f, 0.644f, 0.534f, 0.227f, 180f);
            sceneCanvas.returnHourhand().changeColor(0.558f, 0.72f, 0.882f, 0.644f, 0.534f, 0.227f, 180f);
            sceneCanvas.returnMinutehand().changeColor(0.558f, 0.72f, 0.882f, 0.644f, 0.534f, 0.227f, 180f);
            sceneCanvas.returnBalls().changeColor(0.558f, 0.72f, 0.882f, 0.644f, 0.534f, 0.227f, 180f);
            sceneCanvas.returnCars().changeColor(0.558f, 0.72f, 0.882f, 0.644f, 0.534f, 0.227f, 180f);
            sceneCanvas.returnCars2().changeColor(0.558f, 0.72f, 0.882f, 0.644f, 0.534f, 0.227f, 180f);
            sceneCanvas.returnCars3().changeColor(0.558f, 0.72f, 0.882f, 0.644f, 0.534f, 0.227f, 180f);         
            sceneCanvas.returnWater().changeColor(0.01f, 0.01f, 1f, 0.594f, 0.341f, 1f, 180f);
            sceneCanvas.returnWaterm().changeColor(0.558f, 0.72f, 0.882f, 0.65f, 0.426f, 0.533f, 180f);
            sceneCanvas.returnWaterf().changeColor(0.55f, 0.81f, 0.784f, 0.644f, 0.526f, 0.22f, 180f);
            
            sceneCanvas.returnSun().move(degrees);
            sceneCanvas.returnHourhand().move(degrees);
            sceneCanvas.returnMinutehand().move(degrees*12);
            sceneCanvas.returnSky().move(push);
            sceneCanvas.returnSkyn().move(push);
            sceneCanvas.returnBalls().move(0.5); 
            sceneCanvas.returnWater().move(0.05);
            sceneCanvas.returnWaterf().move(0.05);
            sceneCanvas.returnWaterm().move(0.05);
            sceneCanvas.returnCars().move(23);
            sceneCanvas.returnCars2().move(4);
            sceneCanvas.returnCars3().move(10);
            
            sceneCanvas.repaint();
       
            }
        };
         
        @Override
        public void actionPerformed(ActionEvent e) {
         
            if(bool==true){
            timer = new Timer(40,tP);
            timer.setRepeats(true);
            timer.start();
            bool=false;
            button.setText("STOP");
            }
            else{
            timer.stop();
            bool=true;
            button.setText("PLAY");
            }
        } 
    }
}
