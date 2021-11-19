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
 * U4A3 - Lesson frame
 */
public class JFrameLesson extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;        //Title label
        JLabel lblPic;          //Picture label
        JButton btnMainMenu;    //Main menu button
        JButton btnExponents;   //Operating with exponents button
        JButton btnExponents1;  //Multiplying exponents
        JButton btnExponents2;  //Dividing exponents
        JButton btnExponents3;  //Exponents to the power of exponents
        JButton btnCreating;    //Creating equations
        JButton btnFormula;     //Creating equations with formulas
        JButton btnAlgebra;     //Creating equations with algebra
        JButton btnEquations;   //Solving equations
        JButton btnSimple;      //Solving simple equations
        JButton btnComplex;     //Solving equations with multiple steps
        JButton btnFractions;   //Solving equations with fractions
    
    public JFrameLesson(){
        super("Lesson");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.MAGENTA);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(500,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("Lesson Menu");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 80));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Picture
            lblPic = new JLabel();
            lblPic.setLocation(181,525);
            lblPic.setSize(937,365);
            ImageIcon imgPic = new ImageIcon("Equations.png");
            lblPic.setIcon(imgPic);
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
            
            //Operating with exponents button
            btnExponents = new JButton();
            btnExponents.setSize(350,50);
            btnExponents.setLocation(75,200);
            btnExponents.setText("1. Operating With Exponents");
            btnExponents.setFont(new Font("Lucida", Font.PLAIN, 24));
            btnExponents.setOpaque(true);
            btnExponents.setBackground(Color.BLACK);
            btnExponents.setActionCommand("Exponents");                   //Tells button to carry out action
            btnExponents.addActionListener(this);                         //Tells button to listen to command
            add(btnExponents);
            
            //Multiplying exponents button
            btnExponents1 = new JButton();
            btnExponents1.setSize(300,50);
            btnExponents1.setLocation(140,275);
            btnExponents1.setText("1.1 Multiplying Exponents");
            btnExponents1.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnExponents1.setOpaque(true);
            btnExponents1.setBackground(Color.BLACK);
            btnExponents1.setActionCommand("Exponents1");                   //Tells button to carry out action
            btnExponents1.addActionListener(this);                         //Tells button to listen to command
            add(btnExponents1);
            
            //Dividing exponents button
            btnExponents2 = new JButton();
            btnExponents2.setSize(300,50);
            btnExponents2.setLocation(140,350);
            btnExponents2.setText("1.2 Dividing Exponents");
            btnExponents2.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnExponents2.setOpaque(true);
            btnExponents2.setBackground(Color.BLACK);
            btnExponents2.setActionCommand("Exponents2");                   //Tells button to carry out action
            btnExponents2.addActionListener(this);                         //Tells button to listen to command
            add(btnExponents2);
            
            //Exponents to the power of exponents button
            btnExponents3 = new JButton();
            btnExponents3.setSize(350,50);
            btnExponents3.setLocation(140,425);
            btnExponents3.setText("1.3 To the power of exponents");
            btnExponents3.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnExponents3.setOpaque(true);
            btnExponents3.setBackground(Color.BLACK);
            btnExponents3.setActionCommand("Exponents3");                   //Tells button to carry out action
            btnExponents3.addActionListener(this);                         //Tells button to listen to command
            add(btnExponents3);
            
            //Creating equations button
            btnCreating = new JButton();
            btnCreating.setSize(350,50);
            btnCreating.setLocation(475,200);
            btnCreating.setText("2. Creating Equations");
            btnCreating.setFont(new Font("Lucida", Font.PLAIN, 24));
            btnCreating.setOpaque(true);
            btnCreating.setBackground(Color.BLACK);
            btnCreating.setActionCommand("Creating");                   //Tells button to carry out action
            btnCreating.addActionListener(this);                         //Tells button to listen to command
            add(btnCreating);
            
            //Creating equations with formulas button
            btnFormula = new JButton();
            btnFormula.setSize(300,50);
            btnFormula.setLocation(540,275);
            btnFormula.setText("2.1 Equations With Formulas");
            btnFormula.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnFormula.setOpaque(true);
            btnFormula.setBackground(Color.BLACK);
            btnFormula.setActionCommand("Formula");                   //Tells button to carry out action
            btnFormula.addActionListener(this);                         //Tells button to listen to command
            add(btnFormula);
            
            //Creating equations with algebra button
            btnAlgebra = new JButton();
            btnAlgebra.setSize(300,50);
            btnAlgebra.setLocation(540,350);
            btnAlgebra.setText("2.2 Equations With Algebra");
            btnAlgebra.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnAlgebra.setOpaque(true);
            btnAlgebra.setBackground(Color.BLACK);
            btnAlgebra.setActionCommand("Algebra");                   //Tells button to carry out action
            btnAlgebra.addActionListener(this);                         //Tells button to listen to command
            add(btnAlgebra);
            
            //Solving equations button
            btnEquations = new JButton();
            btnEquations.setSize(350,50);
            btnEquations.setLocation(875,200);
            btnEquations.setText("3. Solving Equations");
            btnEquations.setFont(new Font("Lucida", Font.PLAIN, 24));
            btnEquations.setOpaque(true);
            btnEquations.setBackground(Color.BLACK);
            btnEquations.setActionCommand("Equations");                   //Tells button to carry out action
            btnEquations.addActionListener(this);                         //Tells button to listen to command
            add(btnEquations);
            
            //Solving simple equations button
            btnSimple = new JButton();
            btnSimple.setSize(300,50);
            btnSimple.setLocation(940,275);
            btnSimple.setText("3.1 Simple Equations");
            btnSimple.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnSimple.setOpaque(true);
            btnSimple.setBackground(Color.BLACK);
            btnSimple.setActionCommand("Simple");                   //Tells button to carry out action
            btnSimple.addActionListener(this);                         //Tells button to listen to command
            add(btnSimple);
            
            //Solving complex equations button
            btnComplex = new JButton();
            btnComplex.setSize(300,50);
            btnComplex.setLocation(940,350);
            btnComplex.setText("3.2 Multiple step equations");
            btnComplex.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnComplex.setOpaque(true);
            btnComplex.setBackground(Color.BLACK);
            btnComplex.setActionCommand("Complex");                   //Tells button to carry out action
            btnComplex.addActionListener(this);                         //Tells button to listen to command
            add(btnComplex);
            
            //Solving equations with fractions button
            btnFractions = new JButton();
            btnFractions.setSize(350,50);
            btnFractions.setLocation(940,425);
            btnFractions.setText("3.3 Equations With Fractions");
            btnFractions.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnFractions.setOpaque(true);
            btnFractions.setBackground(Color.BLACK);
            btnFractions.setActionCommand("Fractions");                   //Tells button to carry out action
            btnFractions.addActionListener(this);                         //Tells button to listen to command
            add(btnFractions);
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
        //If Operating with exponents button is pressed, Lesson 1 is opened
        if(e.getActionCommand().equals("Exponents")){
            //Creating and formatting frame
            JFrameLesson1 fLesson1 = new JFrameLesson1();
            fLesson1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson1.setSize(1300,850);
            fLesson1.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If multiplying exponents button is pressed, Lesson 1.1 is opened
        if(e.getActionCommand().equals("Exponents1")){
            //Creating and formatting frame
            JFrameLesson11 fLesson11 = new JFrameLesson11();
            fLesson11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson11.setSize(1300,850);
            fLesson11.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If dividing exponents button is pressed, Lesson 1.2 is opened
        if(e.getActionCommand().equals("Exponents2")){
            //Creating and formatting frame
            JFrameLesson12 fLesson12 = new JFrameLesson12();
            fLesson12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson12.setSize(1300,850);
            fLesson12.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If exponents to the power of exponents button is pressed, Lesson 1.3 is opened
        if(e.getActionCommand().equals("Exponents3")){
            //Creating and formatting frame
            JFrameLesson13 fLesson13 = new JFrameLesson13();
            fLesson13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson13.setSize(1300,850);
            fLesson13.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If creating equations button is pressed, Lesson 2 is opened
        if(e.getActionCommand().equals("Creating")){
            //Creating and formatting frame
            JFrameLesson2 fLesson2 = new JFrameLesson2();
            fLesson2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson2.setSize(1300,850);
            fLesson2.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If creating equations with formulas button is pressed, Lesson 2.1 is opened
        if(e.getActionCommand().equals("Formula")){
            //Creating and formatting frame
            JFrameLesson21 fLesson21 = new JFrameLesson21();
            fLesson21.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson21.setSize(1300,850);
            fLesson21.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If creating equations with algebra button is pressed, Lesson 2.2 is opened
        if(e.getActionCommand().equals("Algebra")){
            //Creating and formatting frame
            JFrameLesson22 fLesson22 = new JFrameLesson22();
            fLesson22.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson22.setSize(1300,850);
            fLesson22.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If solving equations button is pressed, Lesson 3 is opened
        if(e.getActionCommand().equals("Equations")){
            //Creating and formatting frame
            JFrameLesson3 fLesson3 = new JFrameLesson3();
            fLesson3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson3.setSize(1300,850);
            fLesson3.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If solving simple equations button is pressed, Lesson 3.1 is opened
        if(e.getActionCommand().equals("Simple")){
            //Creating and formatting frame
            JFrameLesson31 fLesson31 = new JFrameLesson31();
            fLesson31.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson31.setSize(1300,850);
            fLesson31.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If solving complex equations button is pressed, Lesson 3.2 is opened
        if(e.getActionCommand().equals("Complex")){
            //Creating and formatting frame
            JFrameLesson32 fLesson32 = new JFrameLesson32();
            fLesson32.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson32.setSize(1300,850);
            fLesson32.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        //If solving equations with fractions button is pressed, Lesson 3.3 is opened
        if(e.getActionCommand().equals("Fractions")){
            //Creating and formatting frame
            JFrameLesson33 fLesson33 = new JFrameLesson33();
            fLesson33.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fLesson33.setSize(1300,850);
            fLesson33.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
    }
}