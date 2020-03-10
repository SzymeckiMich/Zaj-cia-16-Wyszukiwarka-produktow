import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {

        ExactTextSearch ets = new ExactTextSearch();
        PartialTextSearch pts = new PartialTextSearch();

        ProductRepository repository = new ProductRepository("ProductsInBiedronka.txt", ets);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyszukiwaną frazę: ");
        String findName = scanner.nextLine();

        List<Product> taSamaNazwa = repository.findByName(repository.getList(), findName);
        System.out.println("Ta sama nazwa: " + taSamaNazwa);
        repository.setStrategy(pts);
        List<Product> wyszukajWNazwie = repository.findByName(repository.getList(), findName);
        System.out.println("Wyszukane w nazwie: " + wyszukajWNazwie.toString());
    }


}
