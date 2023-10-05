package Practice.Trees.Answers;

public class isBalanced {
    public static void main(String[] args) {

    }

    public boolean isBalannced(TreeNode root) {
        if (root == null) {
                    return true;
                }
                int ans = helper(root);
                if (ans >= 1) {
                    return true;
                } else {
                    return false;
                }
            }
        
            private int helper(TreeNode node) {
                if (node == null) {
                    return 0;
                }
        
                int left = helper(node.left) ;
                int right = helper(node.right) ;
                if (left == -1 || right == -1)  return -1;
                if (Math.abs(left - right) > 1) {
                    return -1;
                }
                return Math.max(left,right) + 1;
            }
}
