package twoPointers;

//link: https://leetcode.com/problems/max-number-of-k-sum-pairs/
public class MaxOperations {
    public int maxOperations(int[] nums, int k) {
        if (nums.length == 1) return 0;
        int operations = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < k) {
                int counterPart = k - nums[i];
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == counterPart) {
                        nums[j] = k;
                        operations++;
                        break;
                    }
                }
            }
        }

        return operations;

    }
    public static void main(String[] args) {
        System.out.println(new MaxOperations().maxOperations(new int[]{3,1,3,4,3}, 6));
    }
}
