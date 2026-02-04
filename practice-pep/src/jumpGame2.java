public class jumpGame2 {
    static void main(String[] args) {
        int []nums={2,3,1,1,4};
        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int n=nums.length;
        int []dp=new int[n+1];
        dp[0]=1;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=1;j<=nums[i];j++){
                if(i+j<n){
                    if(i+j!=0){
                        min=Math.min(dp[i+j],min);
                    }
                }
            }
        }
        return dp[n];
    }
}
