public class SecoundLargest {

    public static void main(String[] args) {

        int[] arr = {10, 5, 30, 2};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length-1; j++) {

                if (arr[j] > arr[i]) {

                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }


        }
        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);}
        System.out.println("Secound Highest::"+arr[1]);

    }
}