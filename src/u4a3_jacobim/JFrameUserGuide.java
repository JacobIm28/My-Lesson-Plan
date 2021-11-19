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
 * U4A3 - User Guide
 */
public class JFrameUserGuide extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;            //Title label
        JLabel lblPic;              //Picture label
        JButton btnMainMenu;        //Main menu button
        JButton btnInstallation;    //Installation button
        JButton btnPurpose;         //Purpose button
        JButton btnUse;             //Use button
                
    public JFrameUserGuide(){
        super("User Guide");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.CYAN);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(500,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("User Guide");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 80));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Picture
            lblPic = new JLabel();
            lblPic.setLocation(522,600);
            lblPic.setSize(256,256);
            ImageIcon imgGuide = new ImageIcon("UserguidePNG.png");
            lblPic.setIcon(imgGuide);
            add(lblPic);
            
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
            
            //Installation button
            btnInstallation = new JButton();
            btnInstallation.setSize(1000,75);
            btnInstallation.setLocation(150,200);
            btnInstallation.setText("Installation - How do I install and run this program?");
            btnInstallation.setFont(new Font("Lucida", Font.PLAIN, 35));
            btnInstallation.setOpaque(true);
            btnInstallation.setBackground(Color.BLACK);
            btnInstallation.setAlignmentX(CENTER_ALIGNMENT);
            btnInstallation.setActionCommand("Installation");                //Tells button to carry out action
            btnInstallation.addActionListener(this);                         //Tells button to listen to command
            add(btnInstallation);
            
            //Purpose button
            btnPurpose = new JButton();
            btnPurpose.setSize(1000,75);
            btnPurpose.setLocation(150,350);
            btnPurpose.setText("Purpose - What is the purpose of this program?");
            btnPurpose.setFont(new Font("Lucida", Font.PLAIN, 35));
            btnPurpose.setOpaque(true);
            btnPurpose.setBackground(Color.BLACK);
            btnPurpose.setAlignmentX(CENTER_ALIGNMENT);
            btnPurpose.setActionCommand("Purpose");                     //Tells button to carry out action
            btnPurpose.addActionListener(this);                         //Tells button to listen to command
            add(btnPurpose);
            
            //Use button
            btnUse = new JButton();
            btnUse.setSize(1000,75);
            btnUse.setLocation(150,500);
            btnUse.setText("Use - How do I use this program?");
            btnUse.setFont(new Font("Lucida", Font.PLAIN, 35));
            btnUse.setOpaque(true);
            btnUse.setBackground(Color.BLACK);
            btnUse.setAlignmentX(CENTER_ALIGNMENT);
            btnUse.setActionCommand("Use");                         //Tells button to carry out action
            btnUse.addActionListener(this);                         //Tells button to listen to command
            add(btnUse);
        
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
        //If installation button is pressed, installation frame is opened
        if(e.getActionCommand().equals("Installation")){
            //Creating and formatting frame
            JFrameUserGuideInstallation fInstallation = new JFrameUserGuideInstallation();
            fInstallation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fInstallation.setSize(1300,850);
            fInstallation.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If purpose button is pressed, purpose frame is opened
        if(e.getActionCommand().equals("Purpose")){
            //Creating and formatting frame
            JFrameGuidePurpose fPurpose = new JFrameGuidePurpose();
            fPurpose.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fPurpose.setSize(1300,850);
            fPurpose.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If use button is pressed, use frame is opened
        if(e.getActionCommand().equals("Use")){
            //Creating and formatting frame
            JFrameGuideUse fUse = new JFrameGuideUse();
            fUse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fUse.setSize(1300,850);
            fUse.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        
    }
}
