package Practice.Trees.Answers;

import java.util.LinkedList;
import java.util.List;
 
public class inorder {

    List<Integer> li = new LinkedList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new LinkedList<Integer>();
        }
        inorderTraversal(root.left);
        li.add(root.val);
        inorderTraversal(root.right);
        return li;

    }
}
