package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月7日 下午9:47:13	
*/
public class Solution {
	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	//1. 递归实现-真的妙  -  这里可以对ListNode这个函数进行更改，测试看是否能从尾到头进行打印
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
		if(listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
            //System.out.println(ret);
        }
		
		System.out.println(ret);
		return ret;
    }
	
	// 2.使用头插法
	// 头节点和第一个节点的区别：
	// 		头节点是在头插法中使用的一个额外节点，这个节点不存储值
	//      第一个节点就是链表的第一个真正存储的节点		
	
	
	// 3.使用栈
	public ArrayList<Integer> printListFromTailToHeadStack(ListNode listNode){
		Stack<Integer> stack = new Stack<>();
		while(listNode != null){
			stack.add(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> ret = new ArrayList<>();
		while(!stack.isEmpty()){
			ret.add(stack.pop());
		}
		return ret;
	}
	
	public static void main(String[] args) {
		
		ListNode ln1 = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = null;
		ln1.next = ln2;
		ln2.next = ln3;
		System.out.println("链表的初始值："+ln1.val);
		new Solution().printListFromTailToHead(ln1);  // 得到结果确实反转了链表
		//System.out.println(ln1.next);
	}
	
	
	
	
	
	
}
	