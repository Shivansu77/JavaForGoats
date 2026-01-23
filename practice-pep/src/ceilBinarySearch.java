public class ceilBinarySearch {
    public static void main(String[] args) {
        int []arr={1, 2, 8, 10, 11, 12, 19};
        int x=5;
        System.out.println(findCeil(arr,x));
    }
    public static int findCeil(int[] arr, int x) {
        // code here
        int n=arr.length;
        int s=0;
        int e=n-1;
        int min=Integer.MAX_VALUE;
        while(s<=e){
            int mid=(s)+(e-s)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                s=mid+1;
                min=Math.min(min,s);
            }else{
                e=mid;
            }
        }
        return min;

    }
}
