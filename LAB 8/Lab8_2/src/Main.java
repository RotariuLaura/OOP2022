public class Main {
    public static void main(String[] args) {
       Complex nr1 = new Complex(1, 2);
       Complex nr2 = new Complex(2,4);
       Complex nr3 = new Complex(1, 2);
       Complex nr4 = new Complex(2,4);
       Complex [][] matriceComplex = new Complex[][]{{nr1, nr2}, {nr3, nr4}};
       Complex [][] matriceComplex2 = new Complex[][]{{nr3, nr4}, {nr1, nr2}};
       Matrice mat = new Matrice(2, 2, matriceComplex);
       mat.adunare(matriceComplex2);
       System.out.println(mat);
       Fractie nr5 = new Fractie(1,5);
       Fractie nr6 = new Fractie(5,8);
       Fractie nr7 = new Fractie(1,5);
       Fractie nr8 = new Fractie(5,8);
       nr1.adunare(nr2);
       System.out.println(nr1);
       nr5.adunare(nr6);
       System.out.println(nr5);
       nr8.scadere(nr7);
       System.out.println(nr8);
       nr6.inmultire(nr8);
       System.out.println(nr6);
    }
}