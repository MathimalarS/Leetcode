class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int majority=nums.length/3;
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i:map.keySet())
        {
            if(map.get(i)>majority)
            {
                result.add(i);
            }
        }
        return result;
    }
}