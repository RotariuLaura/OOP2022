import java.awt.Color;

public class Autovehicul extends Sofer{
    private final String marca;
    private final Color color;
    private int vitezaCurenta;
    private final int vitezaMaxima;
    private static final int nrTrepteViteza = 6;
    private int treaptaCurenta;
    private static final String tip = "Diesel";
    public Rezervor rezervor;
    public Autovehicul(String marca, Color color, int vitezaCurenta, int vitezaMaxima, int treaptaCurenta, String nume, String prenume, int varsta, int nrPermis, Rezervor rezervor){
        super(nume, prenume, varsta, nrPermis);
        this.marca = marca;
        this.color = color;
        this.vitezaCurenta = vitezaCurenta;
        this.vitezaMaxima = vitezaMaxima;
        this.treaptaCurenta = treaptaCurenta;
        this.rezervor = rezervor;
    }
    public int getVitezaCurenta()
    {
        return this.vitezaCurenta;
    }
    public int getVitezaMaxima()
    {
        return this.vitezaMaxima;
    }
    public int getTreaptaCurenta(){
        return this.treaptaCurenta;
    }
    public void accelerare(int n){
        int aux = this.vitezaCurenta + n;
        if(aux <= this.getVitezaMaxima()) {
            this.vitezaCurenta += n;
        }
        else
        {
            int aux2 = this.getVitezaMaxima()-this.vitezaCurenta;
            this.vitezaCurenta += aux2;
        }
    }
    public void decelerare(int n){
        int aux = this.vitezaCurenta - n;
        if(aux >= 0) {
            this.vitezaCurenta -= n;
        }
        else{
            this.vitezaCurenta = 0;
        }
    }
    public void oprire(){
        this.vitezaCurenta = 0;
        this.treaptaCurenta = 1;
    }
    public void schimbareTrepte(int treaptaNoua){
        this.treaptaCurenta = treaptaNoua;
    }
    public String toString(){
        return "Marca: " + marca + ", tip: " + tip + ", color " + color + ", viteza curenta: " + vitezaCurenta
        + ", viteza maxima: " + vitezaMaxima + ", nr trepte viteza: " + nrTrepteViteza + ", treapta curenta: " + treaptaCurenta + ", capacitate rezevor: " + rezervor.getCapacitateMaxima()
                +", cantitate combustibil: " + rezervor.getCantitateCombustibil() + ", nivelul de umplere: " + rezervor.getNivelUmplere();
    }
    public String toStringSofer(){
        return ("Sofer: " + nume + " " + prenume);
    }
}
