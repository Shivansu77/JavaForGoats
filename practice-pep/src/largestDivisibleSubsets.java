import java.util.*;
public class largestDivisibleSubsets {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        solve(ans,nums,0,-1,temp);
        return ans;
    }
    public void solve(List<Integer>ans,int []nums,int i,int prev,List<Integer>temp){
        if(i==nums.length){
            if(temp.size()>ans.size()){
                ans.clear();
                ans.addAll(temp);
            }
            return;
        }
        if(prev==-1 || nums[i]%nums[prev]==0){
            temp.add(nums[i]);
            solve(ans,nums,i+1,i,temp);
            temp.remove(temp.size()-1);
        }

        solve(ans,nums,i+1,prev,temp);

    }
}
