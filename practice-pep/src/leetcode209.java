public class leetcode209 {
    public static void main(String[] args) {
        int target = 7;
        int []nums={2,3,1,2,4,3};
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0,right=0;
        int sum=0;
        int len=Integer.MAX_VALUE;
        while(right<n){
            sum+=nums[right];
            while(target<=sum){
                len=Math.min(len,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}
