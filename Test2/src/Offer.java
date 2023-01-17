import java.util.ArrayList;
import java.util.Objects;

public class Offer extends AbstractEntity{
    private String customer;
    private Double pret;
    private ArrayList <Product> listaProduse;
    public Offer(Long ID, String customer, ArrayList <Product> listaProduse){
        super(ID);
        this.customer = customer;
        this.listaProduse = listaProduse;
    }

    @Override
    public Long getId() {
        return ID;
    }

    @Override
    public void setID(Long ID) {
        this.ID = ID;
    }

    public ArrayList<Product> getListaProduse() {
        return listaProduse;
    }

    public void setListaProduse(ArrayList<Product> listaProduse) {
        this.listaProduse = listaProduse;
    }
    public Double getTotalPrice(){
        Double pretTotal = Double.valueOf(0);
        for(Product product: listaProduse){
            pretTotal += product.getPret();
        }
        return pretTotal;
    }

    public String getCustomer() {
        return customer;
    }

    public Double getPret() {
        return pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(customer, offer.customer) && (pret == offer.pret) && Objects.equals(listaProduse, offer.listaProduse);
    }
}
