import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        Pattern pattern = Pattern.compile("");

        Files.lines(Paths.get(""))
                .map(line -> line.replaceAll("\\W+",""))
                .flatMap(line->pattern.splitAsStream(line))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting()))
                .forEach((s,l)->System.out.printf("%s : %d %n",s,l));
    }
}
