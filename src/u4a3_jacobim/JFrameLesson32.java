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
 * U4A3 - Solving equations with multiple steps
 */
public class JFrameLesson32 extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;            //Title label
        JButton btnMainMenu;        //Main menu button
        JButton btnLessonMenu;      //Lesson menu button
        JButton btnNext;            //Next screen button
        JButton btnBack;            //Back a screen button
        JTextArea txtAreaComplex;   //Multiple step equations area
    
    public JFrameLesson32(){
        super("Lesson 3.2");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.ORANGE);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(600,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("3.2 Multiple Step Equations");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 40));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Multiple step equations text area
            txtAreaComplex = new JTextArea();
            txtAreaComplex.setSize(1100,625);
            txtAreaComplex.setLocation(220,150);
            txtAreaComplex.setFont(new Font("Lucida", Font.PLAIN, 25));
            txtAreaComplex.setText("To solve equations with multiple terms, group the variable terms on one side and "
                    + "the constant terms on the other."
                    + "\nIf there are parentheses, expand using either distribution or FOIL"
                    + "\n\nNOTE: ^2 is the opposite of √"
                    + "\n\nEx. (x + 5)(x -4) = x^2 - 9"
                    + "\nExpand left side using FOIL"
                    + "\n\tx^2 + x - 20 = x^2 - 9"
                    + "\nPut all variable terms on the left and constant terms on the right"
                    + "\n\tx^2 + x - 20 + 20 - x^2 = x^2 - x^ 2 - 9 + 20"
                    + "\nThe -20 and +20 cancel on the left, and the +x^2 and -x^2 cancel on both sides"
                    + "\n\tx = -9 + 20"
                    + "\nSolve for x"
                    + "\n\tx = 11"
                    + "\nVerify:"
                    + "\n\t(11 + 5)(11 - 4) = 11^2 - 9"
                    + "\n\t           16(7) = 121 - 9"
                    + "\n               112 = 112\tL.S. = R.S.");
            txtAreaComplex.setBackground(Color.ORANGE);
            txtAreaComplex.setLineWrap(true);
            txtAreaComplex.setWrapStyleWord(true);
            txtAreaComplex.setEditable(false);
            add(txtAreaComplex);
            
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
            JFrameLesson33 fLesson33 = new JFrameLesson33();
            fLesson33.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson33.setSize(1300,850);
            fLesson33.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If back button is pressed, last lesson is opened
        if(e.getActionCommand().equals("Back")){
            //Creating and formatting frame
            JFrameLesson31 fLesson31 = new JFrameLesson31();
            fLesson31.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson31.setSize(1300,850);
            fLesson31.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
    }
}


