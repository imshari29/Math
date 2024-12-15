public class OddNumsInSequence {
    public static void main(String[] args) {
        int n = 5327471;
        int ld = 0;
        int count = 0;
        while (n>0){
            ld = n % 10;
            if (ld % 2!= 0){
                count = count + 1;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
