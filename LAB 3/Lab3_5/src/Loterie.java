//Implementați o aplicație pentru orice loterie în care să:
//a) calculați şansele de câştig la loterie (ex. 6 din 49)
//b) simulați extragerea numerelor la loterie (pentru generarea numerelor aleatoare folosiţi
//Math.random)
//c) afişaţi în ordine crescătoare/descrescătoare numerele extrase la loterie fără a face sortări
//sau a folosi tablouri. (Sugestie: folosiţi împachetarea/despachetarea/extragerea de biţi stocaţi
//într-un long)

import java.math.BigInteger;
import java.util.Random;

public class Loterie{
    public static void main(String[] args){
        BigInteger sansa = new BigInteger("0");
        sansa = lot(6, 49);
        System.out.println("Sansa de a castiga la lotto 6/49: 1/" + sansa);
        extragere();
    }
    private static BigInteger lot(int x, int y){
        BigInteger aux = new BigInteger("1");
        for(int i=y-x+1; i<=y; i++){
            aux = aux.multiply(new BigInteger("0" + i));
        }
        int p = 1;
        for(int i=1; i<=x; i++){
            p = p * i;
        }
        return aux.divide(new BigInteger("0" + p ));
    }
    public static void extragere(){
        Random rand = new Random();
        System.out.println("Cele 6 nr extrase: ");
        for(int i=0; i<6; i++){
            int x = rand.nextInt(1, 49);
            System.out.print(x + " ");
        }
    }
}