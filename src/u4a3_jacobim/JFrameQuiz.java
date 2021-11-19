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
import java.text.DecimalFormat;
import static u4a3_jacobim.JFrameOverviewPractice.isCorrect;

/**
 *
 * @author jacobim
 * U4A3 - Quiz frame
 */
public class JFrameQuiz extends JFrame implements ActionListener{
    
    //Delcaring widgets
        JLabel lblTitle;            //Title label
        JLabel lblScore;            //Score label
        JButton btnMainMenu;        //Main menu button
        JButton btnDone;            //Main menu button
        JButton btnCalculate;       //Calculate button
        JTextArea txtAreaQuestions1;//1st row Questions text area
        JTextField txtQ1;           //Q1 answer field
        JTextField txtQ2;           //Q2 answer field   
        JTextField txtQ3;           //Q3 answer field
        JTextArea txtAreaQuestions2;//2nd row questions area
        JTextField txtQ4;          //Q4a answer field
        JTextField txtQ5;          //Q4b answer field
        JTextArea txtAreaQuestions3;//3rd rwo questions area
        JTextField txtQ6;           //Q5 field
        JTextField txtQ7;           //Q6 field
        JTextField txtQ8;           //Q7 field
    
    public JFrameQuiz(){
        super("Quiz");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.BLUE);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(500,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("Quiz");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 80));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Score label
            lblScore = new JLabel();
            lblScore.setSize(700,100);
            lblScore.setLocation(200,725);
            lblScore.setText("");
            lblScore.setFont(new Font("Times New Roman", Font.BOLD, 50));
            lblScore.setForeground(Color.BLACK);
            lblScore.setOpaque(true);
            lblScore.setHorizontalAlignment(SwingConstants.CENTER);
            lblScore.setVisible(false);
            add(lblScore);
            
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
            btnMainMenu.setVisible(false);                               //Hides button
            btnMainMenu.setEnabled(false);
            add(btnMainMenu);
            
            //Done quiz button
            btnDone = new JButton();
            btnDone.setSize(150,50);
            btnDone.setLocation(50,125);
            btnDone.setText("Done");
            btnDone.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnDone.setOpaque(true);
            btnDone.setBackground(Color.BLACK);
            btnDone.setAlignmentX(CENTER_ALIGNMENT);
            btnDone.setActionCommand("Done");                        //Tells button to carry out action
            btnDone.addActionListener(this);                         //Tells button to listen to command
            add(btnDone);
            
            //Calculate button
            btnCalculate = new JButton();
            btnCalculate.setSize(150,50);
            btnCalculate.setLocation(1050,125);
            btnCalculate.setText("Calculate");
            btnCalculate.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnCalculate.setOpaque(true);
            btnCalculate.setBackground(Color.BLACK);
            btnCalculate.setAlignmentX(CENTER_ALIGNMENT);
            btnCalculate.setActionCommand("Calculate");                   //Tells button to carry out action
            btnCalculate.addActionListener(this);                         //Tells button to listen to command
            btnCalculate.setVisible(false);
            btnCalculate.setEnabled(false);
            add(btnCalculate); 

            //Questions 1 text area
            txtAreaQuestions1 = new JTextArea();
            txtAreaQuestions1.setSize(1100,50);
            txtAreaQuestions1.setLocation(100,200);
            txtAreaQuestions1.setFont(new Font("Lucida", Font.PLAIN, 18));
            txtAreaQuestions1.setText("Solve for x. Write answers as integer or fraction."
                    + "\n1. (2x - 1) / 10 - (3x + 2) / 5 = 7 / 35\t2. 3x / 2 = 3^2 * 4^2\t3. x^2 = 4 * 2^4");
            txtAreaQuestions1.setBackground(Color.BLUE);
            txtAreaQuestions1.setLineWrap(true);
            txtAreaQuestions1.setWrapStyleWord(true);
            txtAreaQuestions1.setEditable(false);
            add(txtAreaQuestions1);
            
            //Q1 answer field
            txtQ1 = new JTextField();
            txtQ1.setSize(100,40);
            txtQ1.setLocation(100,250);
            txtQ1.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ1.setBackground(Color.WHITE);
            add(txtQ1);
            
            //Q2 answer field
            txtQ2 = new JTextField();
            txtQ2.setSize(100,40);
            txtQ2.setLocation(500,250);
            txtQ2.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ2.setBackground(Color.WHITE);
            add(txtQ2);
            
            //Q3 answer field
            txtQ3 = new JTextField();
            txtQ3.setSize(100,40);
            txtQ3.setLocation(800,250);
            txtQ3.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ3.setBackground(Color.WHITE);
            add(txtQ3);
            
            //Questions 2 text area
            txtAreaQuestions2 = new JTextArea();
            txtAreaQuestions2.setSize(1100,80);
            txtAreaQuestions2.setLocation(100,300);
            txtAreaQuestions2.setFont(new Font("Lucida", Font.PLAIN, 18));
            txtAreaQuestions2.setText("4. + 5.A triangle has sides x, 2x + 1 and 2x + 5.  The perimeter is 7x + 2.  Find"
                    + " the length of the shortest side.  Enter the expanded equation(Q4), with the variable terms on the left and"
                    + " the constant terms on the right, in the left field, and your final answer(Q5) in the right field."
                    + " Make sure you use spaces in between operations.");
            txtAreaQuestions2.setBackground(Color.BLUE);
            txtAreaQuestions2.setLineWrap(true);
            txtAreaQuestions2.setWrapStyleWord(true);
            txtAreaQuestions2.setEditable(false);
            add(txtAreaQuestions2);
            
            //Q4 answer field
            txtQ4 = new JTextField();
            txtQ4.setSize(300,40);
            txtQ4.setLocation(100,400);
            txtQ4.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ4.setBackground(Color.WHITE);
            add(txtQ4);
            
            //Q5 answer field
            txtQ5 = new JTextField();
            txtQ5.setSize(100,40);
            txtQ5.setLocation(500,400);
            txtQ5.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ5.setBackground(Color.WHITE);
            add(txtQ5);
            
            //Questions 3 text area
            txtAreaQuestions3 = new JTextArea();
            txtAreaQuestions3.setSize(1100,80);
            txtAreaQuestions3.setLocation(100,500);
            txtAreaQuestions3.setFont(new Font("Lucida", Font.PLAIN, 18));
            txtAreaQuestions3.setText("Verify the equations below, and enter (T)True or (F)False"
                    + "\n6. x = 6\t\t7. x = -3\t\t8. x = 9 / 4"
                    + "\n   2x - 7 = 5\t\t   x / 3 - 7 = -8\t\t   10x / 3 = 15");
            txtAreaQuestions3.setBackground(Color.BLUE);
            txtAreaQuestions3.setLineWrap(true);
            txtAreaQuestions3.setWrapStyleWord(true);
            txtAreaQuestions3.setEditable(false);
            add(txtAreaQuestions3);
            
            //Q6 answer field
            txtQ6 = new JTextField();
            txtQ6.setSize(100,40);
            txtQ6.setLocation(100,600);
            txtQ6.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ6.setBackground(Color.WHITE);
            add(txtQ6);
            
            //Q7 answer field
            txtQ7 = new JTextField();
            txtQ7.setSize(100,40);
            txtQ7.setLocation(500,600);
            txtQ7.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ7.setBackground(Color.WHITE);
            add(txtQ7);
            
            //Q8 answer field
            txtQ8 = new JTextField();
            txtQ8.setSize(100,40);
            txtQ8.setLocation(800,600);
            txtQ8.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ8.setBackground(Color.WHITE);
            add(txtQ8);
        
    }

    /**
     * 
     * @param intCorrect is the integer for the number of questions correct
     * @param intNumOfQ is the integer for the number of questions 
     * @return the results, based of integers inputted
     */
    public static String strScore(int intCorrect, int intNumOfQ){

        DecimalFormat dfOnedp = new DecimalFormat("0.0");
        
        //Declaring variables
            double dblPercent;          //Percentage mark
            String strPercent;          //Percentage mark as a string
            String strResults;          //Overall results
            double dblCorrect;          //Number of correct answers as a double
            
        dblCorrect = (double)(intCorrect);
        
        //Calculating percentage mark
        dblPercent = dblCorrect / intNumOfQ * 100;
        //Converting to string
        strPercent = dfOnedp.format(dblPercent) + "%";
        
        //Formatting string to be displayed
        strResults = intCorrect + " / " + intNumOfQ + " or " + strPercent;
        
        return strResults;
    }
    
    public void actionPerformed(ActionEvent e){
        //Declaring global variables
            int intScore = 0;           //Counter to count how many questions are correct
        
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
        //If done button is pressed, quiz is done
        if(e.getActionCommand().equals("Done")){
            //Enables main menu button
            btnMainMenu.setVisible(true);
            btnMainMenu.setEnabled(true);
            btnCalculate.setVisible(true);
            btnCalculate.setEnabled(true);
            
            //Disbables text fields
            txtQ1.setEnabled(false);
            txtQ2.setEnabled(false);
            txtQ3.setEnabled(false);
            txtQ4.setEnabled(false);
            txtQ5.setEnabled(false);
            txtQ6.setEnabled(false);
            txtQ7.setEnabled(false);
            txtQ8.setEnabled(false);
        }
        
        //Declaring arraylist
            ArrayList<String> strListAnswers = new ArrayList<String>();
        //Adding answers to ArrayList
            Collections.addAll(strListAnswers, "-7 / 4", "96", "8", "x + 2x + 2x - 7x = 2 - 1 - 5", "2", "T", "T", "F");
    
        //If Calculate button is pressed, score is calculated
        if(e.getActionCommand().equals("Calculate")){
            //Presetting answers to wrong
            txtQ1.setBackground(Color.RED);
            txtQ1.setBackground(Color.RED);
            txtQ2.setBackground(Color.RED);
            txtQ3.setBackground(Color.RED);
            txtQ4.setBackground(Color.RED);
            txtQ5.setBackground(Color.RED);
            txtQ6.setBackground(Color.RED);
            txtQ7.setBackground(Color.RED);
            txtQ8.setBackground(Color.RED);
            
            //If answers are right, text fields are set to green, and score is counted
            if(isCorrect(strListAnswers,txtQ1.getText(),1) == true){
                txtQ1.setBackground(Color.GREEN);
                intScore += 1;
            }
            if(isCorrect(strListAnswers,txtQ2.getText(),2) == true){
                txtQ2.setBackground(Color.GREEN);
                intScore += 1;
            }
            if(isCorrect(strListAnswers,txtQ3.getText(),3) == true){
                txtQ3.setBackground(Color.GREEN);
                intScore += 1; 
            }
            if(isCorrect(strListAnswers,txtQ4.getText(),4) == true){
                txtQ4.setBackground(Color.GREEN);
                intScore += 1;    
            }
            if(isCorrect(strListAnswers,txtQ5.getText(),5) == true){
                txtQ5.setBackground(Color.GREEN);
                intScore += 1;
            }
            if(isCorrect(strListAnswers,txtQ6.getText().toUpperCase(),6) == true){
                txtQ6.setBackground(Color.GREEN);
                intScore += 1;
            }
            if(isCorrect(strListAnswers,txtQ7.getText().toUpperCase(),7) == true){
                txtQ7.setBackground(Color.GREEN);
                intScore += 1;
            }
            if(isCorrect(strListAnswers,txtQ8.getText().toUpperCase(),8) == true){
                txtQ8.setBackground(Color.GREEN);
                intScore += 1;
            }
            if(txtQ1.getText().equals("- 7 / 4")){
                txtQ1.setBackground(Color.GREEN);
                intScore += 1;
            }

            //Showing user's score
            lblScore.setText("Your Score: " + strScore(intScore, 8)); 
            lblScore.setVisible(true);
        }
    }
}