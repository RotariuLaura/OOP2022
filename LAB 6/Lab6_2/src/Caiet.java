public class Caiet extends Rechizita{
    public Caiet(String eticheta){
        super(eticheta);
    }
    public String getNume(){

        return "Caiet:" + " " + this.eticheta;
    }
    public String toString(){
        return eticheta;
    }
}
