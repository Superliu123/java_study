package exercises.structure.page1;

/**
 * @description: 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *              如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。  您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 *              输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *              输出：7 -> 0 -> 8
 *              原因：342 + 465 = 807
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-10-08 17:50
 */
public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int addOne = 0;
        int add;
        while(l1 != null || l2 != null){
            int valL1 = l1 != null ? l1.val : 0;
            int valL2 = l2 != null ? l2.val : 0;
            add = valL1 + valL2 + addOne;
            addOne = add / 10;
            ListNode sumNode = new ListNode(add % 10);
            current.next = sumNode;
            current = current.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (addOne >= 1) {
            current.next = new ListNode(addOne);
        }

        return result.next;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(7);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);
        System.out.println("a:" + l1.toString());
        System.out.println("b:" + l2.toString());
        System.out.println("num:" + solution2.addTwoNumbers(l1,l2).toString());
        System.out.println("逆序：" + solution2.reverseListNode(l1).toString());
    }

    public ListNode reverseListNode(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode p = head;
        ListNode q = p.next;
        while(q != null){
            ListNode tmp = q.next;
            q.next = p;
            p = q;
            q = tmp;
        }
        head.next = null;
        return p;
    }

}