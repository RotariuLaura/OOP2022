import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

class MyPanel extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Simple Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 120);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JLabel l = new JLabel ("Label1 ");
        JTextField tf = new JTextField("TextField1");
        panel1.add(l);
        panel1.add(tf);
        panel1.setLayout(new FlowLayout());
        Border blueline = BorderFactory.createLineBorder(Color.blue);
        panel1.setBorder(blueline);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        panel2.setBorder(blackline);

        b1.addActionListener(new ActionListener() {
            int count = 0;
            public void actionPerformed(ActionEvent e) {
                ++count;
                tf.setText(count + "");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = "";
                s = tf.getText();
                l.setText(s + "");
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Border pinkline = BorderFactory.createLineBorder(Color.pink);
                panel1.setBorder(pinkline);
                panel2.setBorder(pinkline);
            }
        });

        JPanel p = new JPanel();
        Border redline = BorderFactory.createLineBorder(Color.red);
        p.setBorder(redline);
        p.add(panel1);
        p.add(panel2);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        frame.setContentPane(p);
        frame.setVisible(true);
    }
}
