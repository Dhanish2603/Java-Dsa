package Practice.Trees.Answers;

public class MaxDepth {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        return helper(root);
    }

    private int helper(TreeNode node) {

        if (node == null) {
            return 1;
        }
        int left = helper(node.left);
        int right = helper(node.right);

        return Math.max(left, right) + 1;

    }
}
