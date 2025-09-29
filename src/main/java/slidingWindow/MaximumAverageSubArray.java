package slidingWindow;

public class MaximumAverageSubArray {

    public double findMaxAverage(int[] nums, int k) {
        double currentAverage = 0;
        double maxAverage = 0;
        int windowMinIndex = 0;
        int windowMaxIndex = k-1;
        for (int i = windowMinIndex; i < k; i++) {
            currentAverage += nums[i];
            maxAverage = currentAverage;
        }
        windowMaxIndex+=1;
        while (windowMaxIndex < nums.length) {
            currentAverage -=  nums[windowMinIndex];
            currentAverage +=  nums[windowMaxIndex];
            windowMaxIndex+=1;
            windowMinIndex+=1;
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
            }

        }

        return maxAverage/k;
    }

    public static void main(String[] args) {
        MaximumAverageSubArray ma = new MaximumAverageSubArray();
       ma.findMaxAverage(new int[]{-1},1);
    }
}
