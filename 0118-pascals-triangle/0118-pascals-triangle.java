class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal=new ArrayList<>();
        if(numRows==0) return pascal;

        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);

        for(int i=1;i<numRows;i++)
        {
            List<Integer> prev=pascal.get(i-1);
            List<Integer> row=new ArrayList<>();

            row.add(1);

            for(int j=1;j<i;j++)
            {
                row.add(prev.get(j-1)+prev.get(j));
            }

            row.add(1);
            pascal.add(row);
        }
        return pascal;
    }
}