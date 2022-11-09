public class TestGhiozdan {
    public static void main(String[] args) {

        Ghiozdan ghiozdan = new Ghiozdan();
        Caiet c1 = new Caiet("caiet teme romana");
        Caiet c2 = new Caiet("caiet clasa romana");
        Caiet c3 = new Caiet("caiet teme mate");
        Caiet c4 = new Caiet("caiet clasa mate");
        ghiozdan.add(c1);
        ghiozdan.add(c2);
        ghiozdan.add(c3);
        ghiozdan.add(c4);
        Manual m1 = new Manual("manual romana");
        Manual m2 = new Manual("manual mate");
        Manual m3 = new Manual("manual engleza");
        Manual m4 = new Manual("manual franceza");
        ghiozdan.add(m1);
        ghiozdan.add(m2);
        ghiozdan.add(m3);
        ghiozdan.add(m4);
        System.out.println("Nr total de rechizite: " + ghiozdan.getNrRechizite());
        System.out.println("Nr total de caiete: "+ ghiozdan.getNrCaiete());
        System.out.println("Nr total de manuale: " + ghiozdan.getNrManuale());
        System.out.println("Rechizitele: ");
        ghiozdan.listItems();
        System.out.println("Caiete: ");
        ghiozdan.listCaiet();
        System.out.println("Manuale: ");
        ghiozdan.listManual();
    }
}