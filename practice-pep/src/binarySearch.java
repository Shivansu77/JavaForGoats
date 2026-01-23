public class binarySearch {
    static void main(String[] args) {
        int []arr={2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target=23;

        int s=0,e=arr.length-1;
        while(s<e){
            int mid=(s+e)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }else if(target<arr[mid]){
                e=mid+1;
            }else{
                s=mid;
            }
        }

    }
}
