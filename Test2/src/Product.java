public class Product extends AbstractEntity {
    private String name;
    private Double pret;
    public Product(Long ID, String name, Double pret){
        super(ID);
        this.name = name;
        this.pret = pret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Override
    public Long getId() {
        return this.ID;
    }

    @Override
    public void setID(Long ID) {
        this.ID = ID;
    }
}
