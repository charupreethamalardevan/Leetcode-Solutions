class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int[] right=new int[n];
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.min(right[i+1],arr[i]);

        }
        int chunks=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            max=Math.max(max,arr[i]);
            if(max<=right[i+1])
            chunks++;
        }
        return chunks+1;
    }
}
