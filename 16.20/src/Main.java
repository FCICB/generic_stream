import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input text:");
        String text = input.nextLine();
        String[] words = text.split(" ");

        Set<String> sortedWords = new TreeSet<>();
        for (String string : words) {
            sortedWords.add(string);
        }

        for (String string : sortedWords) {
            System.out.println(string);
        }
    }
}
