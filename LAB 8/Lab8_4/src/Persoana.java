import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Persoana implements Comparable <Persoana>{
    private final String nume;
    private final String prenume;
    private final int varsta;
    Persoana(String nume, String prenume, int varsta){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public String toString(){
        return nume + " " + prenume + ", " + varsta + " ani";
    }
//    public int compareTo(Persoana other){
//        return this.nume.compareTo(other.nume);
//    }
    public int compareTo(Persoana other){
        return this.varsta - other.varsta;
    }
    public static void main(String[] args){
        ArrayList <Persoana> tablouPersoane = new ArrayList<>();
        Persoana persoana1 = new Persoana("Toader", "Ana", 20);
        Persoana persoana2 = new Persoana("Pop", "Maria", 25);
        Persoana persoana3 = new Persoana("Antonescu", "Marian", 30);
        Persoana persoana4 = new Persoana("Jisa", "Alina", 18);
        Persoana persoana5 = new Persoana("Mihai", "Sebastian", 24);
        tablouPersoane.add(persoana1);
        tablouPersoane.add(persoana2);
        tablouPersoane.add(persoana3);
        tablouPersoane.add(persoana4);
        tablouPersoane.add(persoana5);
        //sortare tablou persoane
        Collections.sort(tablouPersoane);
        for(Iterator <Persoana> i = tablouPersoane.iterator(); i.hasNext();){
            System.out.println(i.next());
        }
    }
}
