import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements ProductSearchStrategy{

    private List<Product> list = new ArrayList<>();

    public ProductRepository(String filename) throws FileNotFoundException {
        File file = new File(filename);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(";");
            double price = Double.parseDouble(split[1]);
            this.list.add(new Product(split[0], price, split[2]));
        }
    }

    public List<Product> getList() {
        return list;
    }

    @Override
    public List<Product> findByName(List<Product> allProducts, String name) {
        return null;
    }
}
