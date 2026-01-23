import java.util.*;
public class leetcode658 {

    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int k=4,x=3;
        System.out.println(findClosestElements(arr,k,x));
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        List<Integer> list = new ArrayList<>();
        int left=0;
        int right=n-k;
        while(left<right){
            int mid=(left+right)/2;
            if(x-arr[mid]>arr[mid+k]-x){
               left=mid+1;
            }else{
                right=mid;
            }
        }
        for(int i=left;i<left+k;i++){
            list.add(arr[i]);
        }
        return list;
    }
}
