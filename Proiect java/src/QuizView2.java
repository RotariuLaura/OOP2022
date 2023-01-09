import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Vizualizarea:
 * Clasa QuizView2 in care am creat fereastra care se deschide dupa apasarea butonului de start din prima fereastra, aici
 * se da quiz-ul.
 * Este doar prezentarea. Nu are acțiuni utilizator.
 */
public class QuizView2 extends JFrame {
    public final JPanel contentPane;
    public final JLabel label;
    public final JTextField questionField;
    public final JTextField evaluationField;
    public JRadioButton button1;
    public JRadioButton button2;
    public JRadioButton button3;
    public JButton btnSubmit;
    public JButton btnNext;

    /** constructorul clasei QuizView2 unde am realizat prima fereastra */
    public QuizView2() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 340, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        Border blueline = BorderFactory.createLineBorder(Color.blue);
        contentPane.setBorder(blueline);

        label = new JLabel("Question");
        label.setFont(new Font("Times New Roman", Font.BOLD, 14));
        label.setBounds(130, 5, 89, 118);
        contentPane.add(label);

        questionField = new JTextField();
        questionField.setBounds(10, 100, 310, 30);
        contentPane.add(questionField);
        questionField.setColumns(10);

        button1 = new JRadioButton();
        button1.setBounds(100, 140, 120, 20);
        contentPane.add(button1);

        button2 = new JRadioButton();
        button2.setBounds(100, 180, 120, 20);
        contentPane.add(button2);

        button3 = new JRadioButton();
        button3.setBounds(100, 220, 120, 20);
        contentPane.add(button3);

        evaluationField = new JTextField();
        evaluationField.setBounds(130, 260, 60, 23);
        contentPane.add(evaluationField);
        evaluationField.setColumns(10);

        btnSubmit = new JButton("Check");
        btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnSubmit.setBounds(50, 300, 91, 23);
        contentPane.add(btnSubmit);

        btnNext = new JButton("Next");
        btnNext.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnNext.setBounds(180, 300, 91, 23);
        contentPane.add(btnNext);
    }

    /** metoda pentru a seta intrebarea in caseta questionField, folosita in clasa QuizController */
    void setQuestionField(String newText) {
        questionField.setText(newText);
    }

    /** metoda pentru a seta evaluarea intrebarii in caseta evaluationField, folosita in clasa QuizController */
    void setEvaluationField(String newText) {
        evaluationField.setText(newText);
    }
    /** metoda pentru a seta prima varianta de raspuns, folosita in clasa QuizController */
    void setButton1(String newText) {
        button1.setText(newText);
    }

    /** metoda pentru a seta a doua varianta de raspuns, folosita in clasa QuizController */
    void setButton2(String newText) {
        button2.setText(newText);
    }

    /** metoda pentru a seta a treia varianta de raspuns, folosita in clasa QuizController */
    void setButton3(String newText) {
        button3.setText(newText);
    }

    /** metoda main unde instantiez un obiect de tipul clasei*/
    public static void main(String[] args) {
        try {
            QuizView2 view2 = new QuizView2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
