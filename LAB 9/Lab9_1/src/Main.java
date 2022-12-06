public class Main {
    public static void main(String[] args) {
        Zi zi1 = new Zi("Luni", false);
        Zi zi2 = new Zi("Marti", false);
        Zi zi3 = new Zi("Miercuri", true);
        Zi zi4 = new Zi("Joi", true);
        Zi zi5 = new Zi("Vineri", true);
        Zi zi6 = new Zi("Sambata", true);
        Zi zi7 = new Zi("Duminica", true);
        zi1.setLucratoare();
        zi2.setLucratoare();
        zi6.setNelucratoare();
        zi7.setNume("Duminica");
        zi7.setNelucratoare();
        Zi [] tablouZile = new Zi[8];
        tablouZile[0] = zi1;
        tablouZile[1] = zi2;
        tablouZile[2] = zi3;
        tablouZile[3] = zi4;
        tablouZile[4] = zi5;
        tablouZile[5] = zi6;
        tablouZile[6] = zi7;
        CalendarLucru calendarLucru = new CalendarLucru(tablouZile);
        calendarLucru.setTablouZile(tablouZile);
        Lucrator lucrator = new Lucrator("Gigel", calendarLucru);
        try{
            lucrator.lucreaza("Luni");
            lucrator.lucreaza("Marte");
            lucrator.lucreaza("Duminica");
        }
        catch(ExceptieZiNelucratoare e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Terminat");
        }


    }
}