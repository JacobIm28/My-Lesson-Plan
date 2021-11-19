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
 * U4A3 - Overview frame
 */
public class JFrameOverview extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;            //Title label
        JLabel lblPic;              //Picture label
        JButton btnMainMenu;        //Main menu button
        JTextArea txtAreaOverview;  //Overview area
        JButton btnPractice;        //Practice button
    
    public JFrameOverview(){
        super("Overview");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.GREEN);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(500,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("Overview");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 80));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Picture
            lblPic = new JLabel();
            lblPic.setLocation(850,50);
            lblPic.setSize(355,276);
            ImageIcon imgPic = new ImageIcon("marketing-overview.png");
            lblPic.setIcon(imgPic);
            add(lblPic);
            
            //Fractions equations text area
            txtAreaOverview = new JTextArea();
            txtAreaOverview.setSize(1100,500);
            txtAreaOverview.setLocation(100,175);
            txtAreaOverview.setFont(new Font("Lucida", Font.PLAIN, 20));
            txtAreaOverview.setText("Key points:"
                    + "\n\n\t- When multiplying powers, the exponents are added"
                    + "\n\n\t- When dividig powers, the exponents are subtracted"
                    + "\n\n\t- When power is to the power of another exponent, multiply exponents"
                    + "\n\n\t- When rearranging a formula, use opposite operations to isolate the wanted variable"
                    + "\n\n\t- When writing your own equation, you must declare x using a let statement"
                    + "\n\n\t- When solving equations, use opposite operations to isolate unknown value"
                    + "\n\n\t- When solving equations with multiple steps, group all variable terms on one side, and the "
                    + "\n\tconstant terms on the other"
                    + "\n\n\t- When solving equations with fractions, multiply both sides by the LCM of the denominators");
            txtAreaOverview.setBackground(Color.GREEN);
            txtAreaOverview.setLineWrap(true);
            txtAreaOverview.setWrapStyleWord(true);
            txtAreaOverview.setEditable(false);
            add(txtAreaOverview);
            
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
            
            //Practice button
            btnPractice = new JButton();
            btnPractice.setSize(150,50);
            btnPractice.setLocation(1050,675);
            btnPractice.setText("Practice");
            btnPractice.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnPractice.setOpaque(true);
            btnPractice.setBackground(Color.BLACK);
            btnPractice.setAlignmentX(CENTER_ALIGNMENT);
            btnPractice.setActionCommand("Practice");                   //Tells button to carry out action
            btnPractice.addActionListener(this);                         //Tells button to listen to command
            add(btnPractice);
        
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
        //If practice button is pressed, practice is opened
        if(e.getActionCommand().equals("Practice")){
            //Creating and formatting user guide frame
            JFrameOverviewPractice fPractice = new JFrameOverviewPractice();
            fPractice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fPractice.setSize(1300,850);
            fPractice.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
    }
}