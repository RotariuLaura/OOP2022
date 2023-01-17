import java.util.ArrayList;
import java.util.Locale;

public class ProductService implements AppService{
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public <T> Product create(T element, T element1, T element2) throws ValidationFailedException{
        Long ID = (Long) element;
        String nume = (String) element1;
        Double pret = (Double) element2;
        Product product = new Product(ID, nume, pret);
        if(pret > 0 && !(nume.contains("1234567890"))) {
            productRepository.getProducts().put(product.getName(), product);
        }
        else throw new ValidationFailedException("Nume sau pret invalid");
        return product;
    }

    @Override
    public ArrayList<Product> search(String element) {
        String element2 = element.toLowerCase();
        ArrayList <Product> list = new ArrayList<>();
        for (String key : productRepository.getProducts().keySet()) {
            String letters = "";
            letters = String.valueOf(productRepository.getProducts().get(key).getName().charAt(0)).toLowerCase() +
                    String.valueOf(productRepository.getProducts().get(key).getName().charAt(1)).toLowerCase();
            if(letters.equals(element2)){
                list.add(productRepository.getProducts().get(key));
            }
        }
        return list;
    }

    @Override
    public <T> boolean delete(T element) {
        try{
            Product product = (Product) element;
            productRepository.delete(product);
        }
        catch (ProductNotFoundException e){
           System.out.println("Exceptie prinsa.");
        }
        return  true;
    }
}
