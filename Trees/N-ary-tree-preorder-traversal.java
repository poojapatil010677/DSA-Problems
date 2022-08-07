// https://leetcode.com/problems/n-ary-tree-preorder-traversal/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

// Recursive

class Solution {
    
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> preorder(Node root) {
        
        if(root == null) {
            return result;
        }
        
        preOrderHelper(root);
        return result;
    }
    
    public void preOrderHelper(Node root) {
        
        // base case
        if (root == null) {
            return ;
        }
        
        result.add(root.val);
        for(Node node: root.children) {
            preOrderHelper(node);
        }
        
    }
}

// Iterative

class Solution {
    
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> preorder(Node root) {
            
        if(root == null) {
            return result;
        }
        
        Stack<Node> temp = new Stack<>();
        temp.push(root);
        
        while(!temp.isEmpty()) {
            Node curr = temp.pop();
            
            result.add(curr.val);
            for(int i = curr.children.size()-1; i>=0 ; i--) {
                temp.push(curr.children.get(i));
            }
        }
        return result;
    }
}