public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina("Kia", ColorNew.BLACK);
        Student student = new Student("Mihai", "Maria", masina);
        System.out.println(masina);
        System.out.println(student);
        Student student2;
        Student student3;
        try {
            //clonare obiect de tip Student--deep copy
            student2 = (Student) student.clone();
            System.out.println(student.getNume());
            System.out.println(student2.getNume());
            //shallow copy
            student3 = new Student(student.getNume(), student.getPrenume(), student.getMasina());
            System.out.println("Student: " + student);
            System.out.println("Student2: " + student2);
            System.out.println("Student3: " + student3);
            System.out.println();
            //schimbare culoare masina
            //shallow copy-se schimba si pentru copia studentului
            //deep copy-nu se schimba
            masina.setCuloare(ColorNew.RED);
            System.out.println("Student: " + student);
            System.out.println("Student2: " + student2);
            System.out.println("Student3: " + student3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}