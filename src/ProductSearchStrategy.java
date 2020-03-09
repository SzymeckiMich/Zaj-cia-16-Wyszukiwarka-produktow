import java.util.List;

public interface ProductSearchStrategy {
        List<Product> findByName(List<Product> allProducts, String name);
}
