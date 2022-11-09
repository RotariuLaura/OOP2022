public abstract class Rechizita {
    public String eticheta;
    public Rechizita(String eticheta){

        this.eticheta = eticheta;
    }
    public abstract String getNume();
    public String toString(){
        return eticheta;
    }
}
