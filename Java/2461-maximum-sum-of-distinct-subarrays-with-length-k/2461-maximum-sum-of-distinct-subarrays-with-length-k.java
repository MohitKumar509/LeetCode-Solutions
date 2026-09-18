class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long sum = 0;
        long max = 0;

        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        int duplicate = 0;

        // Create first window
        for (int i = 0; i < k; i++) {

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            sum += nums[i];

            if (map.get(nums[i]) > 1) {
                duplicate++;
            }
        }

        // Check first window
        if (duplicate == 0) {
            max = Math.max(max, sum);
        }

        // Slide the window
        for (int i = k; i < n; i++) {

            int numToAdd = nums[i];
            int numToRemove = nums[i - k];

            // Add new element
            map.put(numToAdd, map.getOrDefault(numToAdd, 0) + 1);

            if (map.get(numToAdd) > 1) {
                duplicate++;
            }

            sum += numToAdd;

            // Remove old element
            if (map.get(numToRemove) > 1) {
                duplicate--;
            }

            map.put(numToRemove, map.get(numToRemove) - 1);

            sum -= numToRemove;

            // Check current window
            if (duplicate == 0) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}