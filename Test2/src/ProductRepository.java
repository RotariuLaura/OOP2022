import java.util.Map;

public class ProductRepository{
    Map<String, Product> products;
    ProductRepository(Map<String, Product> products){
        this.products = products;
    }
    public Product create(Long ID, String name, Double pret){
        Product product = new Product(ID, name, pret);
        products.put(product.getName(), product);
        return product;
    }
    public boolean delete(Product product) throws ProductNotFoundException{
        boolean found = false;
        for(String key: products.keySet()){
            if(products.containsValue(product)){
                products.remove(product);
                found = true;
            }
        }
        if(found == false){
            throw new ProductNotFoundException("Nu exista produsul");
        }
        return found;
    }

    public Map<String, Product> getProducts() {
        return products;
    }
}
