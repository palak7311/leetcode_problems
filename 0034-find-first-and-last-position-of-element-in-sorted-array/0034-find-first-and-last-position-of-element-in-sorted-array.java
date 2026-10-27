class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = -1;
        int l = -1;
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] >= target) {
                f = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        // Reset lo and hi
        lo = 0;
        hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] <= target) {
                l = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        if (f == nums.length || f == -1 || nums[f] != target) {
            return new int[]{-1, -1};
        } else {
            return new int[]{f, l};
        }
    }
}