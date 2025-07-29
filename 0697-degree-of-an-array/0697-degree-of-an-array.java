class Solution {
    public int findShortestSubArray(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> firstindex=new HashMap<>();
        Map<Integer,Integer> lastindex=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num=nums[i];
            map.put(num,map.getOrDefault(num,0)+1);
            if(!firstindex.containsKey(num))
            {
                firstindex.put(num,i);
            }
            lastindex.put(num,i);
        }
        int degree=Collections.max(map.values());
        int minl=nums.length;
        for(int num:map.keySet())
        {
            if(degree==map.get(num))
            {
                int length=lastindex.get(num)-firstindex.get(num)+1;
                minl=Math.min(length,minl);
            }
        }
        return minl;
    }
}