import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLight extends JPanel implements ActionListener {
    JRadioButton r1, r2, r3;
    Color red, yellow, green;

    public TrafficLight() {
        setBounds(0, 0, 640, 480);
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Yellow");
        r3 = new JRadioButton("Green");
        r1.setSelected(true);
        red = Color.red;
        yellow = getBackground();
        green = getBackground();
        ButtonGroup gp = new ButtonGroup();
        gp.add(r1);
        gp.add(r2);
        gp.add(r3);
        add(r1);
        add(r2);
        add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(50, 50, 50, 50);
        g.drawOval(50, 110, 50, 50);
        g.drawOval(50, 170, 50, 50);
        g.setColor(red);
        g.fillOval(50, 50, 50, 50);
        g.setColor(yellow);
        g.fillOval(50, 110, 50, 50);
        g.setColor(green);
        g.fillOval(50, 170, 50, 50);
    }

    public void actionPerformed(ActionEvent ae) {
        if (r1.isSelected() == true) {
            red = Color.red;
            yellow = getBackground();
            green = getBackground();
        } else if (r2.isSelected() == true) {
            yellow = Color.yellow;
            red = getBackground();
            green = getBackground();
        } else if (r3.isSelected() == true) {
            green = Color.green;
            red = getBackground();
            yellow = getBackground();
        }
        repaint();
    }

    public static void main(String[] args) {
        TrafficLight c = new TrafficLight();
        JFrame f = new JFrame();
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.add(c);
    }
}