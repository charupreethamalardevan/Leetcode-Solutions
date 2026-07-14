class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] temp=nums.clone();
        int n=nums.length;
        int min=(n-1)/2;
        int max=n-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i]=temp[min];
                min--;
            }
            else{
                nums[i]=temp[max];
                max--;
            }
        }

    }
}
