public class Sofer{
    String nume;
    String prenume;
    int varsta;
    int nrPermis;
    Sofer(String n, String p, int v, int nr){
        nume = n;
        prenume = p;
        varsta = v;
        nrPermis = nr;
    }
    public String getNume(){
        return this.nume;
    }

    public String getPrenume() {
        return prenume;
    }

//    public int getVarsta() {
//        return varsta;
//    }
//    public int getNrPermis() {
//        return nrPermis;
//    }
}
