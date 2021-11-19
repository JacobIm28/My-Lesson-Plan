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
 * U4A3 - Solving simple equations
 */
public class JFrameLesson31 extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;            //Title label
        JLabel lblPic;              //Picture
        JButton btnMainMenu;        //Main menu button
        JButton btnLessonMenu;      //Lesson menu button
        JButton btnNext;            //Next screen button
        JButton btnBack;            //Back a screen button
        JTextArea txtAreaSimple;    //Solving simple equations area
    
    public JFrameLesson31(){
        super("Lesson 3.1");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.ORANGE);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(600,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("3.1 Solving Simple Equations");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 40));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Picture
            lblPic = new JLabel();
            lblPic.setLocation(10,300);
            lblPic.setSize(118,234);
            ImageIcon imgPic = new ImageIcon("algebra.gif");
            lblPic.setIcon(imgPic);
            add(lblPic);
            
            //Creating equations text area
            txtAreaSimple = new JTextArea();
            txtAreaSimple.setSize(1100,625);
            txtAreaSimple.setLocation(220,150);
            txtAreaSimple.setFont(new Font("Lucida", Font.PLAIN, 25));
            txtAreaSimple.setText("RECALL: Addition (+) and Subtraction (-) are opposite operations"
                    + "\nMultiplication (*) and Division (/) are opposite operations"
                    + "\n\nTo solve for the unknown variable, you must isolate it."
                    + "\nSince equations are like balances, everything you do to the left side, you must do to the right side"
                    + "\nTherefore to isolate a variable, you must move all the numbers to the right side."
                    + "\nTo do that, you use the opposite operation with a number on both sides."
                    + "\nThen, on one side, the operations cancel, and you are left with the number on the other side "
                    + "with the opposite operation from the original"
                    + "\n\nEx. x + 2 = 9"
                    + "\nTo isolate x, use opposite operation on same number (-2) to both sides"
                    + "\n\t    x + 2 - 2 = 9 - 2 "
                    + "\nOn the side with x, the + 2 and - 2 cancel each other out."
                    + "\n\t    x = 9 - 2"
                    + "\nThen, you can simply solve 9 - 2, to find the value of x."
                    + "\n\t    x = 7"
                    + "\n\nTo verify your solution, substitute your answer into the equation and check equation"
                    + "\nL.S. = x + 2 --> L.S. = 7 + 2 --> L.S. = 9"
                    + "\nR.S. = 9\t\tL.S = R.S");
            txtAreaSimple.setBackground(Color.ORANGE);
            txtAreaSimple.setLineWrap(true);
            txtAreaSimple.setWrapStyleWord(true);
            txtAreaSimple.setEditable(false);
            add(txtAreaSimple);
            
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
            
            //Next button
            btnNext = new JButton();
            btnNext.setSize(150,50);
            btnNext.setLocation(1100,50);
            btnNext.setText("Next");
            btnNext.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnNext.setOpaque(true);
            btnNext.setBackground(Color.BLACK);
            btnNext.setAlignmentX(CENTER_ALIGNMENT);
            btnNext.setActionCommand("Next");                   //Tells button to carry out action
            btnNext.addActionListener(this);                         //Tells button to listen to command
            add(btnNext);
            
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
        //If Next button is pressed, next lesson is opened
        if(e.getActionCommand().equals("Next")){
            //Creating and formatting frame
            JFrameLesson32 fLesson32 = new JFrameLesson32();
            fLesson32.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson32.setSize(1300,850);
            fLesson32.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If back button is pressed, last lesson is opened
        if(e.getActionCommand().equals("Back")){
            //Creating and formatting frame
            JFrameLesson3 fLesson3 = new JFrameLesson3();
            fLesson3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson3.setSize(1300,850);
            fLesson3.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
    }
}

