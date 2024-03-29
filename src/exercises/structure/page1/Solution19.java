package exercises.structure.page1;

/**
 * @description: 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-01 14:10
 */
public class Solution19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode gen = new ListNode(-1);
        gen.next = head;
        ListNode pre = gen;//最后指向指针2的next节点
        ListNode first = head;//指针1
        ListNode second = gen;//指针2
        int count = 1;
        while (first.next != null) {
            first = first.next;
            count++;
            if (count == n) {
                second = second.next;
            } else if (count >= n) {
                pre = pre.next;
                second = second.next;
            }
        }
        pre.next = second.next;
        second.next = null;
        return gen.next;

    }

    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        three.next = four;
        two.next = three;
        head.next = two;
        ListNode test = new ListNode(0);
        test.next = head;
        System.out.println(test);
        ListNode thiz = test;
        thiz = thiz.next;
        System.out.println(test);
        System.out.println(thiz);
        System.out.println(solution19.removeNthFromEnd(head, 2));
    }
}
