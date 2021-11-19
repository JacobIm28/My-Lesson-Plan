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
 * U4A3 - Practice frame
 */
public class JFrameOverviewPractice extends JFrame implements ActionListener{
    
    //Declaring widgets
        JLabel lblTitle;            //Title label
        JLabel lblQ1;               //Question 1 label
        JTextField txtQ1;           //Question 1 answer field
        JLabel lblQ2;               //Question 2 label
        JTextField txtQ2;           //Question 2 answer field
        JLabel lblQ3;               //Question 1 label
        JTextField txtQ3;           //Question 3 answer field
        JLabel lblQ4;               //Question 3 label
        JTextField txtQ4;           //Question 4 answer field
        JLabel lblQ5;               //Question 4 label
        JTextField txtQ5;           //Question 5 answer field
        JLabel lblQ6;               //Question 5 label
        JTextField txtQ6;           //Question 6 answer field
        JLabel lblQ7;               //Question 7 label
        JTextField txtQ7;           //Question 7 answer field
        JLabel lblQ8;               //Question 8 label
        JTextField txtQ8;           //Question 8 answer field
        JLabel lblQ9;               //Question 9 label
        JTextField txtQ9;           //Question 9 answer field
        JLabel lblQ10;              //Question 10 label
        JTextField txtQ10;          //Question 10 answer field
        JLabel lblQ11;              //Question 11 label
        JTextField txtQ11;          //Question 11 answer field
        JButton btnMainMenu;        //Main menu button
        JButton btnBack;            //Back button
        JButton btnCheck;           //Check answers button
        JButton btnAnswers;         //Show answers button
    
