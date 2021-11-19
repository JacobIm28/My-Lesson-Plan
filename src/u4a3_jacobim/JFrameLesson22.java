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
 * U4A3 - Creating equations with algebra
 */
public class JFrameLesson22 extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;            //Title label
        JButton btnMainMenu;        //Main menu button
        JButton btnLessonMenu;      //Lesson menu button
        JButton btnNext;            //Next screen button
        JButton btnBack;            //Back a screen button
        JTextArea txtAreaAlgebra;   //Creating equations with algebra area
    
    public JFrameLesson22(){
        super("Lesson 2.2");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.ORANGE);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(600,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("2.2 Equations With Algebra");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 40));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Creating equations with algebra text area
            txtAreaAlgebra = new JTextArea();
            txtAreaAlgebra.setSize(1100,625);
            txtAreaAlgebra.setLocation(250,250);
            txtAreaAlgebra.setFont(new Font("Lucida", Font.PLAIN, 25));
            txtAreaAlgebra.setText("Given a problem, define a variable and solve for it."
                    + "\n\nSeven less than three times a number is 14."
                    + "\n\nThe first step is to write a let statement - This is done to define a variable"
                    + "\n\tLet x be a number"
                    + "\n\nTherefore, three times a number would be 3x, and seven less, -7, so"
                    + "\n\t3 * x - 7 = 14"
                    + "\n\nYou will learn in the next lesson how to solve equations like these"
                    + "\nFor now, remember how to rearrange and create algebraic equations");
            txtAreaAlgebra.setBackground(Color.ORANGE);
            txtAreaAlgebra.setLineWrap(true);
            txtAreaAlgebra.setWrapStyleWord(true);
            txtAreaAlgebra.setEditable(false);
            add(txtAreaAlgebra);
            
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
            JFrameLesson3 fLesson3 = new JFrameLesson3();
            fLesson3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson3.setSize(1300,850);
            fLesson3.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If back button is pressed, last lesson is opened
        if(e.getActionCommand().equals("Back")){
            //Creating and formatting frame
            JFrameLesson21 fLesson21 = new JFrameLesson21();
            fLesson21.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson21.setSize(1300,850);
            fLesson21.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
    }
}
