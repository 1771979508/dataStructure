package linkedList;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月13日 下午10:38:41	
*/
/*
 * 
 * 	输入一个链表，反转链表后，输出新链表的表头。
 * 
 * */
public class ReverseLinkedList {
	 public ListNode ReverseList(ListNode head) {
        // 定义前一个节点pre
        ListNode pre = null;
        // 定义后一个节点next
        ListNode next = null;
        if(head == null){
            return null;
        }
        while(head != null){
            // 保存下一个节点的值
            next = head.next;
            // 进行指针的翻转，让当前节点指向前一个节点
            head.next = pre;
            // 节点向后移动，进行下一次的指针翻转
                // 首先把当前节点赋值给前面的节点
            pre = head;
                // 然后把保存的下一个节点赋值给当前节点
            head = next;
        }
        // 返回pre节点，因为此时head表示的下一个节点，为空；head后面的pre节点才是正常的返回节点
        return pre;
    }
}
	