import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Value : ");
        int n = in.nextInt();

        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                sum = sum + i;
                if (n / i != i){
                    sum = sum + (n/i);
                }
            }
            if (sum == n){
                System.out.println("perfect number");
            }else {
                System.out.println("not perfect number");
            }
        }
    }
}
