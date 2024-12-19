public class CountDivisors {
    // Method to count divisors of N that are divisible by 3
    public static int countDivisors(int N) {
        int count = 0;

        // Loop from 1 to sqrt(N)
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) { // Check if i is a divisor
                if (i % 3 == 0) { // Check if i is divisible by 3
                    count++;
                }
                int pairedDivisor = N / i; // Find the paired divisor
                if (pairedDivisor != i && pairedDivisor % 3 == 0) {
                    // Check if paired divisor is divisible by 3 and not equal to i
                    count++;
                }
            }
        }

        return count;
    }

    // Main method for testing the countDivisors function
    public static void main(String[] args) {
        // Test cases
        System.out.println("Divisors of 6 divisible by 3: " + countDivisors(6));  // Output: 2
        System.out.println("Divisors of 10 divisible by 3: " + countDivisors(10)); // Output: 0
        System.out.println("Divisors of 36 divisible by 3: " + countDivisors(36)); // Output: 6
        System.out.println("Divisors of 27 divisible by 3: " + countDivisors(27)); // Output: 4
    }
}