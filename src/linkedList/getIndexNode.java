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

public class getIndexNode {
	/*
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}*/

	/*
	    大体思路：
	        一、先实现链表的反转
	            1.申明一个栈结构
	            2.将节点全部放进栈中直到head.next = null
	            3.while循环，依次出栈head=stack.pop() 直到head.next = null
	        二、得到反转链表的基础上，再来一个节点的获取方法得到节点

	*/
	    public ListNode FindKthToTail(ListNode head,int k) {
	        Stack<ListNode> stack = new Stack<ListNode>();
	        // 定义一个临时的节点
	        ListNode temp = head;
	        // 开始往栈里面放节点数据
	        while(temp != null){
	            stack.push(head);
	            temp = temp.next;
	        }
	        // 开始出栈
	        while(!stack.isEmpty()){
	            ListNode tempA = stack.pop();
	            head = tempA.next;
	        }
	        // 调用获取节点的方法
	        return getNode(head,k);
	    }
	    public static ListNode getNode(ListNode head,int k){
	        ListNode temp = head;
	        for(int i=0;i<k;i++){
	            temp = temp.next;
	        }
	        return temp;
	    }
	    
}
	