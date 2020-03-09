import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        ProductRepository repository = new ProductRepository("ProductsInBiedronka.txt");
        ExactTextSearch ets = new ExactTextSearch();
        PartialTextSearch pts = new PartialTextSearch();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyszukiwaną frazę: ");
        String findName = scanner.nextLine();

        List<Product> taSamaNazwa = ets.findByName(repository.getList(), findName);
        List<Product> wyszukajWNazwie = pts.findByName(repository.getList(), findName);

        System.out.println("Ta sama nazwa: " + taSamaNazwa);
        System.out.println("Wyszukane w nazwie: " + wyszukajWNazwie.toString());



    }


}
