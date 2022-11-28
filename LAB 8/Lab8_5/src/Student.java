public class Student implements Cloneable {
    private final String nume;
    private final String prenume;
    private Masina masina;
    Student(String nume, String prenume, Masina masina){
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    @Override
    public String toString() {
        return "Student: " + nume + " " + prenume + ", masina: " + masina.getMarca() + ", culoarea: " + masina.getCuloare();
    }
    public Masina getMasina() {
        return masina;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //return super.clone();
        Student clonedStudent = (Student) super.clone();
        clonedStudent.masina = (Masina) clonedStudent.getMasina().clone();
        return clonedStudent;
    }
}
