package zcy;

/**
 * @author zhangxinpeng
 * @date 2021/6/16
 */
public class Utils {
    public static void printLinkedList(Node head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.data);
            head = head.next;
            if(head != null) {
                sb.append("->");
            }
        }
        System.out.println(sb.toString());
    }

    public static void printDoubleLinkedList(DoubleNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.data);
            head = head.next;
            if(head != null) {
                sb.append("<->");
            }
        }
        System.out.println(sb.toString());
    }
}
