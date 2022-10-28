import java.awt.*;

public class TestDrive {
    public static void main(String[] args) {
        TestDrive td = new TestDrive();
        td.start();
    }

    public void start() {
        Autovehicul A = new Autovehicul("DACIA", Color.red, 50, 200, 3, "Popescu", "Ion", 40, 12345, new Rezervor(60, 30f, 0.5f));
        drive(A);
        Autovehicul B = new Autovehicul("BMW", Color.black, 70, 280, 4, "Vieru", "Ana", 25, 45368, new Rezervor(60, 60f, 1f));
        drive(B);
        Autovehicul C = new Autovehicul("Mercedes-Benz", Color.gray, 50, 280, 3, "Vintan", "Andrei", 30, 98645, new Rezervor(80, 80f, 1f));
        drive(C);
        Autovehicul D = new Autovehicul("Kia", Color.black, 90, 200, 5, "Anton", "Florina", 24, 76458, new Rezervor(80, 20f, 0.25f));
        drive(D);
        Autovehicul E = new Autovehicul("Ford", Color.blue, 110, 220, 6, "Moldovan", "Claudia", 35, 87542, new Rezervor(60, 30f, 0.5f));
        drive(E);

    }
    public void drive(Autovehicul autovehicul){
        System.out.println(autovehicul.toString());
        System.out.println(autovehicul.toStringSofer());
        autovehicul.accelerare(20);
        System.out.println("Viteza noua: " + autovehicul.getVitezaCurenta());
        autovehicul.decelerare(10);
        System.out.println("Viteza noua: " + autovehicul.getVitezaCurenta());
        autovehicul.schimbareTrepte(4);
        System.out.println("Treapta noua:" + autovehicul.getTreaptaCurenta());
        autovehicul.oprire();
        autovehicul.rezervor.umplere(20);
        System.out.println("Noua cantitate de combustibil: " + autovehicul.rezervor.getCantitateCombustibil() + ", nivelul de umplere: " + autovehicul.rezervor.getNivelUmplere());
        autovehicul.rezervor.golire(10);
        System.out.println("Noua cantitate de combustibil: " + autovehicul.rezervor.getCantitateCombustibil() + ", nivelul de umplere: " + autovehicul.rezervor.getNivelUmplere());
        //System.out.println(autovehicul.toString());
    }
}
