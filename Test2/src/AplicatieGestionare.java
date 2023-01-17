import java.util.HashMap;
import java.util.Map;

public class AplicatieGestionare {
    Map<String, Product> products = new HashMap<>();
    ProductRepository productRepository = new ProductRepository(products);
    ProductService productService = new ProductService(productRepository);
    Product product1 = new Product(1L, "Lapte", 6.0);
    Product product2 = new Product(2L, "Oua", 12.0);
    Product product3 = new Product(3L, "Ciocolata", 5.0);
    Product product4 = new Product(4L, "Paine", 5.5);
    Product product5 = new Product(5L, "Unt", 10.0);
}
