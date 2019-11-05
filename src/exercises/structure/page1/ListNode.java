/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author liu_chao[zhou_chen2@suixingpay.com]
 * @date 2019-11-04 15:23
 * @version 01
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package exercises.structure.page1;

/**
 * @description:
 * @author: liu_chao[liu_chao2@suixingpay.com]
 * @data: 2019-11-04 15:23
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    public String toString(){
        ListNode listNode = next;
        String s = val + "";
        while( listNode != null){
            s = s + "->" + listNode.val;
            listNode = listNode.next;
        }
        return s;
    }
}
