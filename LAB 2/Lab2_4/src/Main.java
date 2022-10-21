public class Main {
    public static void main(String[] args) {

        int x = 10;//la impartirea unui intreg la 0 se genereaza exceptie
        try {
            System.out.println(x / 0);
        }
        catch(ArithmeticException nx){
             System.out.println("Nu se poate face impartire la 0");
        }

        double z = -5.4, t = 5.4;
        System.out.println(z/0);// nr real negativ/0 => -Infinity
        System.out.println(t/0);// nr real pozitiv/0 => Infinity

        //infinit-infinit => NaN
        double inf = Double.POSITIVE_INFINITY;
        double inf2 = Double.POSITIVE_INFINITY;
        System.out.println(inf-inf2);
        //infinit*(-infinit) => -Infinity
        double inf3 = Double.NEGATIVE_INFINITY;
        System.out.println(inf*inf3);

        //asignare unei valori booleene un întreg
        //boolean ok = 1; => eroare
        //asignare unei valori întregi un număr în virgulă mobilă
        //int nr = 5.4; => eroare
    }
}