import java.util.Scanner;

public class FirstDigitOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = in.nextInt();
        int fd = 0;
        while ( n > 0){
            fd = n % 10;
            n = n / 10;
        }
        System.out.println(fd);
    }
}
/*
int fd= n ;
        while(fd >= 10){
            fd = fd / 10;
        }
 */
