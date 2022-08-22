// https://leetcode.com/problems/binary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        } 
        levelOrderHelper(result, root);
        return result;
    }
    
    public void levelOrderHelper(List<List<Integer>> res, TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            
        List<Integer> level = new ArrayList<>();
        int s = queue.size();
        for(int i=0; i< s; i++) {
            TreeNode curr = queue.poll();
            level.add(curr.val);
            if(curr.left != null) {
                queue.add(curr.left);
            }
            if(curr.right != null) {
                queue.add(curr.right);
            }
        }
        res.add(level);    
        }
        
    }
}