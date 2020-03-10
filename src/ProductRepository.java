import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements ProductSearchStrategy {

    private List<Product> list = new ArrayList<>();
    private ProductSearchStrategy strategy;

    public ProductRepository(String filename, ProductSearchStrategy strategy) throws FileNotFoundException {
        this.strategy = strategy;

        File file = new File(filename);


        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            double price = Double.parseDouble(split[1]);
            this.list.add(new Product(split[0], price, split[2]));
        }
    }

    public void setStrategy(ProductSearchStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Product> getList() {
        return list;
    }

    @Override
    public List<Product> findByName(List<Product> list, String name) {
        return strategy.findByName(list, name);
    }
}
