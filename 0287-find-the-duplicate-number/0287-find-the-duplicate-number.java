class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        int dup=0;
        for(int i=0;i<n;i++)
        {
            if(set.contains(nums[i]))
            {
                dup=nums[i];
            }
            set.add(nums[i]);
        }
        return dup;
    }
}