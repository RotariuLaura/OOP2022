public class Limits {
    public static void main(String[] args) {
        //adunaţi o cantitate întreagă la cel mai mare întreg primitiv din fiecare categorie de întregi
        System.out.println(Byte.MAX_VALUE + "\n");
        System.out.println(Byte.MAX_VALUE + (byte)25 + "\n");
        System.out.println(Short.MAX_VALUE + 25 + "\n");
        System.out.println(Integer.MAX_VALUE + 25 + "\n");
        System.out.println(Long.MAX_VALUE + 25 + "\n");
        //scădeţi o cantitate întreagă din cel mai mic întreg primitiv din fiecare categorie de întregi
        System.out.println(Byte.MIN_VALUE + "\n");
        System.out.println(Byte.MAX_VALUE - (byte)25 + "\n");
        System.out.println(Short.MIN_VALUE - 25 + "\n");
        System.out.println(Integer.MIN_VALUE - 25 + "\n");
        System.out.println(Long.MIN_VALUE - 25 + "\n");
        //înmulțiți cel mai mare număr real reprezentat în simplă și dublă precizie cu o valoare supraunitară
        System.out.println(Float.MAX_VALUE * 2); //=> Infinity
        System.out.println(Double.MAX_VALUE * 2); //=>Infinity
    }
}