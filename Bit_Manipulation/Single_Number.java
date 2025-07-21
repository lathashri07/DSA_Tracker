class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int N = nums.length;

        for(int i=0; i<N; i++) {
            res ^= nums[i];
        }
        return res;
    }
}