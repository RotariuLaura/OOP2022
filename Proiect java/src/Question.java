/**
 * Clasa Question pe care o folosesc in clasa QuizModel pentru a realiza vectorul de intrebari folosit in quiz.
 */
public class Question {
    private String question;
    private String answer;
    /** constructorul cu parametri*/
    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
    /**suprascrierea metodei toString pentru afisarea intrebarilor in consola daca e nevoie*/
    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
    /** getter pentru a accesa intrebarea, care are modificatorul de acces de tip private*/
    public String getQuestion() {
        return question;
    }
    /** getter pentru a accesa raspunsul, care are modificatorul de acces de tip private*/
    public String getAnswer() {
        return answer;
    }
}
