import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ABC extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton btn;

    public ABC() {
        setLayout(new FlowLayout());         
        l1 = new JLabel("Enter Number:");         
        t1 = new JTextField(20);         

        btn = new JButton("Square");       
        l2 = new JLabel("Square:");  
        t2 = new JTextField(20);         
        t2.setEditable(false);
        
        add(l1);         
        add(t1);            
        add(btn);         
        add(l2);
        add(t2);        
        
        btn.addActionListener(this);                  

        setSize(400, 200);         
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);         
        setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int sqr = a * a;
            t2.setText(String.valueOf(sqr));
        } catch (NumberFormatException ex) {             
            t2.setText("Invalid input. Please enter number.");
        }     
    }
}

public class SwingSquare{
    public static void main(String[] args) {
        new ABC();
    }
}
