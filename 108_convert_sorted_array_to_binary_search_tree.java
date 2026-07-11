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
    public TreeNode sortedArrayToBST(int[] arr) {
        int n = arr.length; 
        return covert(arr,0,n-1);
        
    }
    public TreeNode covert(int[] arr , int low, int hi){
        if(low>hi) return null;
        int mid = (low+hi)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = covert(arr,low,mid-1);
        root.right = covert(arr,mid+1, hi);
        return root;
            
        
    }
    
}