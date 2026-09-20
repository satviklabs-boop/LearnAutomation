public class StringPermutaions {


        public static void main(String[] args) {

            String str = "ABCDEF";

            permute(str, 0);
        }

        static void permute(String str, int start) {

            // If we reached the last character
            if (start == str.length() - 1) {
                System.out.println(str);
                return;
            }

            for (int i = start; i < str.length(); i++) {

                // Swap current character with i
                str = swap(str, start, i);

                // Fix current character and permute remaining
                permute(str, start + 1);

                // Backtrack
                str = swap(str, start, i);
            }
        }

        static String swap(String str, int i, int j) {

            char[] arr = str.toCharArray();

            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            return new String(arr);
        }
    }



