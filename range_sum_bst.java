/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum=0;
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
         while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
       if(L <=node.val && R >=node.val)
           sum+= node.val;
         if(L<node.val)
            stack.push(node.left);
         if(R>node.val)
            stack.push(node.right);
            }
         }
        return sum;
    }
}