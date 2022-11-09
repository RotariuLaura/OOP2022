public class Ghiozdan {
    Rechizita [] listaRechizite = new Rechizita[10];
    int nrRechizite = 0;
    public void add(Caiet caiet){
        listaRechizite[nrRechizite++] = caiet;
    }
    public void add(Manual manual){

        listaRechizite[nrRechizite++] = manual;
    }
    public void listItems(){
        for(Rechizita crt: listaRechizite){
            System.out.println(crt);
        }
    }
    public void listManual(){
        for(Rechizita crt: listaRechizite){
            if(crt instanceof Manual){
                System.out.println(crt.getNume());
            }
        }
    }
    public void listCaiet(){
        for(Rechizita crt: listaRechizite){
            if(crt instanceof Caiet){
                System.out.println(crt.getNume());
            }
        }
    }
    public int getNrRechizite(){
        return nrRechizite;
    }
    public int getNrManuale(){
        int cnt = 0;
        for(Rechizita crt: listaRechizite){
            if(crt instanceof Manual){
                cnt++;
                //crt.getNume();
            }
        }
        return cnt;
    }
    public int getNrCaiete(){
        int cnt = 0;
        for(Rechizita crt: listaRechizite){
            if(crt instanceof Caiet){
                cnt++;
                //crt.getNume();
            }
        }
        return cnt;
    }
}
