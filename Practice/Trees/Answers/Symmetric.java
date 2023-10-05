package Practice.Trees.Answers;

import java.util.LinkedList;
import java.util.Queue;

public class Symmetric {
    public static void main(String[] args) {

    }
    
        // public  boolean isSymmetric(TreeNode root) {
        //     if (root == null) {
        //         return true;
        //     }
        //     return isMirror(root.left, root.right);
        // }
        
        // private boolean isMirror(TreeNode node1, TreeNode node2) {
        //     if (node1 == null && node2 == null) {
        //         return true;
        //     }
        //     if (node1 == null || node2 == null) {
        //         return false;
        //     }
        //     return node1.val == node2.val && isMirror(node1.left, node2.right) && isMirror(node1.right, node2.left);
        // }
     
// alternate
    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) {
                continue;
            }
            if (left == null || right == null) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.right);
        }

        return true;
    }
}
