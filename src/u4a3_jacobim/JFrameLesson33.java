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

/**
 *
 * @author jacobim
 * U4A3 - Solving equations with fractions
 */
public class JFrameLesson33 extends JFrame implements ActionListener{
   
    //Declaring widgets
        JLabel lblTitle;            //Title label
        JButton btnMainMenu;        //Main menu button
        JButton btnLessonMenu;      //Lesson menu button
        JButton btnComplete;        //Complete button
        JButton btnBack;            //Back a screen button
        JTextArea txtAreaFractions; //Equations with fractions area
    
    public JFrameLesson33(){
        super("Lesson 3.3");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.ORANGE);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(600,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("3.3 Equations With Fractions");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 40));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Fractions equations text area
            txtAreaFractions = new JTextArea();
            txtAreaFractions.setSize(1100,625);
            txtAreaFractions.setLocation(220,225);
            txtAreaFractions.setFont(new Font("Lucida", Font.PLAIN, 25));
            txtAreaFractions.setText("To solve equations with fractions, multiply both sides of the equation by the LCM to"
                    + "get rid of the fractions, then proceed to solve the equation as explained before."
                    + "\nEx. (2 - 3x) / 2 = (5 + x) / 5"
                    + "\n\nLCM of 2 and 5 is 10, so multiply both sides by 10"
                    + "\n\t10((2 - 3x) / 2) = 10((5 + x) / 5)"
                    + "\n\nDivide the LCM by the denominator to get rid of it (10 / 2 = 5,10 / 5 = 2)"
                    + "\n\t5(2 - 3x) = 2(5 + x)"
                    + "\n\nSolve equation normally"
                    + "\n\t5(2 - 3x) = 2(5 + x)"
                    + "\n\t10 - 15x = 10 + 2x"
                    + "\n\t 10 - 10 = 2x + 15x"
                    + "\n\t17x / 17 = 0 / 17"
                    + "\n\tx = 0");
            txtAreaFractions.setBackground(Color.ORANGE);
            txtAreaFractions.setLineWrap(true);
            txtAreaFractions.setWrapStyleWord(true);
            txtAreaFractions.setEditable(false);
            add(txtAreaFractions);
            
            //Main menu button
            btnMainMenu = new JButton();
            btnMainMenu.setSize(150,50);
            btnMainMenu.setLocation(50,50);
            btnMainMenu.setText("Main Menu");
            btnMainMenu.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnMainMenu.setOpaque(true);
            btnMainMenu.setBackground(Color.BLACK);
            btnMainMenu.setAlignmentX(CENTER_ALIGNMENT);
            btnMainMenu.setActionCommand("Main Menu");                   //Tells button to carry out action
            btnMainMenu.addActionListener(this);                         //Tells button to listen to command
            add(btnMainMenu);
            
            //Lesson menu button
            btnLessonMenu = new JButton();
            btnLessonMenu.setSize(150,50);
            btnLessonMenu.setLocation(50,125);
            btnLessonMenu.setText("Lesson Menu");
            btnLessonMenu.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnLessonMenu.setOpaque(true);
            btnLessonMenu.setBackground(Color.BLACK);
            btnLessonMenu.setAlignmentX(CENTER_ALIGNMENT);
            btnLessonMenu.setActionCommand("Lesson Menu");                   //Tells button to carry out action
            btnLessonMenu.addActionListener(this);                         //Tells button to listen to command
            add(btnLessonMenu);
            
            //Complete button
            btnComplete = new JButton();
            btnComplete.setSize(150,50);
            btnComplete.setLocation(1100,50);
            btnComplete.setText("Complete");
            btnComplete.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnComplete.setOpaque(true);
            btnComplete.setBackground(Color.BLACK);
            btnComplete.setAlignmentX(CENTER_ALIGNMENT);
            btnComplete.setActionCommand("Complete");                   //Tells button to carry out action
            btnComplete.addActionListener(this);                         //Tells button to listen to command
            add(btnComplete);
            
            //Back button
            btnBack = new JButton();
            btnBack.setSize(150,50);
            btnBack.setLocation(50,200);
            btnBack.setText("Back");
            btnBack.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnBack.setOpaque(true);
            btnBack.setBackground(Color.BLACK);
            btnBack.setAlignmentX(CENTER_ALIGNMENT);
            btnBack.setActionCommand("Back");                   //Tells button to carry out action
            btnBack.addActionListener(this);                         //Tells button to listen to command
            add(btnBack);
    }
    
    public void actionPerformed(ActionEvent e){
        //If main menu button is pressed, main menu is opened
        if(e.getActionCommand().equals("Main Menu")){
            //Creating and formatting user guide frame
            JFrameMenu fMenu = new JFrameMenu();
            fMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fMenu.setSize(1300,850);
            fMenu.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If lesson menu button is pressed, lesson menu is opened
        if(e.getActionCommand().equals("Lesson Menu")){
            //Creating and formatting frame
            JFrameLesson fLessonMenu = new JFrameLesson();
            fLessonMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLessonMenu.setSize(1300,850);
            fLessonMenu.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If complete button is pressed, congratulations screen is opened
        if(e.getActionCommand().equals("Complete")){
            //Creating and formatting frame
            JFrameLessonCongrats fLessonCongrats = new JFrameLessonCongrats();
            fLessonCongrats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLessonCongrats.setSize(1300,850);
            fLessonCongrats.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If back button is pressed, last lesson is opened
        if(e.getActionCommand().equals("Back")){
            //Creating and formatting frame
            JFrameLesson32 fLesson32 = new JFrameLesson32();
            fLesson32.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson32.setSize(1300,850);
            fLesson32.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
    }
}


