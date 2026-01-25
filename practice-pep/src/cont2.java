import java.util.ArrayList;
import java.util.Collections;

public class cont2 {
    public static void main(String[] args) {
        int[] nums = {5, 4, -9, 6};
        int k = 2;

        int[] result = rotateElements(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        ArrayList<Integer> positives = new ArrayList<>();

        // collect positive elements
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                positives.add(nums[i]);
            }
        }

        // rotate positives to the right by k
        k = k % positives.size();
        Collections.rotate(positives, k);

        // put rotated positives back into nums
        int posIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                nums[i] = positives.get(posIndex++);
            }
        }

        return nums;
    }
}
