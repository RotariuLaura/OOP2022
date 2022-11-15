import java.util.ArrayList;
import java.util.Collections;

public class SimulareSupermarket {
    public static void main(String[] args) {
        SimulareSupermarket ss = new SimulareSupermarket();
        ArrayList<Produs> listaProduse = new ArrayList<>();
        ArrayList <Angajat> listaAngajati = new ArrayList<>();
        ArrayList <Client> listaClienti = new ArrayList<>();
        ArrayList <ClientFidel> listaClientiFideli = new ArrayList<>();
        ss.creare(listaProduse, listaAngajati, listaClienti, listaClientiFideli);
        //afisare clienti fideli sortati dupa suma totala cumparaturi
        ss.sortareClientiFideli(listaClientiFideli);
        //afisare angajati sortati dupa nr de clienti serviti
        ss.sortareAngajati(listaAngajati);
    }
    public void creare(ArrayList<Produs> listaProduse, ArrayList <Angajat> listaAngajati, ArrayList<Client> listaClienti,
                     ArrayList <ClientFidel> listaClientiFideli){
        Produs produs1 = new Produs("Paine", 10, 100);
        Produs produs2 = new Produs("Apa", 5, 200);
        Produs produs3 = new Produs("Cafea", 25, 250);
        Produs produs4 = new Produs("Ciocolata", 15, 150);
        Produs produs5 = new Produs("Chipsuri", 8, 100);
        if(produs1.verificaStoc())  listaProduse.add(produs1);
        if(produs2.verificaStoc())  listaProduse.add(produs2);
        if(produs3.verificaStoc())  listaProduse.add(produs3);
        if(produs4.verificaStoc())  listaProduse.add(produs4);
        if(produs5.verificaStoc())  listaProduse.add(produs5);
        Angajat angajat1 = new Angajat("P01AN", "Marian Pop", 2);
        Angajat angajat2 = new Angajat("P02AN", "Ana Mihai", 3);
        listaAngajati.add(angajat1);
        listaAngajati.add(angajat2);
        ArrayList <Produs> listaClient1 = new ArrayList<>();
        if(produs1.verificaStoc())  listaClient1.add(produs1);
        if(produs2.verificaStoc())  listaClient1.add(produs2);
        ArrayList <Produs> listaClient2 = new ArrayList<>();
        if(produs3.verificaStoc())  listaClient2.add(produs3);
        if(produs4.verificaStoc())  listaClient2.add(produs4);
        if(produs5.verificaStoc())  listaClient2.add(produs5);
        Client client1 = new Client("P03CL", "Maria Ioan", 2, listaClient1);
        Client client2 = new Client("P04CL", "Calin Ciprian", 3, listaClient2);
        listaClienti.add(client1);
        listaClienti.add(client2);
        ArrayList <Produs> listaClientFidel1 = new ArrayList<>();
        if(produs1.verificaStoc())  listaClientFidel1.add(produs1);
        if(produs2.verificaStoc())  listaClientFidel1.add(produs2);
        ArrayList <Produs> listaClientFidel2 = new ArrayList<>();
        if(produs1.verificaStoc())  listaClientFidel2.add(produs1);
        if(produs4.verificaStoc())  listaClientFidel1.add(produs4);
        if(produs5.verificaStoc())  listaClientFidel2.add(produs5);
        ClientFidel clientFidel1 = new ClientFidel("P05CL", "Cosmin Pop", 2, listaClientFidel1, 200);
        ClientFidel clientFidel2 = new ClientFidel("P06CL", "Andreea Manea", 3, listaClientFidel2, 100);
        listaClientiFideli.add(clientFidel1);
        listaClientiFideli.add(clientFidel2);
        Supermarket supermarket = new Supermarket(listaProduse, listaAngajati, listaClienti, listaClientiFideli);
        System.out.println(clientFidel1.calculSumaTotala(clientFidel1.getNrPuncte()));
        System.out.println(clientFidel2.calculSumaTotala(clientFidel2.getNrPuncte()));
        System.out.println(supermarket.listProduse());
        //supraincarcare metoda calculSumaTotala
        clientFidel1.calculSumaTotala();
        clientFidel1.calculSumaTotala(clientFidel1.getNrPuncte());
    }
    public void sortareClientiFideli(ArrayList <ClientFidel> listaClientiFideli){
        System.out.println("Clientii fideli: ");
        Collections.sort(listaClientiFideli);
        for(ClientFidel clientFidel : listaClientiFideli){
            if(clientFidel != null){
                System.out.println(clientFidel);
            }
        }
    }
    public void sortareAngajati(ArrayList <Angajat> listaAngajati){
        System.out.println("Angajatii: ");
        Collections.sort(listaAngajati);
        for(Angajat angajat : listaAngajati){
            if(angajat != null){
                System.out.println(angajat);
            }
        }
    }


}