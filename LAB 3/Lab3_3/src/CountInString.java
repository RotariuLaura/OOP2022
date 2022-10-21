import java.util.*;

public class CountInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        count(t);
        char v = in.next().charAt(0);
        vowel_index(t, v);
        in.close();
    }
    public static void count(String s)
        {
            //String s = "Programare orientata pe obiect";
            s = s.toLowerCase();
            int vCnt = 0, cCnt = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                        || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                    vCnt++;
                }
                else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    cCnt++;
                }
            }
            System.out.println("Numarul de vocale: " + vCnt);
            System.out.println("Numarul de consoane: " + cCnt);
        }
    public static void vowel_index(String s, char v){
        s = s.toLowerCase();
        System.out.println("Pozitiile din sir unde apare vocala " + v + ":");
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == v){
                System.out.print(i + " ");
            }
        }
    }
}