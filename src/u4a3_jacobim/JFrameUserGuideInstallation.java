package u4a3_jacobim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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

public class JFrameUserGuideInstallation extends JFrame implements ActionListener{

    //Declaring widgets on JFrame
    JLabel lblTitle;            //Titlelabel
    JButton btnMainMenu;        //Main menu button
    JButton btnUserGuide;       //User guide button
    JTextArea txtAreaPurpose;   //Purpose of progran area

    public JFrameUserGuideInstallation(){

        super("User Guide");             //What's displayed in title bar

        setLayout(null);                    //Setting layout for JFrame

        getContentPane().setBackground(Color.RED);        //Setting background color

        //Formatting widgets
        //Title label
        lblTitle = new JLabel();
        lblTitle.setSize(500,100);
        lblTitle.setLocation(400,50);
        lblTitle.setText("Purpose");
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

        //Purpose of program text area
        txtAreaPurpose = new JTextArea();
        txtAreaPurpose.setSize(1100,425);
        txtAreaPurpose.setLocation(125,250);
        txtAreaPurpose.setFont(new Font("Lucida", Font.PLAIN, 30));
        txtAreaPurpose.setText("Too Install this app, download the files, and press run");
        txtAreaPurpose.setBackground(Color.RED);
        txtAreaPurpose.setLineWrap(true);
        txtAreaPurpose.setWrapStyleWord(true);
        txtAreaPurpose.setEditable(false);
        add(txtAreaPurpose);
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
