package library.managementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class  ReadMe extends JFrame implements ActionListener{
    
    private JPanel contentPane;
    
    public static void main(String[] args){
        new ReadMe().setVisible(true);
    }
    
    public ReadMe(){
        
        super("Read Me - Library Management System");
        setBounds(500, 250, 700, 500);
        
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel l3 = new JLabel("Library");
        l3.setForeground(new Color(0, 250, 154));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l3.setBounds(160, 40, 150, 55);
        contentPane.add(l3);
        
        JLabel l4 = new JLabel("Management System");
        l4.setForeground(new Color(127, 250, 0));
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l4.setBounds(70, 90, 405, 40);
        contentPane.add(l4);
        
        JLabel l5 = new JLabel("v5.1");
        l5.setForeground(new Color(30, 144, 255));
        l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
        l5.setBounds(185, 140, 100, 21);
        contentPane.add(l5);
        
        JLabel l6 = new JLabel("Developed By : Ankush Gupta");
        l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        l6.setBounds(70, 198, 600, 35);
        contentPane.add(l6);
        
        JTextArea l7 = new JTextArea("A LIbrary Management System in Java is a project\n which implemented in java platform using MySQL database\n design.It is useful for libraries in any schools or similar\n educational institution to manage data in database through\n computerized system");
        l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        l7.setBounds(70, 260, 600, 200);
        contentPane.add(l7);
        
        
        
        contentPane.setBackground(Color.WHITE);

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


