// import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        // Optimization: Pre-size the HashSet to avoid rehashing
        HashSet<Integer> set = new HashSet<>(n);
        for (int num : nums)
            if (!set.add(num)) return true;
        return false;
    }
}
