public class Persoana {
    private final String ID;
    private final String nume;
    Persoana(String ID, String nume){
        this.ID = ID;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Nume: " + nume + ", ID: " + ID;
    }
}
