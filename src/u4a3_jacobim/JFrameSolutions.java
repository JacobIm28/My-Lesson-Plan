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
 * U4A3 - Solutions frame
 */
public class JFrameSolutions extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;            //Title label
        JButton btnMainMenu;        //Main menu button
        JButton btnShow;            //SHow answers button
        JTextArea txtAreaSolutions; //Solutions area
    
    public JFrameSolutions(){
        super("Solutions");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.PINK);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(500,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("Solutions");
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
            
            //Show button
            btnShow = new JButton();
            btnShow.setSize(150,50);
            btnShow.setLocation(50,125);
            btnShow.setText("Show");
            btnShow.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnShow.setOpaque(true);
            btnShow.setBackground(Color.BLACK);
            btnShow.setAlignmentX(CENTER_ALIGNMENT);
            btnShow.setActionCommand("Show");                        //Tells button to carry out action
            btnShow.addActionListener(this);                         //Tells button to listen to command
            add(btnShow);
            
            //Intro text area
            txtAreaSolutions = new JTextArea();
            txtAreaSolutions.setSize(1100,625);
            txtAreaSolutions.setLocation(150,250);
            txtAreaSolutions.setFont(new Font("Lucida", Font.PLAIN, 50));
            txtAreaSolutions.setText("");
            txtAreaSolutions.setBackground(Color.PINK);
            txtAreaSolutions.setLineWrap(true);
            txtAreaSolutions.setWrapStyleWord(true);
            txtAreaSolutions.setEditable(false);
            add(txtAreaSolutions); 
            
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
        
        //Declaring arraylist
            ArrayList<String> strListAnswers = new ArrayList<String>();
            ArrayList<String> strListDisplay = new ArrayList<String>();
        //Adding answers to ArrayList
            Collections.addAll(strListAnswers, "-7 / 4", "96", "8", "x + 2x + 2x - 7x = 2 - 1 - 5", "2", "T", "T", "F");
        
        //If show button is pressed, answers are shown
        if(e.getActionCommand().equals("Show")){
            
            //Declaring variables
                String strAns;      //Answer
                String strDisplay = "";  //Answers to be displayed
            
            //For loop to add answers to a array list
            for(int i = 0; i < 8; i++){
                strAns = (i + 1) + ". " + strListAnswers.get(i);
                strListDisplay.add(strAns);
            }
            //For loop to add elements of display array list to display string
            for(int i = 0; i < strListDisplay.size(); i++){
                strDisplay += strListDisplay.get(i) + "\t";
            }
            txtAreaSolutions.setText(strDisplay);
        }
    }
}
