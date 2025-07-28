class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int currlength=1,maxlength=1;
        if(n==0) return 0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                currlength++;
                maxlength=Math.max(maxlength,currlength);
            }
            else
            {
                currlength=1;
            }
        }
        return maxlength;
    }
}