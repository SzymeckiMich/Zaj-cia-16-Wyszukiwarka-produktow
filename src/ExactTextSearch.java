import java.util.ArrayList;
import java.util.List;

public class ExactTextSearch implements ProductSearchStrategy {
    @Override
    public List<Product> findByName(List<Product> allProducts, String name) {
        List<Product> passProducts = new ArrayList<>();
        for (int i = 0; i < allProducts.size(); i++) {
            if (name.equals(allProducts.get(i).getName())) {
                passProducts.add(allProducts.get(i));
            }
        }

        if (!passProducts.isEmpty()) {
            return passProducts;
        } else {
            return null;
        }

    }
}
