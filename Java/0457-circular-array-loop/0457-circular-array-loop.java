class Solution {

    public int calcNextIdx(int[] nums, int curr) {
        int n = nums.length;

        return (curr + nums[curr] % n + n) % n;
    }

    public boolean circularArrayLoop(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            Set<Integer> set = new HashSet<>();

            boolean isPos = nums[i] > 0;
            int curr = i;

            while (true) {

                int next = calcNextIdx(nums, curr);

                // One element loop is not allowed
                if (next == curr) {
                    break;
                }

                // Direction changed
                if ((nums[next] > 0) != isPos) {
                    break;
                }
                if (set.contains(next)) {
                    return true;
                }

                set.add(curr);

                curr = next;
            }
        }

        return false;
    }
}