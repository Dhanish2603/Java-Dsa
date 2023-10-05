package Practice.Trees.Answers;

import java.util.LinkedList;
import java.util.List;

public class PreOrder { 
        List<Integer> result = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return result;
        }
         
            result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }
 
}
