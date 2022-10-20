import java.math.BigInteger;
import static java.lang.Math.pow;
/*
Problema boabelor de grâu pe o tablă de şah: dacă pe o tablă de şah se aşează boabe de grâu astfel încât pe prima căsuţă a tablei este
un bob de grâu, pe a doua căsuţă sunt 2 boabe de gâu, pe a treia căsuţă sunt 4 boabe de grâu ş.a.m.d. (numărul de boabe de grâu se
dublează la fiecare căsuţă) şi pentru căsuţa i sunt 2^i-1, câte boabe de grâu sunt în total pe tabla de şah? Sugestie:folosiţi obiecte
BigInteger pentru a calcula numărul total de boabe de grâu.
*/

public class Main {
    public static void main(String[] args) {
      BigInteger aux, total;
      total = new BigInteger("0");
      aux = new BigInteger("0");
      for(int i=0; i<64; i++){
          aux = BigInteger.valueOf((long)pow(2, i));
          total=total.add(aux);
      }
      System.out.println(total);
    }
}