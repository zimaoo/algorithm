package zcy;

/**
 * 反转单向和双向链表
 * @author zhangxinpeng
 * @date 2021/6/16
 */
public class Two4 {
    public static void main(String[] args) {
        b();
    }

    public static void a() {
        Node head = new Node(1, new Node(2, new Node(3, null)));
        System.out.println("== 反转前 ==");
        Utils.printLinkedList(head);

        head = reverseLinkedList(head);

        System.out.println("== 反转后 ==");
        Utils.printLinkedList(head);
    }


    public static void b() {
        DoubleNode head = new DoubleNode(1, null, null);
        DoubleNode d1 = new DoubleNode(2, head, null);
        head.next = d1;
        DoubleNode d2 = new DoubleNode(3, d1, null);
        d1.next = d2;
        System.out.println("反转前");
        Utils.printDoubleLinkedList(head);

        head = reverseDoubleLinkedList(head);

        System.out.println("反转后");
        Utils.printDoubleLinkedList(head);
    }

    public static Node reverseLinkedList(Node head) {
        Node p1 = null, p2 = null;
        while (head != null) {
            p1 = head.next;
            head.next = p2;
            p2 = head;
            head = p1;
        }
        return p2;
    }

    public static DoubleNode reverseDoubleLinkedList(DoubleNode head) {
        DoubleNode p1 = null, p2 = null;
        while(head != null) {
            p1 = head.next;
            head.next = p2;
            head.prev = p1;
            p2 = head;
            head = p1;
        }
        return p2;
    }
}
