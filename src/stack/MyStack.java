package stack;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月17日 下午8:47:36	
*/

import java.util.Stack;

/*
 * 	用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 
 * 		队列中的元素为int类型
 * 
 * 	  就是简单地入队和出队的功能，不要想复杂了
 * 
 * */

public class MyStack {
	
	Stack<Integer> stackA = new Stack<Integer>();
	Stack<Integer> stackB = new Stack<Integer>();
	
	public void push(int node){
		// 将栈A来当作队列的入口
		stackA.push(node);
	}
	
	// 出队的话，将栈B当作出栈
	public int pop()throws Exception{
		// 需要进行对栈A遍历，直到栈A为空；若两个栈都为空的话，则抛异常
		if(stackA.isEmpty() && stackB.isEmpty()){
			throw new Exception("队列为空");
		}
		
		while(!stackA.isEmpty()){
			if(stackB.empty()){ // 如果栈B为空的话，将栈A中的数据存进栈B，栈B再出栈
				stackB.push(stackA.pop());
			}
		}
		return stackB.pop();
	}
	
	
	
	
	
	
}
	