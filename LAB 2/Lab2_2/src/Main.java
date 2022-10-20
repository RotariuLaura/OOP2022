import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //String s = "12345";
        //int x;
        //x = Integer.parseInt(s);
        //System.out.println(x);
        //long y;
        //y = Long.parseLong(s);
        //System.out.println("\n" + y);
        int val;
        while(true) {
            String t = JOptionPane.showInputDialog(null, "Introduceti un string");
            try {
                val = Integer.parseInt(t);
                break;
            }
            catch (NumberFormatException nx) {
                JOptionPane.showMessageDialog(null, "Introduceti un string valid");
            }
        }
        System.out.println(val);

    }
}