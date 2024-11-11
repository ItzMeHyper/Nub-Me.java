import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class check extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2;
    JButton btn;

    public check() {
        setLayout(new FlowLayout());
        setTitle("Armstrong checker");

        l1 = new JLabel("Enter the number: ");
        t1 = new JTextField(20);
        l2 = new JLabel("Result: ");
        t2 = new JTextField(20);

        btn = new JButton("Check: ");
        t2.setEditable(false);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(btn);

        btn.addActionListener(this);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            try {
                int n = Integer.parseInt(t1.getText());
                int c = n, s = 0, r;
                while (n > 0) {
                    r = n % 10;
                    s = (r * r * r) + s;
                    n = n / 10;
                }
                if (s == c) {
                    t2.setText("Armstrong number");
                } else {
                    t2.setText("Not an Armstrong number");
                }
            } catch (NumberFormatException ex) {
                t2.setText("Invalid input. Please enter number.");
            }
        }
    }

}

public class SwingArmstrong {
    public static void main(String[] args) {
        new check();
    }
}
