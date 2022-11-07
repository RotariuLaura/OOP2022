public class Main {
    public static void main(String[] args) {

        NrComplex n1 = new NrComplex(2,2);
        NrComplex n2 = new NrComplex(4,2);
        NrComplex n3 = new NrComplex(1,2);
        NrComplex n4 = new NrComplex(2,4);
        n1.adunare(n2);
        System.out.println(n1);
        n1.scadere(n2);
        System.out.println(n1);
        n1.inmultireScalar(2);
        System.out.println(n1);
        n1.inmultireComplex(n2);
        System.out.println(n1);
        NrComplex[][] mat1 = new NrComplex[][]{{n1,n2}, {n3, n4}};
        NrComplex[][] mat2 = new NrComplex[][]{{n3, n4}, {n1, n2}};
        Matrice m1 = new Matrice(2, 2, mat1);
        Matrice m2 = new Matrice(2, 2, mat2);
        System.out.println();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println();
        System.out.println("Suma celor 2 matrice: ");
        m1.adunare(m2);
        System.out.println(m1);
        System.out.println("Diferenta celor 2 matrice: ");
        m1.scadere(m2);
        System.out.println(m1);
        int nr = 2;
        System.out.println("Inmultire cu scalar: ");
        m1.inmultireScalar(nr);
        System.out.println(m1);
        System.out.println("Inmultire 2 matrice: ");
        m1.inmultireMatrice(m2);
        System.out.println(m1);
    }
}