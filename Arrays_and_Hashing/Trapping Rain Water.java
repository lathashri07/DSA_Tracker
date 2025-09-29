class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int start = height[0], end = height[height.length - 1];
        int count = 0; 
        while(l < r) {
            if(start < end) {
                l++;
                if(start < height[l]) {
                    start = height[l];
                } else {
                    count += start - height[l];
                }
            } else {
                r--;
                if(end < height[r]) {
                    end = height[r];
                } else {
                    count += end - height[r];
                }
            }
        }
        return count;
    }
}