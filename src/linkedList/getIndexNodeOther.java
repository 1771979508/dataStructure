package linkedList;

import java.util.Stack;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月11日 下午11:40:29	
*/

/*
 * 
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 
 * */

/*
* 先做个长度为k的尺子，当尺子移动到末端时，
*	尺子左边就是要找的倒数第k个节点 
*		public ListNode FindKthToTail(ListNode head,int k) {}
*
*/
public class getIndexNodeOther {
    public ListNode FindKthToTail(ListNode head,int k) {
        // 把p作为长度为k的尺子
        ListNode p = head;
        for(int i=0;i<k;i++){
            if(p == null){
                return null;
            }
            p=p.next;
        }
        ListNode q = head;
        // 循环顺数到第k个结点后面是否有结点，有则移动，无则说明q就是倒数第k个结点
        while(p!=null){
            q = q.next;
            p=p.next;
        }
        return q;
    }
}
	