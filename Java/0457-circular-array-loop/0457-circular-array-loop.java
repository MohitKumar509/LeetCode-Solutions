class Solution {

    private int nextIndex(int[] nums, int index) {
        int n = nums.length;

        return (index + nums[index] % n + n) % n;
    }

    public boolean circularArrayLoop(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            // Try to find a cycle starting from i
            boolean isPositive = nums[i] > 0;

            int slow = i;
            int fast = i;

            while (true) {

                // Move slow one step
                int slowNext = nextIndex(nums, slow);

                // Direction changed
                if ((nums[slowNext] > 0) != isPositive) {
                    break;
                }

                // One-element cycle
                if (slowNext == slow) {
                    break;
                }

                // Move fast one step
                int fastNext = nextIndex(nums, fast);

                // Direction changed
                if ((nums[fastNext] > 0) != isPositive) {
                    break;
                }

                // One-element cycle
                if (fastNext == fast) {
                    break;
                }

                // Move fast second step
                int fastNext2 = nextIndex(nums, fastNext);

                // Direction changed
                if ((nums[fastNext2] > 0) != isPositive) {
                    break;
                }

                // One-element cycle
                if (fastNext2 == fastNext) {
                    break;
                }

                slow = slowNext;
                fast = fastNext2;

                // Cycle found
                if (slow == fast) {
                    return true;
                }
            }
        }

        return false;
    }
}