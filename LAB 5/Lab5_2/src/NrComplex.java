public class NrComplex {
    private int real;
    private int imaginar;
    public NrComplex(int real, int imaginar){
        this.real = real;
        this.imaginar = imaginar;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginar(int imaginar) {
        this.imaginar = imaginar;
    }

    public void adunare(NrComplex n)
    {
      this.real += n.real;
      this.imaginar += n.imaginar;
    }
    public void scadere(NrComplex n){
        this.real -= n.real;
        this.imaginar -= n.imaginar;
    }
    public void inmultireScalar(int nr){
        this.real *= nr;
        this.imaginar *= nr;
    }
    public void inmultireComplex(NrComplex n)
    {
        this.real = this.real * n.real - this.imaginar * n.imaginar;
        this. imaginar = this.real * n.imaginar + this.imaginar * n.real;
    }
    public String toString(){
        return real + "+" + imaginar + "*i  ";
    }
}
