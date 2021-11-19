/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u4a3_jacobim;
import java.awt.Component;
import java.awt.FlowLayout; 
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.SwingConstants; 
import javax.swing.Icon; 
import javax.swing.ImageIcon; 
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author jacobim
 * Menu frame
 */
public class JFrameMenu extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;         //Title label
        JLabel lblPic;           //Picture label
        JButton btnUserGuide;    //User guide button
        JButton btnLesson;       //Lesson button
        JButton btnOverview;     //Overview button
        JButton btnQuiz;         //Quiz button
        JButton btnSolutions;    //Solutions button
        JButton btnExit;         //Exit application
        
    public JFrameMenu(){
        
        super("Main Menu");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.ORANGE);        //Setting background color
        
        //Formatting widgets 
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(500,200);
            lblTitle.setLocation(100,50);
            lblTitle.setText("Main Menu");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 75));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Picture
            lblPic = new JLabel();
            lblPic.setLocation(50,200);
            lblPic.setSize(600,564);
            ImageIcon imgMath = new ImageIcon("Math.png");
            lblPic.setIcon(imgMath);
            add(lblPic);
         
            //User guide button
            btnUserGuide = new JButton();
            btnUserGuide.setSize(300,75);
            btnUserGuide.setLocation(800,100);
            btnUserGuide.setText("User Guide");
            btnUserGuide.setFont(new Font("Lucida", Font.PLAIN, 25));
            btnUserGuide.setOpaque(true);
            btnUserGuide.setBackground(Color.BLACK);
            btnUserGuide.setAlignmentX(CENTER_ALIGNMENT);
            btnUserGuide.setActionCommand("User Guide");                  //Tells button to carry out action
            btnUserGuide.addActionListener(this);                         //Tells button to listen to command
            add(btnUserGuide);
            
            //Lesson button
            btnLesson = new JButton();
            btnLesson.setSize(300,75);
            btnLesson.setLocation(800,250);
            btnLesson.setText("Lesson");
            btnLesson.setFont(new Font("Lucida", Font.PLAIN, 25));
            btnLesson.setOpaque(true);
            btnLesson.setBackground(Color.BLACK);
            btnLesson.setAlignmentX(CENTER_ALIGNMENT);
            btnLesson.setActionCommand("Lesson");                      //Tells button to carry out action
            btnLesson.addActionListener(this);                         //Tells button to listen to command
            add(btnLesson);
            
            //Overview button
            btnOverview = new JButton();
            btnOverview.setSize(300,75);
            btnOverview.setLocation(800,400);
            btnOverview.setText("Overview");
            btnOverview.setFont(new Font("Lucida", Font.PLAIN, 25));
            btnOverview.setOpaque(true);
            btnOverview.setBackground(Color.BLACK);
            btnOverview.setAlignmentX(CENTER_ALIGNMENT);
            btnOverview.setActionCommand("Overview");                    //Tells button to carry out action
            btnOverview.addActionListener(this);                         //Tells button to listen to command
            add(btnOverview);
            
            //Quiz button
            btnQuiz = new JButton();
            btnQuiz.setSize(300,75);
            btnQuiz.setLocation(800,550);
            btnQuiz.setText("Quiz");
            btnQuiz.setFont(new Font("Lucida", Font.PLAIN, 25));
            btnQuiz.setOpaque(true);
            btnQuiz.setBackground(Color.BLACK);
            btnQuiz.setAlignmentX(CENTER_ALIGNMENT);
            btnQuiz.setActionCommand("Quiz");                        //Tells button to carry out action
            btnQuiz.addActionListener(this);                         //Tells button to listen to command
            add(btnQuiz);
            
            //Solutions button
            btnSolutions = new JButton();
            btnSolutions.setSize(300,75);
            btnSolutions.setLocation(800,700);
            btnSolutions.setText("Solutions");
            btnSolutions.setFont(new Font("Lucida", Font.PLAIN, 25));
            btnSolutions.setOpaque(true);
            btnSolutions.setBackground(Color.BLACK);
            btnSolutions.setAlignmentX(CENTER_ALIGNMENT);
            btnSolutions.setActionCommand("Solutions");                   //Tells button to carry out action
            btnSolutions.addActionListener(this);                         //Tells button to listen to command
            add(btnSolutions);
            
            //Exit button
            btnExit = new JButton();
            btnExit.setSize(100,50);
            btnExit.setLocation(50,40);
            btnExit.setText("Exit");
            btnExit.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnExit.setOpaque(true);
            btnExit.setBackground(Color.BLACK);
            btnExit.setAlignmentX(CENTER_ALIGNMENT);
            btnExit.setActionCommand("Exit");                        //Tells button to carry out action
            btnExit.addActionListener(this);                         //Tells button to listen to command
            add(btnExit);
    }
    
    public void actionPerformed(ActionEvent e){
        //If user guide button is pressed, user guide frame is opened
        if(e.getActionCommand().equals("User Guide")){
            //Creating and formatting user guide frame
            JFrameUserGuide fUGuide = new JFrameUserGuide();
            fUGuide.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fUGuide.setSize(1300,850);
            fUGuide.setVisible(true);
            
            //Closing current JFrame
            this.dispose();
        }  
        //If lesson button is pressed, lesson frame is opened
        if(e.getActionCommand().equals("Lesson")){
            //Creating and formatting lesson frame
            JFrameLesson fLesson = new JFrameLesson();
            fLesson.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson.setSize(1300,850);
            fLesson.setVisible(true);
            
            //Closing current JFrame
            this.dispose();
        }  
        //If overview button is pressed, overview frame is opened
        if(e.getActionCommand().equals("Overview")){
            //Creating and formatting overview frame
            JFrameOverview fOverview = new JFrameOverview();
            fOverview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fOverview.setSize(1300,850);
            fOverview.setVisible(true);
            
            //Closing current JFrame
            this.dispose();
        }  
        //If quiz button is pressed, quiz frame is opened
        if(e.getActionCommand().equals("Quiz")){
            //Creating and formatting quiz frame
            JFrameQuiz fQuiz = new JFrameQuiz();
            fQuiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fQuiz.setSize(1300,850);
            fQuiz.setVisible(true);
            
            //Closing current JFrame
            this.dispose();
        } 
        //If solutions button is pressed, solutions frame is opened
        if(e.getActionCommand().equals("Solutions")){
            //Creating and formatting solutions frame
            JFrameSolutions fSolutions = new JFrameSolutions();
            fSolutions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fSolutions.setSize(1300,850);
            fSolutions.setVisible(true);
            
            //Closing current JFrame
            this.dispose();
        } 
        //If exit button is pressed, application is closed
        if(e.getActionCommand().equals("Exit")){
            //Close application
            this.dispose();
        }
    }
}
