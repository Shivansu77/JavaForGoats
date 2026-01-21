public class leetcode169 {
    public static int majorityElement(int[] nums) {
        //we will use boyce moore algorithmn
        int c = 0;
        int element=0;
        for(int i=0;i<nums.length;i++){
            if(c==0){
                element=nums[i];
            }
            if(element==nums[i]){
                c++;
            }else {
                c--;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        int []nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
