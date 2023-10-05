package Practice.Trees.Answers;

public class minDepth {


    public int minDeepth(TreeNode node) {
        
        if (node == null) {
              return 0;
          }
  
          int left =  minDeepth(node.left)  ;
          int right = minDeepth(node.right)  ;
          if(left==0 || right == 0){
              return Math.max(left,right)+1;
          }
          return Math.min(right,left)+1;
      }
      
}
