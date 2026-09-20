public class EquilibriumPoint {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2, 3};

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + arr[j];
            }

            // Calculate right sum
            for (int j = i + 1; j < arr.length; j++) {
                rightSum = rightSum + arr[j];
            }

            // Check equilibrium
            if (leftSum == rightSum) {
                System.out.println("Equilibrium Point = " + arr[i]);
                System.out.println("Index = " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Equilibrium Point");
        }
    }
}