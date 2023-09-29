package Practice.LinkedList.Answers;

public class DeleteNode {
    class Solution {
        public void deleteNode(ListNode node) {
            while(node.next.next!=null){
                node.val = node.next.val;
                node = node.next;
            }
           node.val = node.next.val;
           node.next = null;
        }
    }
    // class Solution {
    //     public void deleteNode(ListNode node) {
    //         node.val=node.next.val;
    //         node.next=node.next.next;
    //     }
    // }
}
