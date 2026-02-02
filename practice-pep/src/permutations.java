import java.sql.SQLOutput;
import java.util.*;
public class permutations {
    public static void main(String[] args) {
        String str="abc";
        int n=str.length();
        solve(str,"");
    }
    public static void solve(String str,String result){
        if(str.length()==0){
            System.out.println(result);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            solve(rem,result+rem);
        }
    }
}
