/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4a3_jacobim;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author jacobim
 * August 11th
 * Welcome screen frame
 */
public class JFrameWelcome {
    public static void main(String [] args){
        U4A3_MyLessonPlan myFrame = new U4A3_MyLessonPlan();
        //Creating a new frame for the application 
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Allowing frame to be closed
        
        myFrame.setSize(1300,850);
        //Setting size of JFrame
    
        myFrame.setVisible(true);
    }
}
