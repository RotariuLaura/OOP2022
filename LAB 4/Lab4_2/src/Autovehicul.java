public class Autovehicul {
    private final String marca;
    private final ColorNew color;
    private int vitezaCurenta;
    private final int vitezaMaxima;
    private static final int nrTrepteViteza = 6;
    private int treaptaCurenta;
    private static final String tip = "Diesel";
    public Rezervor rezervor;
    public Sofer sofer;
    public Autovehicul(){//constructor fara parametri
        this.marca =("unknown");
        this.color = null;
        this.vitezaCurenta = 0;
        this.vitezaMaxima = 0;
        this.treaptaCurenta = 0;
        this.sofer= null;
        this.rezervor = null;
    }
    public Autovehicul(String marca, ColorNew color, int vitezaCurenta, int vitezaMaxima, int treaptaCurenta, Sofer sofer, Rezervor rezervor){
        this.marca = marca;
        this.color = color;
        this.vitezaCurenta = vitezaCurenta;
        this.vitezaMaxima = vitezaMaxima;
        this.treaptaCurenta = treaptaCurenta;
        this.sofer = sofer;
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
        return "Marca: " + marca + ", tip: " + tip + ", culoare " + color + ", viteza curenta: " + vitezaCurenta
        + ", viteza maxima: " + vitezaMaxima + ", nr trepte viteza: " + nrTrepteViteza + ", treapta curenta: " + treaptaCurenta + ", sofer: " +  sofer.getNume()
        + " " + sofer.getPrenume() + ", capacitate rezevor: " + rezervor.getCapacitateMaxima()
                +", cantitate combustibil: " + rezervor.getCantitateCombustibil() + ", nivelul de umplere: " + rezervor.getNivelUmplere() + "\n";
    }
}
