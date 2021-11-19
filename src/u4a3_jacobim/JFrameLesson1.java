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
 * U4A3 - Operating with exponents
 */
public class JFrameLesson1 extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;        //Title label
        JLabel lblPic;          //Picture
        JButton btnMainMenu;    //Main menu button
        JButton btnLessonMenu;  //Lesson menu button
        JButton btnNext;        //Next screen button
        JLabel lblIntro;        //Intro label
        JTextArea txtAreaIntro; //Intro text area
    
    public JFrameLesson1(){
        super("Lesson 1");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.ORANGE);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(600,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("1. Operating With Exponents");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 40));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Intro label
            lblIntro = new JLabel();
            lblIntro.setSize(600,100);
            lblIntro.setLocation(100,150);
            lblIntro.setText("Introduction");
            lblIntro.setFont(new Font("Times New Roman", Font.BOLD, 40));
            lblIntro.setForeground(Color.BLACK);
            lblIntro.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblIntro);
            
            //Picture
            lblPic = new JLabel();
            lblPic.setLocation(200,425);
            lblPic.setSize(157,115);
            ImageIcon imgPic = new ImageIcon("powers01.gif");
            lblPic.setIcon(imgPic);
            add(lblPic);
            
            //Intro text area
            txtAreaIntro = new JTextArea();
            txtAreaIntro.setSize(1100,625);
            txtAreaIntro.setLocation(200,250);
            txtAreaIntro.setFont(new Font("Lucida", Font.PLAIN, 25));
            txtAreaIntro.setText("Objective: How to operate with exponents."
                    + "\n\nYou will learn the results of situations like these:"
                    + "\n\nx^a * x^b = ?\t\tx^a / x^b = ?\t\t(x^a)^b = ?"
                    + "\n\n\n\n\n\nBase: Number that is being multiplied by the exponent"
                    + "\nExponent: Number of the times that the base is being multiplied"
                    + "\nPower: Base and Exponent combined"
                    + "\nPronounced: 'Base' to the 'Exponent'th power");
            txtAreaIntro.setBackground(Color.ORANGE);
            txtAreaIntro.setLineWrap(true);
            txtAreaIntro.setWrapStyleWord(true);
            txtAreaIntro.setEditable(false);
            add(txtAreaIntro); 
            
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
            JFrameLesson11 fLesson11 = new JFrameLesson11();
            fLesson11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson11.setSize(1300,850);
            fLesson11.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
    }
}
