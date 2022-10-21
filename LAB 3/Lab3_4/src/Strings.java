public class Strings {
    public static void main(String [] args){
        concat();
        evaluateEquality();
    }
    public static void concat() {
        String s1 = new String("Programare ");
        String s2 = new String("orientata ");
        String s3 = new String("pe ");
        String s4 = new String("obiect");
        System.out.println(s1 + s2 + s3 + s4);
    }
    //testare egalitatea referințelor (operatorul ==) și conținuturilor (metoda equals)
    public static void evaluateEquality(){
        String s1 = new String("Laura");
        String s2 = new String("Laura");
        String s3 = s1; // s1 si s3 se refera la acelasi obiect
        System.out.println("s1 == s2 ? : " + (s1 == s2));
        System.out.println("s1.equals(s2) ? : " + (s1.equals(s2)));
        System.out.println("s1 == s3 ? : " + (s1 == s3));
        System.out.println("s1.equals(s3) ? : " + (s1.equals(s3)));
    }
}
