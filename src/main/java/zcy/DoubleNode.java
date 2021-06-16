package zcy;

/**
 * @author zhangxinpeng
 * @date 2021/6/16
 */
public class DoubleNode {
    public int data;
    public DoubleNode prev;
    public DoubleNode next;

    public DoubleNode(int data, DoubleNode prev, DoubleNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
