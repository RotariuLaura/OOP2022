//Orice număr natural par mai mare decât 2 se poate scrie ca sumă a două numere prime –
//conjectura lui Goldbach. Scrieţi un program Java care să verifice această conjectură pentru
//numere situate între m şi n.

import java.util.*;

public class Conjectura {
    public static void main(String[] args) {
        int m, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti 2 numere intregi");
        m = in.nextInt();
        n = in.nextInt();
        in.close();
        for (int i = m; i <= n; i++) {
            conjecturaGoldbach(i);
         }
    }
    public static void conjecturaGoldbach(int nr){
        if(nr < 2 || nr % 2 == 1){
            System.out.println("Nu se poate");
        }
        else {
            int first, second;
            for (first = 2; first <= nr / 2; first++) {
                if (prim(first)) {
                    second = nr - first;
                    if (prim(second)) {
                        System.out.println(nr + " = " + first + " + " + second);
                        break;
                    }
                }
            }
        }
    }
    static boolean prim(int nr){
         boolean prim = true;
         if(nr <= 1)
             prim = false;
         else if(nr > 2 && nr % 2 == 0)
             prim = false;
         for(int i=3; i*i <=nr; i++) {
             if (nr % i == 0) {
                 prim = false;
                 break;
             }
         }
         return prim;
    }
}