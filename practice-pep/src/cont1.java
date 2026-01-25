public class cont1 {
    static void main(String[] args) {
        int []nums={1,2,3,4};
        System.out.println(minimumPrefixLength(nums));
    }
    public static int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int []arr = new int[n];
        int i=n-2;
        int index=0;
        while(i>=0){
            if(nums[i]<nums[i+1]){
                i--;
            }else{
                index = i+1;
                break;
            }
        }
        return index;
    }
}
