public class Lucrator {
    private final String nume;
    private CalendarLucru calendarLucru;
    Lucrator(String nume, CalendarLucru calendarLucru){
        this.nume = nume;
        this.calendarLucru = calendarLucru;
    }
    public void lucreaza(String zi) throws ExceptieZiNelucratoare{
        for(Zi zi1: calendarLucru.getTablouZile()){
            if(zi1.getNume().equals(zi)){
                if(!zi1.esteLucratoare()) {
                    throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
                }
                else if(zi1.esteLucratoare()) {
                    System.out.println("Lucratorul " + this.nume + " lucreaza " + zi);
                    return;
                }
            }
            else{
                System.out.println(zi + " nu este o zi a saptamanii");
                return;
            }
        }

    }
}
