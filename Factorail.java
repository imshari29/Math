import java.util.Scanner;

public class Factorail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = in.nextInt();
        int fact = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        while (fact > 0){
            int d = fact % 10;
            if(d == 0){
                sum++;
            }
            fact = fact / 10;
        }
        System.out.println("The trailing zeros in fact of "+n+" is : "+sum);
    }
}
// 1 * 2 * 3 * 4 * 5