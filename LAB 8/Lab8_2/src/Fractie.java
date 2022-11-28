public class Fractie implements Numeric{
    private int numarator;
    private int numitor;

    public Fractie(int numitor, int numarator) {
        this.numarator = numarator;
        this.numitor = numitor;
    }
    public void adunare(Numeric fractie) {
        Fractie f = (Fractie) fractie;
        this.numarator = this.numarator * f.numitor + f.numarator * this.numitor;
        this.numitor = this.numitor * f.numitor;
    }
    public void scadere(Numeric fractie) {
        Fractie f = (Fractie) fractie;
        this.numarator = this.numarator * f.numitor - f.numarator * this.numitor;
        this.numitor = this.numitor * f.numitor;
    }
    public void inmultire(Numeric fractie) {
        Fractie f = (Fractie) fractie;
        this.numarator = this.numarator * f.numarator;
        this.numitor = this.numitor + f.numitor;
    }

    @Override
    public String toString() {
        return numarator + "/" + numitor;
    }
}
