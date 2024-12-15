import java.util.Scanner;
// reverse a number

class RevaNum1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num to br reversed: ");
        int n = in.nextInt();
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}