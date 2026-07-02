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
    public int findSecondMinimumValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int min = root.val;
        long secondMin = Long.MAX_VALUE;
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr.val > min && curr.val < secondMin) {
                secondMin = curr.val;
            }
            if (curr.left != null)
                q.offer(curr.left);
            if (curr.right != null)
                q.offer(curr.right);
        }
        if(secondMin == Long.MAX_VALUE){
            return -1;
        }
        return (int)secondMin;

    }
}