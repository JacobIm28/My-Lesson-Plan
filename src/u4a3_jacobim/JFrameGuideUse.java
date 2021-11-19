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
 * User guide - Use
 */
public class JFrameGuideUse extends JFrame implements ActionListener{
        
        //Declaring widgets on JFrame
            JLabel lblTitle;        //Title label
            JButton btnMainMenu;    //Main menu button
            JButton btnUserGuide;   //User guide button
            JTextArea txtAreaUse;   //Use text area
    
    public JFrameGuideUse(){
        
        super("User Guide");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.ORANGE);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(500,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("Use");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 80));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
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
            
            //User guide button
            btnUserGuide = new JButton();
            btnUserGuide.setSize(150,50);
            btnUserGuide.setLocation(50,125);
            btnUserGuide.setText("User Guide");
            btnUserGuide.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnUserGuide.setOpaque(true);
            btnUserGuide.setBackground(Color.BLACK);
            btnUserGuide.setAlignmentX(CENTER_ALIGNMENT);
            btnUserGuide.setActionCommand("User Guide");                   //Tells button to carry out action
            btnUserGuide.addActionListener(this);                         //Tells button to listen to command
            add(btnUserGuide);
            
            //Use text area
            txtAreaUse = new JTextArea();
            txtAreaUse.setSize(1100,725);
            txtAreaUse.setLocation(125,200);
            txtAreaUse.setFont(new Font("Lucida", Font.PLAIN, 20));
            txtAreaUse.setText("Once you open the program, press start."
                    + "\n\nYou will see the main menu, where you can browse through the parts of the lesson.  "
                    + "Simply click on the section you would like to open."
                    + "\n\nIn the User Guide, click on any section you would like to view."
                    + "\n\nIn the Lesson Menu, click on the lesson to access that lesson."
                    + "\n\nThe the overview, you can browse through the key points, then the practice."
                    + "\n\nEnter your answers in the white text fields.  Press check to your answers.  If the field becomes"
                    + " green, the answer is correct, if the field becomes red the answer is wrong, and if the field becomes"
                    + " yellow, the syntax is off a little."
                    + " Press Answers to show the answers."
                    + "\n\nIn the Quiz, enter your answers in the white text fields.  Once you press done, you can no longer"
                    + " change your answers.  Press Calculate to check your score on the quiz.  The fields will become the "
                    + "same colour as the practice."
                    + "\n\nIn the Solutions, press Show to see the answers."
                    + "\n\nFinally, on the main menu, click Exit to exit the program.");
            txtAreaUse.setBackground(Color.ORANGE);
            txtAreaUse.setLineWrap(true);
            txtAreaUse.setWrapStyleWord(true);
            txtAreaUse.setEditable(false);
            add(txtAreaUse);
    }
    public void actionPerformed(ActionEvent e){
        //If main menu button is pressed, main menu is opened
        if(e.getActionCommand().equals("Main Menu")){
            //Creating and formatting frame
            JFrameMenu fMenu = new JFrameMenu();
            fMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fMenu.setSize(1300,850);
            fMenu.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If user guide button is pressed, user guide is opened
        if(e.getActionCommand().equals("User Guide")){
            //Creating and formatting frame
            JFrameUserGuide fUGuide = new JFrameUserGuide();
            fUGuide.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fUGuide.setSize(1300,850);
            fUGuide.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
    }
}

