import java.util.Arrays;

public class CalendarLucru {
    private Zi[] tablouZile;
    CalendarLucru(Zi[] tablouZile){
        this.tablouZile = tablouZile;
    }

    public Zi[] getTablouZile() {
        return tablouZile;
    }
    public void setTablouZile(Zi[] tablouZile) {
        this.tablouZile = tablouZile;
    }
    @Override
    public String toString() {
        return "CalendarLucru{" +
                "tablouZile=" + Arrays.toString(tablouZile) +
                '}';
    }
}
