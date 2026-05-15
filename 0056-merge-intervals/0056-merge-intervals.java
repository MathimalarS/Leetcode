class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in,(a,b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        int curr[]=in[0];
        ans.add(curr);
        for(int inn[]:in)
        {
            int pe=curr[1];
            int ns=inn[0];
            int ne=inn[1];
            if(pe>=ns)
            {
                curr[1]=Math.max(pe,ne);
            }
            else
            {
            curr=inn;
            ans.add(curr);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}