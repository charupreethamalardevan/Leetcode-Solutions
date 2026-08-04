class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int total=0,current=0;
        int n=nums.length;
        for(int i=2;i<n;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                current++;
                total+=current;
            }else{
                current=0;
            }
        }
        return total;
    }
}
