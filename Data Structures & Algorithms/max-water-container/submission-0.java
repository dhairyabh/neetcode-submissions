class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int maxarea = 0;
        int right = heights.length - 1;
        while(left<right){
            int h = Math.min(heights[left], heights[right]);
            int w = right - left;
            int area = h * w;
            maxarea = Math.max(maxarea, area);

            if(heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return maxarea;
    }
}
