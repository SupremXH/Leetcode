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
    int c=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        InOrder(root,k);
        return ans;
    }
    public void InOrder(TreeNode root,int k){
        if(root==null) return;
        InOrder(root.left,k);
        c++;
        if(c==k) ans=root.val;
        InOrder(root.right,k);
    }
}