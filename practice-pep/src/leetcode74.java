public class leetcode74 {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        //we will use binary search
        int s=0;
        int e=matrix.length-1;

        while(s<=e){
            int m=s+(e-s)/2;
            if(matrix[m][0]>target){
                e=m-1;
            }else if(matrix[m][matrix[0].length-1]<target){
                s=m+1;
            }else{
                int left=0,right=matrix[0].length-1;
                while(left<=right){
                    int mid2=(left)+(right-left)/2;
                    if(matrix[m][mid2]<target){
                        right=mid2+1;
                    }else if(matrix[m][mid2]>target){
                        left=mid2-1;
                    }else{
                        return true;
                    }
                }
            }
        }
            return false;
    }
}
