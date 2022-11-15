import java.util.ArrayList;

public class ClientFidel extends Client implements Comparable <ClientFidel>{
    private final int nrPuncte;
    ClientFidel(String ID, String nume, int nrProduseCumparate, ArrayList<Produs> list, int nrPuncte){
        super(ID, nume, nrProduseCumparate, list);
        this.nrPuncte = nrPuncte;
    }

    public int getNrPuncte() {
        return nrPuncte;
    }

    public String toString() {
        return "Client fidel-" + super.toString() + ", nr puncte acumulate: " + nrPuncte;
    }
    public double calculSumaTotala(int nrPuncte){
        double suma = 0;
        for(Produs produs: listaProduseCumparate){
            suma += produs.getPret();
        }
        double aux = 0.5 * nrPuncte;
        suma = aux/100 * suma;
        return suma;
    }
    public int compareTo(ClientFidel clientFidel1){
        return (int) (this.calculSumaTotala(this.nrPuncte) - clientFidel1.calculSumaTotala(clientFidel1.nrPuncte));
    }
}