    public JFrameOverviewPractice(){
        super("Overview - Practice");             //What's displayed in title bar
        
        setLayout(null);                    //Setting layout for JFrame
        
        getContentPane().setBackground(Color.GREEN);        //Setting background color
        
        //Formatting widgets
            //Title label
            lblTitle = new JLabel();
            lblTitle.setSize(500,100);
            lblTitle.setLocation(400,50);
            lblTitle.setText("Practice");
            lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 80));
            lblTitle.setForeground(Color.BLACK);
            lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
            add(lblTitle);
            
            //Q1 label
            lblQ1 = new JLabel();
            lblQ1.setSize(600,50);
            lblQ1.setLocation(250,150);
            lblQ1.setText("1. What is the value of x in x - 9 = 2^3 * 2^1?");
            lblQ1.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ1.setForeground(Color.BLACK);
            add(lblQ1);
            
            //Q1 answer field
            txtQ1 = new JTextField();
            txtQ1.setSize(100,40);
            txtQ1.setLocation(950,150);
            txtQ1.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ1.setBackground(Color.WHITE);
            add(txtQ1);
            
            //Q2 label
            lblQ2 = new JLabel();
            lblQ2.setSize(600,50);
            lblQ2.setLocation(150,200);
            lblQ2.setText("2. Rearrange the equation A = v(m + n) to solve for m.");
            lblQ2.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ2.setForeground(Color.BLACK);
            add(lblQ2);
            
            //Q2 answer field
            txtQ2 = new JTextField();
            txtQ2.setSize(100,40);
            txtQ2.setLocation(950,200);
            txtQ2.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ2.setBackground(Color.WHITE);
            add(txtQ2);
            
            //Q3 label
            lblQ3 = new JLabel();
            lblQ3.setSize(600,50);
            lblQ3.setLocation(150,250);
            lblQ3.setText("3. If A = 10, v = 5, n = 1 in the equation above, what is he value of m?");
            lblQ3.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ3.setForeground(Color.BLACK);
            add(lblQ3);
            
            //Q3 answer field
            txtQ3 = new JTextField();
            txtQ3.setSize(100,40);
            txtQ3.setLocation(950,250);
            txtQ3.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ3.setBackground(Color.WHITE);
            add(txtQ3);
            
            //Q4 label
            lblQ4 = new JLabel();
            lblQ4.setSize(750,50);
            lblQ4.setLocation(150,300);
            lblQ4.setText("4. Helen is half the age of Henry. The sum of their ages is 42. How old is Helen?");
            lblQ4.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ4.setForeground(Color.BLACK);
            add(lblQ4);
            
            //Q4 answer field
            txtQ4 = new JTextField();
            txtQ4.setSize(100,40);
            txtQ4.setLocation(950,300);
            txtQ4.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ4.setBackground(Color.WHITE);
            add(txtQ4);
            
            //Q5 label
            lblQ5 = new JLabel();
            lblQ5.setSize(700,50);
            lblQ5.setLocation(150,350);
            lblQ5.setText("5. The sum of two consecutive odd integers is 8. What is the bigger number?");
            lblQ5.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ5.setForeground(Color.BLACK);
            add(lblQ5);
            
            //Q5 answer field
            txtQ5 = new JTextField();
            txtQ5.setSize(100,40);
            txtQ5.setLocation(950,350);
            txtQ5.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ5.setBackground(Color.WHITE);
            add(txtQ5);
            
            //Q6 label
            lblQ6 = new JLabel();
            lblQ6.setSize(800,50);
            lblQ6.setLocation(150,400);
            lblQ6.setText("6. I have 32 coins, either quarters or dimes, and they equal $7.70. How many quarters do I have?");
            lblQ6.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ6.setForeground(Color.BLACK);
            add(lblQ6);
            
            //Q6 answer field
            txtQ6 = new JTextField();
            txtQ6.setSize(100,40);
            txtQ6.setLocation(950,400);
            txtQ6.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ6.setBackground(Color.WHITE);
            add(txtQ6);
            
            //Q7 label
            lblQ7 = new JLabel();
            lblQ7.setSize(600,50);
            lblQ7.setLocation(150,450);
            lblQ7.setText("7. Solve for x. 7x - 2 = 3x + 14");
            lblQ7.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ7.setForeground(Color.BLACK);
            add(lblQ7);
            
            //Q7 answer field
            txtQ7 = new JTextField();
            txtQ7.setSize(100,40);
            txtQ7.setLocation(950,450);
            txtQ7.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ7.setBackground(Color.WHITE);
            add(txtQ7);
            
            //Q8 label
            lblQ8 = new JLabel();
            lblQ8.setSize(800,50);
            lblQ8.setLocation(150,500);
            lblQ8.setText("8. Rachel is three times Cathy's age.  In 8 years, Rachel will be half of Cathy's age.  How old is Rachel?");
            lblQ8.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ8.setForeground(Color.BLACK);
            add(lblQ8);
            
            //Q8 answer field
            txtQ8 = new JTextField();
            txtQ8.setSize(100,40);
            txtQ8.setLocation(950,500);
            txtQ8.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ8.setBackground(Color.WHITE);
            add(txtQ8);
            
            //Q9 label
            lblQ9 = new JLabel();
            lblQ9.setSize(600,50);
            lblQ9.setLocation(150,550);
            lblQ9.setText("9. (3^2)^4 = 729. True(T) or False(F)");
            lblQ9.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ9.setForeground(Color.BLACK);
            add(lblQ9);
            
            //Q9 answer field
            txtQ9 = new JTextField();
            txtQ9.setSize(100,40);
            txtQ9.setLocation(950,550);
            txtQ9.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ9.setBackground(Color.WHITE);
            add(txtQ9);
            
            //Q10 label
            lblQ10 = new JLabel();
            lblQ10.setSize(600,50);
            lblQ10.setLocation(150,600);
            lblQ10.setText("10. (2^3)^3 = 512. True(T) or False(F)");
            lblQ10.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ10.setForeground(Color.BLACK);
            add(lblQ10);
            
            //Q10 answer field
            txtQ10 = new JTextField();
            txtQ10.setSize(100,40);
            txtQ10.setLocation(950,600);
            txtQ10.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ10.setBackground(Color.WHITE);
            add(txtQ10);
            
            //Q11 label
            lblQ11 = new JLabel();
            lblQ11.setSize(600,50);
            lblQ11.setLocation(150,650);
            lblQ11.setText("11. Solve 2x - 7 = 5");
            lblQ11.setFont(new Font("Times New Roman", Font.BOLD, 18));
            lblQ11.setForeground(Color.BLACK);
            add(lblQ11);
            
            //Q11 answer field
            txtQ11 = new JTextField();
            txtQ11.setSize(100,40);
            txtQ11.setLocation(950,650);
            txtQ11.setFont(new Font("Lucida", Font.PLAIN, 15));
            txtQ11.setBackground(Color.WHITE);
            add(txtQ11);
            
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
            
            //Back button
            btnBack = new JButton();
            btnBack.setSize(150,50);
            btnBack.setLocation(50,125);
            btnBack.setText("Back");
            btnBack.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnBack.setOpaque(true);
            btnBack.setBackground(Color.BLACK);
            btnBack.setAlignmentX(CENTER_ALIGNMENT);
            btnBack.setActionCommand("Back");                        //Tells button to carry out action
            btnBack.addActionListener(this);                         //Tells button to listen to command
            add(btnBack);
            
            //Show answers button
            btnAnswers = new JButton();
            btnAnswers.setSize(150,50);
            btnAnswers.setLocation(1100,125);
            btnAnswers.setText("Answers");
            btnAnswers.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnAnswers.setOpaque(true);
            btnAnswers.setBackground(Color.BLACK);
            btnAnswers.setAlignmentX(CENTER_ALIGNMENT);
            btnAnswers.setActionCommand("Answers");                     //Tells button to carry out action
            btnAnswers.addActionListener(this);                         //Tells button to listen to command
            add(btnAnswers);
            
            //Check answers button
            btnCheck = new JButton();
            btnCheck.setSize(150,50);
            btnCheck.setLocation(1100,50);
            btnCheck.setText("Check");
            btnCheck.setFont(new Font("Lucida", Font.PLAIN, 20));
            btnCheck.setOpaque(true);
            btnCheck.setBackground(Color.BLACK);
            btnCheck.setAlignmentX(CENTER_ALIGNMENT);
            btnCheck.setActionCommand("Check");                       //Tells button to carry out action
            btnCheck.addActionListener(this);                         //Tells button to listen to command
            add(btnCheck);
        
    }
    
    /**
     * @param str1 is a string for the answer that is being checked
     * @param strList1 is an array list with the answers
     * @param int1 is an integer for the question number
     * @return true if inputted answer is correct, false if not
     */
    public static boolean isCorrect(ArrayList<String> strList1, String str1, int int1){
        if(strList1.get(int1 - 1).equals(str1)){
           return true; 
        }
        else
            return false;
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
        //If back button is pressed, overview is opened
        if(e.getActionCommand().equals("Back")){
            //Creating and formatting frame
            JFrameOverview fOverview = new JFrameOverview();
            fOverview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fOverview.setSize(1300,850);
            fOverview.setVisible(true);
            
            //Closing current JFrame
            this.dispose(); 
        }
        
        //Creating ArrayList with answers
        ArrayList<String> strListAnswers = new ArrayList<String>();   
        //Adding answers to arraylist
        Collections.addAll(strListAnswers, "25", "m = A / v - n", "1", "14", "5", "30", "4", "24", "F", "T", "6");
        
        //If answers button is pressed, answers is opened
        if(e.getActionCommand().equals("Answers")){
            txtQ1.setText(strListAnswers.get(0));
            txtQ2.setText(strListAnswers.get(1));
            txtQ3.setText(strListAnswers.get(2));
            txtQ4.setText(strListAnswers.get(3));
            txtQ5.setText(strListAnswers.get(4));
            txtQ6.setText(strListAnswers.get(5));
            txtQ7.setText(strListAnswers.get(6));            
            txtQ8.setText(strListAnswers.get(7));
            txtQ9.setText(strListAnswers.get(8));
            txtQ10.setText(strListAnswers.get(9));
            txtQ11.setText(strListAnswers.get(10));
        }
        //If check button is pressed, check frame is opened
        if(e.getActionCommand().equals("Check")){
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
            txtQ9.setBackground(Color.RED);
            txtQ10.setBackground(Color.RED);
            txtQ11.setBackground(Color.RED);
            
            //If answers are right, background color is set to green
            if(isCorrect(strListAnswers,txtQ1.getText(),1) == true)
                txtQ1.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ2.getText(),2) == true)
                txtQ2.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ3.getText(),3) == true)
                txtQ3.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ4.getText(),4) == true)
                txtQ4.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ5.getText(),5) == true)
                txtQ5.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ6.getText(),6) == true)
                txtQ6.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ7.getText(),7) == true)
                txtQ7.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ8.getText(),8) == true)
                txtQ8.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ9.getText().toUpperCase(),9) == true)
                txtQ9.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ10.getText().toUpperCase(),10) == true)
                txtQ10.setBackground(Color.GREEN);
            if(isCorrect(strListAnswers,txtQ11.getText(),11) == true)
                txtQ11.setBackground(Color.GREEN);
            if(txtQ2.getText().equals("m=A/v-n"))
                txtQ2.setBackground(Color.YELLOW);
            if(txtQ9.getText().equals("False"))
                txtQ9.setBackground(Color.YELLOW);
            if(txtQ10.getText().equals("True"))
                txtQ10.setBackground(Color.YELLOW);
        }
    }
}