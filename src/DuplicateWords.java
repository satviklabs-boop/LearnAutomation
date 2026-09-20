import java.util.HashMap;

public class DuplicateWords {

    public static void findDuplicateWords(String str) {

        String[] words = str.toLowerCase().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : map.keySet()) {

            if (map.get(word) > 1) {
                System.out.println(word + " = " + map.get(word));
            }
        }
    }

    public static void main(String[] args) {

        String str = "Java is easy and Java is powerful";

        findDuplicateWords(str);
    }
}