class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int maxA = 0;
        int n = heights.length;

        for(int i=0; i<=n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while(!stk.isEmpty() && currentHeight < heights[stk.peek()]) {
                int height = heights[stk.pop()];
                
                int width;
                if(stk.isEmpty()) {
                    width = i;
                } else {
                    width = i - stk.peek() - 1;
                }

                maxA = Math.max(maxA, height * width);
            }
            stk.push(i);
        }
        return maxA;
    }
}