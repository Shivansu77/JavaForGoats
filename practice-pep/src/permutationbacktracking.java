import java.util.*;

public class permutationbacktracking {

    public static void main(String[] args) {
        String str = "abc";
        List<String> result = permute(str);
        System.out.println(result);
    }

    public static List<String> permute(String str) {
        List<String> list = new ArrayList<>();
        boolean[] vis = new boolean[str.length()];
        solve(list, new StringBuilder(), str, vis);
        return list;
    }

    public static void solve(List<String> list, StringBuilder path, String str, boolean[] vis) {

        // Base case: permutation complete
        if (path.length() == str.length()) {
            list.add(path.toString());
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!vis[i]) {
                // CHOOSE
                vis[i] = true;
                path.append(str.charAt(i));
                // EXPLORE
                solve(list, path, str, vis);
                // UNCHOOSE (Backtrack)
                path.deleteCharAt(path.length() - 1);
                vis[i] = false;
            }
        }
    }
}
