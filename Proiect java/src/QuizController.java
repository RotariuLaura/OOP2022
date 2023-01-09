import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controlorul:
 * Clasa QuizController trateaza interactiunea utilizatorului folosind ascultatori.
 * Aceasta clasa apeleaza clasele QuizView1, QuizView2 si QuizModel dupa nevoi.
 * Aici are loc preluarea intrebarilor din quiz din clasa QuizModel si afisarea acestora pe rand,
 * verificarea raspunsului dat de utilizator, dispunerea urmatoarei intrebari in functie
 * de butoanele apasate (la apasarea butonului check se verifica raspunsul, la apasarea butonului next
 * se trece la intrebarea urmatoare).
 */
public class QuizController{
    QuizView1 quizView1;
    QuizView2 quizView2;
    QuizModel quizModel;
    /** clasa interna folosita la adaugarea ascultatorului pentru butonul de start */
    static class StartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            QuizView2 view2 = new QuizView2();
            QuizModel model = new QuizModel();
            QuizController controller = new QuizController(model, new QuizView1(), view2);
            view2.setVisible(true);
            view2.setTitle("Quiz");
        }
    }
    /** constructorul unde realizez quiz-ul apeland clasele QuizView1, QuizView2 si QuizModel dupa nevoi
     *  si tratand interactiunea utilizatorului folosind ascultatori */
    public QuizController(QuizModel quizModel, QuizView1 quizView1, QuizView2 quizView2) {
        final int[] score = {0};
        this.quizView1 = quizView1;
        quizView1.addStartListener(new StartListener());
        this.quizView2 = quizView2;

        this.quizModel = quizModel;
        Question[] questions = quizModel.getQuiz();
        String aux = questions[0].getQuestion();
        String[] q = aux.split("\\?");
        quizView2.setQuestionField(q[0] + '?');
        String aux2 = q[0];
        String[] q2 = aux2.split(" ");
        q = aux.split(" ");

        quizView2.setButton1(q[q2.length]);
        quizView2.setButton2(q[q2.length + 1]);
        quizView2.setButton3(q[q2.length + 2]);

        quizView2.setEvaluationField("");

        quizView2.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (quizView2.button1.isSelected() && questions[0].getAnswer().equals("a") && !quizView2.button2.isSelected() && !quizView2.button3.isSelected() ||
                        quizView2.button2.isSelected() && questions[0].getAnswer().equals("b") && !quizView2.button1.isSelected() && !quizView2.button3.isSelected()
                        || quizView2.button3.isSelected() && questions[0].getAnswer().equals("c") && !quizView2.button1.isSelected() && !quizView2.button2.isSelected()) {
                    quizView2.setEvaluationField("Correct!");
                    score[0]++;
                } else {
                    quizView2.setEvaluationField("Incorrect!");
                }
            }
        });

        quizView2.btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                quizView2.contentPane.remove(quizView2.btnSubmit);
                String aux = questions[1].getQuestion();
                String[] q = aux.split("\\?");
                quizView2.setQuestionField(q[0] + '?');
                String aux2 = q[0];
                String[] q2 = aux2.split(" ");
                q = aux.split(" ");

                quizView2.setButton1(q[q2.length]);
                quizView2.button1.setSelected(false);
                quizView2.setButton2(q[q2.length + 1]);
                quizView2.button2.setSelected(false);
                quizView2.setButton3(q[q2.length + 2]);
                quizView2.button3.setSelected(false);

                quizView2.setEvaluationField("");

                JButton btnSubmit = new JButton("Check");
                btnSubmit.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String auxa = questions[1].getAnswer();
                        if ( quizView2.button1.isSelected() && auxa.equals("a") && ! quizView2.button2.isSelected() && ! quizView2.button3.isSelected() ||
                                quizView2.button2.isSelected() && auxa.equals("b") && ! quizView2.button1.isSelected() && ! quizView2.button3.isSelected()
                                ||  quizView2.button3.isSelected() && auxa.equals("c") && ! quizView2.button1.isSelected() && ! quizView2.button2.isSelected()) {
                            quizView2.setEvaluationField("Correct!");
                            score[0]++;
                        } else {
                            quizView2.setEvaluationField("Incorrect!");
                        }
                    }
                });
                btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 14));
                btnSubmit.setBounds(50, 300, 91, 23);
                quizView2.contentPane.add(btnSubmit);
                quizView2.contentPane.remove(quizView2.btnNext);
                JButton btnNext1 = new JButton("Next");
                btnNext1.setFont(new Font("Times New Roman", Font.BOLD, 14));
                btnNext1.setBounds(180, 300, 91, 23);
                quizView2.contentPane.add(btnNext1);
                btnNext1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        quizView2.contentPane.remove(btnSubmit);
                        String aux = questions[2].getQuestion();
                        String[] q = aux.split("\\?");
                        quizView2.questionField.setText(q[0] + '?');
                        String aux2 = q[0];
                        String[] q2 = aux2.split(" ");
                        q = aux.split(" ");

                        quizView2.setButton1(q[q2.length]);
                        quizView2.button1.setSelected(false);
                        quizView2.setButton2(q[q2.length + 1]);
                        quizView2.button2.setSelected(false);
                        quizView2.setButton3(q[q2.length + 2]);
                        quizView2.button3.setSelected(false);

                        quizView2.setEvaluationField("");

                        JButton btnSubmit = new JButton("Check");
                        btnSubmit.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                String auxa = questions[2].getAnswer();
                                if (quizView2.button1.isSelected() && auxa.equals("a") && !quizView2.button2.isSelected() && !quizView2.button3.isSelected() ||
                                        quizView2.button2.isSelected() && auxa.equals("b") && !quizView2.button1.isSelected() && !quizView2.button3.isSelected()
                                        || quizView2.button3.isSelected() && auxa.equals("c") && !quizView2.button1.isSelected() && !quizView2.button2.isSelected()) {
                                    quizView2.setEvaluationField("Correct!");
                                    score[0]++;
                                } else {
                                    quizView2.setEvaluationField("Incorrect!");
                                }
                            }
                        });
                        btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 14));
                        btnSubmit.setBounds(50, 300, 91, 23);
                        quizView2.contentPane.add(btnSubmit);
                        quizView2.contentPane.remove(btnNext1);

                        JButton btnNext1 = new JButton("Next");
                        btnNext1.setFont(new Font("Times New Roman", Font.BOLD, 14));
                        btnNext1.setBounds(180, 300, 91, 23);
                        quizView2.contentPane.add(btnNext1);
                        btnNext1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                quizView2.contentPane.remove(btnSubmit);
                                String aux = questions[3].getQuestion();
                                String[] q = aux.split("\\?");
                                quizView2.setQuestionField(q[0] + '?');
                                String aux2 = q[0];
                                String[] q2 = aux2.split(" ");
                                q = aux.split(" ");

                                quizView2.setButton1(q[q2.length]);
                                quizView2.button1.setSelected(false);
                                quizView2.setButton2(q[q2.length + 1]);
                                quizView2.button2.setSelected(false);
                                quizView2.setButton3(q[q2.length + 2]);
                                quizView2.button3.setSelected(false);

                                quizView2.setEvaluationField("");

                                JButton btnSubmit = new JButton("Check");
                                btnSubmit.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        String auxa = questions[3].getAnswer();
                                        if (quizView2.button1.isSelected() && auxa.equals("a") && !quizView2.button2.isSelected() && !quizView2.button3.isSelected() ||
                                                quizView2.button2.isSelected() && auxa.equals("b") && !quizView2.button1.isSelected() && !quizView2.button3.isSelected()
                                                || quizView2.button3.isSelected() && auxa.equals("c") && !quizView2.button1.isSelected() && !quizView2.button2.isSelected()) {
                                            quizView2.setEvaluationField("Correct!");
                                            score[0]++;
                                        } else {
                                            quizView2.setEvaluationField("Incorrect!");
                                        }
                                    }
                                });
                                btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 14));
                                btnSubmit.setBounds(50, 300, 91, 23);
                                quizView2.contentPane.add(btnSubmit);
                                quizView2.contentPane.remove(btnNext1);

                                JButton btnNext1 = new JButton("Next");
                                btnNext1.setFont(new Font("Times New Roman", Font.BOLD, 14));
                                btnNext1.setBounds(180, 300, 91, 23);
                                quizView2.contentPane.add(btnNext1);
                                btnNext1.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        quizView2.contentPane.remove(btnSubmit);
                                        String aux = questions[4].getQuestion();
                                        String[] q = aux.split("\\?");
                                        quizView2.setQuestionField(q[0] + '?');
                                        String aux2 = q[0];
                                        String[] q2 = aux2.split(" ");
                                        q = aux.split(" ");

                                        quizView2.setButton1(q[q2.length]);
                                        quizView2.button1.setSelected(false);
                                        quizView2.setButton2(q[q2.length + 1]);
                                        quizView2.button2.setSelected(false);
                                        quizView2.setButton3(q[q2.length + 2]);
                                        quizView2.button3.setSelected(false);

                                        quizView2.setEvaluationField("");

                                        JButton btnSubmit = new JButton("Check");
                                        btnSubmit.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                String auxa = questions[4].getAnswer();
                                                if (quizView2.button1.isSelected() && auxa.equals("a") && !quizView2.button2.isSelected() && !quizView2.button3.isSelected() ||
                                                        quizView2.button2.isSelected() && auxa.equals("b") && !quizView2.button1.isSelected() && !quizView2.button3.isSelected()
                                                        || quizView2.button3.isSelected() && auxa.equals("c") && !quizView2.button1.isSelected() && !quizView2.button2.isSelected()) {
                                                    quizView2.setEvaluationField("Correct!");
                                                    score[0]++;
                                                } else {
                                                    quizView2.setEvaluationField("Incorrect!");
                                                }
                                            }
                                        });
                                        btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 14));
                                        btnSubmit.setBounds(50, 300, 91, 23);
                                        quizView2.contentPane.add(btnSubmit);

                                        quizView2.contentPane.remove(btnNext1);
                                        JButton btnNext1 = new JButton("Next");
                                        btnNext1.setFont(new Font("Times New Roman", Font.BOLD, 14));
                                        btnNext1.setBounds(180, 300, 91, 23);
                                        quizView2.contentPane.add(btnNext1);
                                        btnNext1.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                JOptionPane.showMessageDialog(quizView1, "Done! Your score: " +  score[0] + "/" + questions.length, "END", JOptionPane.INFORMATION_MESSAGE);
                                                System.exit(0);
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
    /** metoda main in care se instanstiaza un obiect de tipul clasei */
    public static void main(String [] args){
        QuizView1 view1 = new QuizView1();
        QuizView2 view2 = new QuizView2();
        QuizModel model = new QuizModel();
        QuizController quiz = new QuizController(model, view1, view2);
    }
}
