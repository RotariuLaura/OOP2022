public class Produs {
    private final String nume;
    private final double pret;
    private final int nrExemplare;
    Produs(String nume, double pret, int nrExemplare){
        this.nume = nume;
        this.pret = pret;
        this.nrExemplare = nrExemplare;
    }
    public boolean verificaStoc(){
        return this.nrExemplare > 0;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Produsul-" + "nume: " + nume + ", pret: " + pret +
                ", nrExemplare: " + nrExemplare;
    }
}
