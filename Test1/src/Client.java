import java.util.ArrayList;

public class Client extends Persoana{
    private final int nrProduseCumparate;
    ArrayList <Produs> listaProduseCumparate;
    Client(String ID, String nume, int nrProduseCumparate, ArrayList <Produs> list){
        super(ID, nume);
        this.nrProduseCumparate = nrProduseCumparate;
        this.listaProduseCumparate = list;
    }

    @Override
    public String toString() {
        return "Client-" + super.toString() + ", nrProduseCumparate: " + nrProduseCumparate +
                ", listaProduseCumparate: " + listaProduseCumparate;
    }
    public double calculSumaTotala(){
        double suma = 0;
        for(Produs produs: listaProduseCumparate){
            suma += produs.getPret();
        }
        suma = 0.5 * suma;
        return suma;
    }
}
