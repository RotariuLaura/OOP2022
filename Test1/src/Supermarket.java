import java.util.ArrayList;

public class Supermarket {
    ArrayList <Produs> listaProduse;
    ArrayList <Angajat> listaAngajati;
    ArrayList <Client> listaClienti;
    ArrayList <ClientFidel> listaClientiFideli;
    Supermarket(ArrayList <Produs> listaProduse, ArrayList <Angajat> listaAngajati,
                ArrayList <Client> listaClienti, ArrayList<ClientFidel> listaClientiFideli){
        this.listaProduse = listaProduse;
        this.listaAngajati = listaAngajati;
        this.listaClienti = listaClienti;
        this.listaClientiFideli = listaClientiFideli;
    }
    public String listProduse(){
        StringBuilder rez = new StringBuilder();
        for(Produs produs : listaProduse){
            if(produs != null) {
                rez.append(produs).append("\n");
            }
        }
        return rez.toString();
    }
}
