package zcy;

/**
 * @author zhangxinpeng
 * @date 2021/6/15
 */
public class Two2 {
    public static void main(String[] args) {
//        a();
        b();
    }

    public static void a() {
        Node head = new Node(1, new Node(2, new Node(3, null)));
        System.out.println("== 移除前 ==");
        Utils.printLinkedList(head);

        head = removeLastKthNode(head, 2);

        System.out.println("== 移除后 ==");
        Utils.printLinkedList(head);
    }

    public static Node removeLastKthNode(Node head, int k) {
        Node p1 = head, p2 = head;
        for(int i = 0; i < k; i++) {
            // p1为null，说明k大于链表长度
            if(p1 == null) {
                return head;
            }
            p1 = p1.next;
        }

        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }


    public static void b() {
        DoubleNode head = new DoubleNode(1, null, null);
        DoubleNode d1 = new DoubleNode(2, head, null);
        head.next = d1;
        DoubleNode d2 = new DoubleNode(3, d1, null);
        d1.next = d2;
        System.out.println("移除前");
        Utils.printDoubleLinkedList(head);

        head = removeLastKthDoubleNode(head,2);

        System.out.println("移除后");
        Utils.printDoubleLinkedList(head);
    }

    public static DoubleNode removeLastKthDoubleNode(DoubleNode head, int k) {
        DoubleNode p1 = head, p2 = head;
        for(int i =  0; i < k; i++) {
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.prev.next = p2.next;
        p2.next.prev = p2.prev;
        return head;
    }
}
