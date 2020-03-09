import java.util.ArrayList;
import java.util.List;

public class PartialTextSearch implements ProductSearchStrategy {
    @Override
    public List<Product> findByName(List<Product> allProducts, String name) {
        List<Product> passProducts = new ArrayList<>();
        for (int i = 0; i < allProducts.size(); i++) {
            if(allProducts.get(i).getName().contains(name)){
                passProducts.add(allProducts.get(i));
            }
        }

        if(!passProducts.isEmpty()) {
            return passProducts;
        }
        else{
            return null;
        }

    }
}
