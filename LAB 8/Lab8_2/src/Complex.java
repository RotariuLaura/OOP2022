public class Complex implements Numeric{
    private int real;
    private int imaginar;
    public Complex(int real, int imaginar){
        this.real = real;
        this.imaginar = imaginar;
    }
    public void adunare(Numeric c) {
        Complex nr = (Complex)c;
        this.real += nr.real;
        this.imaginar += nr.imaginar;
    }
    public void scadere(Numeric c) {
        Complex nr = (Complex)c;
        this.real -= nr.real;
        this.imaginar -= nr.imaginar;
    }
    public void inmultire(Numeric c) {
        Complex nr = (Complex)c;
        this.real = this.real * nr.real - this.imaginar * nr.imaginar;
        this. imaginar = this.real * nr.imaginar + this.imaginar * nr.real;
    }

    @Override
    public String toString() {
        return real + "+" + imaginar + "*i";
    }
}
