public class prime {

    public static void main(String[] args) {
        // Loop through numbers from 2 to 100
        for (int i = 2; i <= 100; i++) {
            int divisorCount = 0;

            // Count the divisors of the number
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }

            // A number is prime if it has exactly 2 divisors (1 and itself)
            if (divisorCount == 2) {
                System.out.println(i);
            }
        }
    }
}
