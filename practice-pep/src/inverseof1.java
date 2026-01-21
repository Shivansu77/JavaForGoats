public class inverseof1 {
    public static void main(String[] args) {
        int n = 21453;
        int inv = 0;
        int op = 1;  // original position

        while(n != 0){
            int od = n % 10;       // original digit
            int id = op;            // original position
            inv = inv + id * (int) Math.pow(10, od - 1); // place position at digit
            n /= 10;               // remove last digit
            op++;                  // move to next position
        }

        System.out.println(inv);  // print inverse
    }
}
