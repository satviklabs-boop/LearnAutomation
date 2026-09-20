public class ReverseAlternateWords {

    public static void main(String[] args) {

        String sentence = "Java is very easy to learn";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {

            // Reverse alternate words
            if (i % 2 != 0) {
                words[i] = new StringBuilder(words[i])
                        .reverse()
                        .toString();
            }
        }

        // Print sentence
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}