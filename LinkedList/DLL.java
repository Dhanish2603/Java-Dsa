// package LinkedList;

// public class DLL {
//     private Node head;

//     public DLL() {
//         this.head = null;
//     }

//     public void insertFirst(int val) {
//         Node node = new Node(val);
//         node.next = head;
//         node.prev = null;
//         if (head != null) {
//             // head.next = null;
//             head.prev = node;
//         }
//         head = node;

//         // head.prev = node;
//         // head = node;

//     }


//     public void display() {
//         Node node = head;
//         while (node.next != null) {
//             System.out.print(node.val + " ->");
//             node = node.next;
//         }

//     }

//     public void insertLast(int val) {
//         Node node = head;
//         Node temp = new Node(val);
//         if (head == null) {
//             temp.prev = null;
//             head = node;
//             return;
//         }
//         while (node.next != null) {
//             node = node.next;
//         }
//         node.next = temp;
//         temp.prev = node;
//         temp.next = null;

//     }

//     private class Node {
//         int val;
//         Node prev;
//         Node next;

//         public Node(int val) {
//             this.val = val;
//         }

//         // public Node(int val, Node prev, Node next) {
//         //     this.val = val;
//         //     this.prev = prev;
//         //     this.next = next;
//         // }
//     }
    
// }
