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
    public TreeNode bstFromPreorder(int[] arr) {
        // ArrayList<Integer> ans = new ArrayList<>();
        if (arr.length == 0) return null;
        TreeNode root = new TreeNode(arr[0]);
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        for(int i=1; i<arr.length; i++){
            TreeNode node = new TreeNode(arr[i]);
            if(arr[i]<st.peek().val){
                st.peek().left=node;
            }
            else{
                TreeNode parent = null;
                while(!st.isEmpty() && st.peek().val<arr[i]){
                    parent=st.pop();
                }
                parent.right=node;
            }
            st.push(node);
        }
        return root; 
        
    }
}