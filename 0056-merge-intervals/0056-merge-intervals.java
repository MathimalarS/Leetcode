class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result=new ArrayList<>();
        if(intervals.length==0) return new int[0][0];

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int curr[]=intervals[0];
        result.add(curr);

        for(int i=1;i<intervals.length;i++)
        {
            int inter[]=intervals[i];
            if(inter[0]<curr[1])
            {
                curr[1]=Math.max(curr[1],inter[1]);
            }
            else if(inter[0]==curr[1])
            {
                curr[1]=inter[1];
            }
            else
            {
                curr=inter;
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}