public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        int n = 657652;
        int ld = n % 10;
        int fd = 0;
        while (n > 0){
            fd = n % 10;
            n = n /10;
        }
        /* int fd = n;
        while (fd >= 10) {
           fd /= 10;
        }*/
        System.out.println("First Digit of n: "+fd);
        System.out.println("Last Digit of n: "+ld);
        int sum = ld + fd;
        System.out.println("Sum of First and Last Digits of n is: "+ sum);
    }
}
