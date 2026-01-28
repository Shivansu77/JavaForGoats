import java.util.*;

public class subsequence {
    static void main(String[] args) {
        int []arr={3,1,2};
        System.out.println(sub(arr));
    }
    public static List<List<Integer>> sub(int []arr){
        int n=arr.length;
        List<List<Integer>>list = new ArrayList<>();
         solve(n,0,new ArrayList<>(),list,arr);
         return list;
    }
    public static void solve(int n,int i,List<Integer> current,List<List<Integer>>list,int []arr){
        if (i == n) {
            list.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[i]);
        solve(n,i+1,current,list,arr);
        current.remove(current.size()-1);
        solve(n,i+1,current,list,arr);

    }
}
