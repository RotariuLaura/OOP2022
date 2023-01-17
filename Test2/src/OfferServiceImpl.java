import java.util.ArrayList;

public class OfferServiceImpl implements OfferService {
    ArrayList<Offer> offerts = new ArrayList<>();

    public OfferServiceImpl(ArrayList<Offer> offerts) {
        this.offerts = offerts;
    }

    @Override
    public ArrayList<Offer> findAllByProductName(String name) {
        ArrayList <Offer> offers = new ArrayList<>();
        for(Offer offer: offerts){
            for(Product product: offer.getListaProduse()){
                if(product.getName().equals(name)){
                    offers.add(offer);
                }
            }
        }
        return offers;
    }

    public void create(Offer offer) throws ValidationFailedException {
        if (!(offer.getCustomer() != null && offer.getListaProduse().size() >= 1))
            throw new ValidationFailedException("Oferta invalida");
    }

    public ArrayList<Offer> search(String nume) {
        ArrayList<Offer> offers = new ArrayList<>();
        //int cnt = nume.length();
        for (Offer offer : offerts) {
            if (offer.getCustomer().contains(nume)) {
                offers.add(offer);
            }
        }
        return offers;
    }

    public boolean delete(Offer offer) throws OffertNotFoundException {
        boolean found = false;
        for (int i = 0; i < offerts.size(); i++) {
            if (offerts.get(i).equals(offer)) {
                offerts.remove(offerts.get(i));
                found = true;
            }
        }
        if (found == false) {
            throw new OffertNotFoundException("Oferta nu exista!");
        }
        return found;
    }

    @Override
    public <T> Object create(T element, T element1, T element2) throws ValidationFailedException {
        return null;
    }

    @Override
    public <T> boolean delete(T element) {
        return false;
    }
}
