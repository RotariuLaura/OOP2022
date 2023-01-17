import java.util.ArrayList;

public interface OfferService extends AppService {
    ArrayList<Offer> findAllByProductName(String name);
}
