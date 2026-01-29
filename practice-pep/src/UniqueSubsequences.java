import java.util.*;

public class UniqueSubsequences {

    public static List<String> uniqueSubsequences(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr); // Step 1: sort to group duplicates

        List<String> result = new ArrayList<>();
        backtrack(arr, 0, new StringBuilder(), result);
        return result;
    }

    private static void backtrack(char[] arr, int index, StringBuilder current, List<String> result) {
        // Add every formed subsequence
        result.add(current.toString());

        for (int i = index; i < arr.length; i++) {

            // 🚫 Skip duplicates at same recursion level
            if (i > index && arr[i] == arr[i - 1]) continue;

            current.append(arr[i]);
            backtrack(arr, i + 1, current, result);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        System.out.println(uniqueSubsequences("aab"));
    }
}
