import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Vizualizarea:
 * Clasa QuizView in care am creat fereastra de start a quiz-ului.
 * Este doar prezentarea. Nu are acțiuni utilizator.
 */
public class QuizView1 extends JFrame{
    private final JLabel label;
    private final JLabel labelImg;
    private final JButton buttonStart;
    private final JPanel contentPane;
    /** constructorul clasei QuizView1 unde am realizat prima fereastra */
    QuizView1(){
        this.setTitle("Java Quiz");
        this.setResizable(false);
        this.setBackground(Color.WHITE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 340, 288);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(Color.WHITE);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        Border blackline = BorderFactory.createLineBorder(Color.black);
        contentPane.setBorder(blackline);

        this.label = new JLabel(" This is a short Java quiz! Press Start!");
        label.setFont(new Font("Times New Roman", Font.BOLD, 18));
        label.setBounds(10, 20, 400, 50);
        contentPane.add(label);

        labelImg = new JLabel("");
        Image img = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/image.png"))).getImage();
        labelImg.setIcon(new ImageIcon(img));
        labelImg.setBounds(100, 65, 200, 120);
        contentPane.add(labelImg);

        buttonStart = new JButton("Start");
        buttonStart.setFont(new Font("Times New Roman", Font.BOLD, 14));
        buttonStart.setBounds(120, 200, 91, 23);
        contentPane.add(buttonStart);
    }
    /** metoda pentru a adauga ascultator butonului de start in clasa QuizController */
    void addStartListener(ActionListener a) {
        buttonStart.addActionListener(a);
    }
    /** metoda main unde instantiez un obiect de tipul clasei*/
    public static void main(String[] args){
        try{
            QuizView1 quiz = new QuizView1();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
