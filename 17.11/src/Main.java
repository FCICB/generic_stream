import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Invoice[] invoices = { new Invoice(83, "Electric sander", 7, 57.98), new Invoice(24, "Power saw", 18, 99.99),
                new Invoice(7, "Slledge hammer", 11, 21.50), new Invoice(77, "Hammer", 76, 11.99),
                new Invoice(39, "Lawn mower", 3, 79.50), new Invoice(68, "Scredriver", 106, 6.99),
                new Invoice(56, "Jig saw", 21, 11.00), new Invoice(3, "Wrench", 34, 7.50) };

        Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getPartDescryption)).forEach(System.out::println);
        Arrays.stream(invoices).sorted(Comparator.comparing(Invoice::getPrice)).forEach(System.out::println);
        Predicate<Invoice> twoToFiveHundreds = e -> (e.getPrice() * e.getQuantity() >= 200
                && e.getPrice() * e.getQuantity() <= 500);

        Arrays.stream(invoices).filter(twoToFiveHundreds)
                .collect(Collectors.toMap(Invoice::getPartDescryption,i->i.getPrice() * i.getQuantity())).entrySet()
                .forEach((entry) -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
