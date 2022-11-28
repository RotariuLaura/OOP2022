public class Masina implements Cloneable{
    private final String marca;
    ColorNew culoare;

    Masina(String marca, ColorNew culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    public String getMarca() {
        return marca;
    }
    public ColorNew getCuloare() {
        return culoare;
    }

    public void setCuloare(ColorNew culoare){
        this.culoare = culoare;
    }
    public String toString(){
        return "Masina: " + marca + ", culoarea: " + culoare;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
