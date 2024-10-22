import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ABC extends JFrame implements ActionListener {
    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton btn;

    public ABC() {
        setLayout(new FlowLayout());
        l1 = new JLabel("First Number:");
        t1 = new JTextField(20);
        l2 = new JLabel("Second Number:");
        t2 = new JTextField(20);
        btn = new JButton("Add");
        l3 = new JLabel("Result:");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn);
        add(l3);

        btn.addActionListener(this);
        
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int sum = a + b;
            l3.setText("Result: " + sum);
        } catch (NumberFormatException ex) {
            l3.setText("Invalid input. Please enter numbers.");
        }
    }

    public static void main(String[] args) {
        new ABC();
    }
}
