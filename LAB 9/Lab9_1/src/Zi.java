
public class Zi {
    private String nume;
    private Boolean esteLucratoare;
    Zi(String nume, Boolean esteLucratoare){
        this.nume = nume;
        this.esteLucratoare = esteLucratoare;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public String getNume(){
        return this.nume;
    }
    void setLucratoare(){
        this.esteLucratoare = true;
    }
    void setNelucratoare(){
        this.esteLucratoare = false;
    }
    public boolean esteLucratoare(){
        return this.esteLucratoare;
    }
    public String toString(){
        return this.nume + ": " + esteLucratoare;
    }
}
