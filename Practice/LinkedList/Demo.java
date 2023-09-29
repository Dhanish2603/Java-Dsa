package Practice.LinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>();

        head.add(1);
        head.add(2);
        System.out.println(head.toString());
        head.add(3);
        head.add(15);
        System.out.println(head.toString());
        head.removeLast();
        System.out.println(head.toString());
        head.remove();
        System.out.println(head.toString());
        head.addFirst(11);
        System.out.println(head.get(2));

        System.out.println(head.toString());

        // System.out.println(head.equals(11));

        System.out.println(head.contains(3));
        head.clear();
        System.out.println(head.toString());
        head.offer(15);
        System.out.println(head.toString());

        System.out.println(head.peek());//retrieve not remove
        System.out.println(head.poll());//retrieve and remove
    }

}
