import java.util.Arrays;
import java.util.Scanner;

public class diceTabulation {
    static final int MOD = 1_000_000_007;
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []dp=new int[n+1];
        dp[0]=1;
        for (int i = 1; i <= n ; i++) {
            long ways = 0;
            for(int dice=1;dice<=6;dice++){
                if(i-dice>=0) {
                    ways += dp[i - dice];
                }
            }
            dp[i] = (int)(ways % MOD);
        }
        System.out.println(dp[n]);
    }
}
