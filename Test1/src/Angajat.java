
public class Angajat extends Persoana implements Comparable <Angajat> {
    private final int nrClientiServiti;
    Angajat(String ID, String nume, int nrClientiServiti){
        super(ID, nume);
        this.nrClientiServiti = nrClientiServiti;
    }
    public String toString() {
        return "Angajat-" + super.toString() + ", nr clienti serviti: " + nrClientiServiti;
    }
    public int compareTo(Angajat angajat){
        return this.nrClientiServiti - angajat.nrClientiServiti;
    }
}
