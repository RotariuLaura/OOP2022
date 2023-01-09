/**
 * Quiz cu intrebari si raspunsuri multiple in sablonul MVC
 * (contine 5 intrebari la care jucatorul trebuie sa raspunda si care sunt evaluate
 * imediat ce un raspuns este inregistrat).
 * Aici se creeaza modelul, vizulizarea, si controlorul si se lanseaza aplicatia.
 */

public class QuizMVC {
    /** constructorul fara parametri */
    public QuizMVC(){
    }
    /** clasa are o metoda main in care se creaza modelul, vizualizarea si controlorul */
    public static void main(String[] args) {
        QuizModel model = new QuizModel();
        QuizView1 view1 = new QuizView1();
        QuizView2 view2 = new QuizView2();
        QuizController controller = new QuizController(model, view1, view2);
        view1.setVisible(true);
    }
}