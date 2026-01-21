import java.util.*;
public class Leetcode925 {
    /*
    Input: name = "alex", typed = "aaleex"
    Output: true
    Explanation: 'a' and 'e' in 'alex' were long pressed.
    Example 2:

    Input: name = "saeed", typed = "ssaaedd"
    Output: false
    Explanation: 'e' must have been pressed twice, but it was not in the typed output.
     */
    public static void main(String [] args){
        String name = "alex";
        String typed = "aaleex";
        System.out.println(isLongPressedName(name,typed));

    }
    public static boolean isLongPressedName(String name,String typed){
        int n= name.length(),m=typed.length();
        int i=0,j=0;
        while(i<n && j<m){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else if(j>0 && typed.charAt(j)==typed.charAt(j-1)){
                j++;
            }else {
                return false;
            }
        }

        while(j<typed.length()){
            if(typed.charAt(j)!=name.charAt(name.length() - 1)){
                return false;
            }
            j++;
        }

        return i==name.length();
    }
}
