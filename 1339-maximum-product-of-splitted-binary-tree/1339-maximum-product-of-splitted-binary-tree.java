/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long totalsum=0;
    long maxproduct=0;
    int mod=1_000_000_007;
    public int maxProduct(TreeNode root) {
        totalsum=treesum(root);
        subtreesum(root);
        return (int)(maxproduct % mod);
    }
    private long treesum(TreeNode node)
    {
        if(node==null) return 0;
        return node.val+treesum(node.left)+treesum(node.right);
    }
    private long subtreesum(TreeNode node)
    {
        if(node==null) return 0;
        long left=subtreesum(node.left);
        long right=subtreesum(node.right);

        long subsum=node.val+left+right;
        long product=subsum*(totalsum-subsum);
        maxproduct=Math.max(maxproduct,product);

        return subsum;
    }
}