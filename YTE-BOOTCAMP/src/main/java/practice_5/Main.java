package practice_5;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of("T.C. sanayi VE teknoloji BAKANLIĞI", "STB", "TÜBİTAK", "TÜBİTAK", "TÜBİTAK", "BilGEm", "YTE", "Yazılım", "yazılım", "YAZILIM", "     ", " ", "", "Teknolojileri", "Araştırma", "Enstitüsü", "java", "stream"));
        System.out.println(stringList);

        List<String> finalList = stringList.stream().filter(string -> !string.isEmpty()).map(String::toUpperCase).filter(string -> string.contains("A")).sorted(Comparator.reverseOrder()).distinct().toList();
        System.out.println(finalList);
    }
}