
class Solution {
    public int mySqrt(int x) {

        long lo = 1;
        long hi = x;

        while (lo <= hi) {

            long mid = lo + (hi-lo)/2;
            long val = mid * mid;

            if (val <= x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return (int)hi;
    }
}
