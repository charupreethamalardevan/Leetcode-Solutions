class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int maxcap=0;
        int right=height.length-1;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[left],height[right]);
            int capacity=width*h;
            maxcap=Math.max(capacity,maxcap);
            if (height[left]<height[right]){
                left++;

            }
            else
            right--;
        }
        return maxcap;
    }
}
