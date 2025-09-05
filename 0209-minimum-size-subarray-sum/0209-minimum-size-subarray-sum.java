class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int minlen=Integer.MAX_VALUE;
        

        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum>=target){
        //             minlen=Math.min(minlen,j-i+1);
        //             break;
        //         }
        //     }
        // }
        // return (minlen==Integer.MAX_VALUE)?0:minlen;

        // _________________________________________________
        int n=nums.length;
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}