import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Character> letter = randomLetters(30);
        System.out.println(letter);
        //asc
        List<Character> ascletter =letter.stream().sorted().collect(Collectors.toList());
        System.out.println(ascletter);
        //desc
        List<Character> descletter =letter.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descletter);
        //discint
        List<Character> discntletter =letter.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(discntletter);




    }
    public static List<Character> randomLetters(int num)
    {
        Random random=new Random();
        List<Character> letters = new ArrayList<>();
        for(int i=0;i<num;i++)
        {
            letters.add((char) (random.nextInt(26)+'a'));
        }
        return letters;
    }
}
