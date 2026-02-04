import java.util.*;
public class dice {
    static final int MOD = 1_000_000_007;
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(solve(n,dp));

    }
    public static int solve(int n,int []dp){
        if(n==0){
            return 1;
        }
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int count = 0;
        for(int dice=1;dice<=6;dice++){
            count=(count + solve(n - dice, dp)) % MOD;
        }
        dp[n]=(int)count;
        return dp[n];
    }
}
