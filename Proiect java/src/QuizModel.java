import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Modelul:
 * Clasa QuizModel este complet independenta de interfata utilizator, putand fi folosita si
 * in linia de comanda daca se apeleaza metoda takeTest a clasei.
 * In aceasta clasa am citit intrebarile din fisier si am creat un vector de intrebari
 * (de tipul Question) pe care le-am folosit in quiz. Am facut o metoda ce returneaza acest vector
 * pentru a-l folosi in clasa QuizController care interactioneaza cu aceasta clasa.
 */
public class QuizModel {
    private final Question[] quiz;
    /** constructorul clasei, aici am citit intrebarile din fisier si am creat un vector de intrebari de tipul Question (fiecare are o intrebare
     * si raspunsul corect) */
    public QuizModel() {
        ArrayList<String> questions = new ArrayList<>();
        try {
            File myFile = new File("D:\\AC- AN II\\Programare orientata pe obiect\\Proiect java\\src\\questions.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String question = myReader.nextLine();
                questions.add(question);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        this.quiz = new Question[]{new Question(questions.get(0), "c"), new Question(questions.get(1), "a"),
                new Question(questions.get(2), "c"), new Question(questions.get(3), "b"), new Question(questions.get(4), "a")};
    }

    /** aceasta metoda poate fi apelata in main daca se doreste jucarea quiz-ului in consola */
    public static void takeTest(Question[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].getQuestion());
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].getAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }

    /** getter pentru vectorul de intrebari folosit in quiz, deoarece are modificatorul de acces de tip private */
    public Question[] getQuiz() {
        return quiz;
    }

    /** metoda main in care instantiez un obiect de tipul clasei */
    public static void main(String[] args) {
        QuizModel app = new QuizModel();
        takeTest(app.getQuiz());
    }
}
