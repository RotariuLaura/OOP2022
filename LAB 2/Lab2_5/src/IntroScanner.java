import java.util.*;

public class IntroScanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y;
        System.out.println("Introduceti un nr intreg: ");
        x = in.nextInt();
        System.out.println("Nr intreg citit este: " + x + "\n");
        System.out.println("Introduceti inca un nr intreg: ");
        y = in.nextInt();
        System.out.println("Nr intreg citit este: " + y + "\n");

        float z, t;
        System.out.println("Introduceti un nr real: ");
        z = in.nextFloat();
        System.out.println("Nr real citit este: " + z + "\n");
        System.out.println("Introduceti inca un nr real: ");
        t = in.nextFloat();
        System.out.println("Nr real citit este: " + t + "\n");
        in.close();
    }
}