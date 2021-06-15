package zcy;

/**
 * 打印两个有序链表的公共部分
 * @author zhangxinpeng
 * @date 2021/6/15
 */
public class Two1 {
    public static void main(String[] args) {
        Node h1 = new Node(1);
        h1.next = new Node(4);
        h1.next.next = new Node(5);

        Node h2 = new Node(3);
        h2.next = new Node(4);
        h2.next.next = new Node(5);
        printCommon(h1, h2);
    }

    public static void printCommon(Node h1, Node h2) {
        while(h1 != null && h2 != null) {
            if(h1.data > h2.data) {
                h2 = h2.next;
                continue;
            }

            if(h1.data < h2.data) {
                h1 = h1.next;
                continue;
            }

            System.out.println("通用：" + h1.data);
            h1 = h1.next;
            h2 = h2.next;
        }
    }
}
