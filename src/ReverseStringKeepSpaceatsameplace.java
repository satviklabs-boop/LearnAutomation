public class ReverseStringKeepSpaceatsameplace {


        public static void main(String[] args) {

            String str = "ab cd ef";

            char[] arr = str.toCharArray();

            int left = 0;
            int right = arr.length - 1;

            while (left < right) {

                // Skip space from left
                if (arr[left] == ' ') {
                    left++;
                }

                // Skip space from right
                else if (arr[right] == ' ') {
                    right--;
                }

                // Swap characters
                else {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }
            }

            System.out.println(arr);
        }
    }


