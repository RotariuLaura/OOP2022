//impachetare pt 3 valori intregi intr-o variabila de tip short si despachetare
//varsta(domeniu 0-127)-7biti, sex(domeniu 0-1)-1bit, inaltime(domeniu 0-255)-8 biti

public class Main {
    public static void main(String[] args) {

        int varsta = 20, sex = 0, inaltime = 155;
        short info_impachetata;
        //impachetare
        info_impachetata = (short)((((varsta << 1) | sex) << 8 ) | inaltime);
        //despachetare
        inaltime = info_impachetata & 0xff;
        sex = (info_impachetata >>> 8) & 1;
        varsta = (info_impachetata >>> 9) & 0x7f;
        System.out.println(inaltime + "\n" + sex + "\n" + varsta);
    }
}