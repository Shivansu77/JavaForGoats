import java.util.*;

public class BuildingBridges {

    static class Pair {
        int north, south;
        Pair(int n, int s) {
            north = n;
            south = s;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {6, 4, 2, 1};
        int[] a2 = {2, 3, 6, 5};

        System.out.println(buildingBridges(a1, a2));
    }

    public static int buildingBridges(int[] a1, int[] a2) {
        int n = a1.length;
        Pair[] bridges = new Pair[n];

        for (int i = 0; i < n; i++) {
            bridges[i] = new Pair(a1[i], a2[i]);
        }

        // Sort by north bank
        Arrays.sort(bridges, (a, b) -> a.north - b.north);

        return solve(bridges, 0, -1);
    }

    public static int solve(Pair[] bridges, int i, int prev) {
        if (i == bridges.length) return 0;

        int take = 0;
        if (prev == -1 || bridges[prev].south <= bridges[i].south) {
            take = 1 + solve(bridges, i + 1, i);
        }

        int skip = solve(bridges, i + 1, prev);

        return Math.max(take, skip);
    }
}
