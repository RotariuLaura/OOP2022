abstract class AbstractEntity {
    Long ID;
    AbstractEntity(Long ID){
        this.ID = ID;
    }
    public abstract Long getId();

    public abstract void setID(Long ID);
}
