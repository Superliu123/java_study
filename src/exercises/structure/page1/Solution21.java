package exercises.structure.page1;

/**
 * @description: 给定两个有序链表，合并成新的有序链表
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-04 15:21
 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode gen = new ListNode(0);
        ListNode cur = gen;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) cur.next = l2;
        else cur.next = l1;
        return gen.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode two = new ListNode(3);
        ListNode three = new ListNode(5);
        ListNode four = new ListNode(9);
        ListNode five = new ListNode(11);
        three.next = four;
        two.next = three;
        head1.next = two;
        head2.next = five;
        Solution21 solution21 = new Solution21();
        System.out.println(solution21.mergeTwoLists(head1, head2));
    }
}
