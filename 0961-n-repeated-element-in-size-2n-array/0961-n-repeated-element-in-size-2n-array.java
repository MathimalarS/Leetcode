class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> found=new HashSet<>();
        for(int num:nums)
        {
            if(!found.add(num))
            {
                return num;
            }
        } 
        return -1;     
    }
}