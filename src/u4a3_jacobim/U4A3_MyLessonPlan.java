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
 * August 11th 2019
 * U4A3 - My Lesson Plan
 * Writing an application for an educational tool to teach a unit to a grade 9 student
 */
public class U4A3_MyLessonPlan extends JFrame implements ActionListener{
    
    //Declaring widgets on JFrameWelcome
        JLabel lblTitle;            //Title label
        JLabel lblWelcome;          //Welcome label
        JLabel lblTopic;            //Topic label
        JLabel lblPic;              //Picture label
        JButton btnStart;           //Start application button
    
    public U4A3_MyLessonPlan(){
        super("Welcome");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.RED);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(700,200);
            lblTitle.setLocation(300,275);
            lblTitle.setText("MyLessonPlan");
            lblTitle.setFont(new Font("Lucida", Font.BOLD, 80));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Welcome label
            lblWelcome = new JLabel();
            lblWelcome.setSize(300,200);
            lblWelcome.setLocation(550,375);
            lblWelcome.setText("Welcome to");
            lblWelcome.setFont(new Font("Lucida", Font.PLAIN, 35));
            lblWelcome.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblWelcome);
            
            //Topic label
            lblTopic = new JLabel();
            lblTopic.setSize(800,250);
            lblTopic.setLocation(325,425);
            lblTopic.setText("Number Sense and Algebra");
            lblTopic.setFont(new Font("Lucida", Font.PLAIN, 50));
            lblTopic.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTopic);
            
            //Picture label
            lblPic = new JLabel();
            lblPic.setSize(256,256);
            lblPic.setLocation(522,20);
            ImageIcon imgAlgebra = new ImageIcon("algebra.jpg");
            lblPic.setIcon(imgAlgebra);
            add(lblPic);
            
            //Start button
            btnStart = new JButton();
            btnStart.setSize(200,75);
            btnStart.setLocation(550,700);
            btnStart.setText("Start");
            btnStart.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnStart.setOpaque(true);
            btnStart.setBackground(Color.BLACK);
            btnStart.setAlignmentX(CENTER_ALIGNMENT);
            btnStart.setActionCommand("Start");                       //Tells button to carry out action
            btnStart.addActionListener(this);                         //Tells button to listen to command
            add(btnStart);
    }

    public void actionPerformed(ActionEvent e){
        //If start button is pressed, go to menu screen
        if(e.getActionCommand().equals("Start")){
            
            //Opening menu JFrame
            JFrameMenu fMenu = new JFrameMenu();
            fMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fMenu.setSize(1300,850);
            fMenu.setVisible(true);
            
            //Closing current JFrame
            this.dispose();
        }  
    }
}

