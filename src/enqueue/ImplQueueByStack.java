package enqueue;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月17日 下午10:49:40	
*/

import java.util.ArrayDeque;
import java.util.Queue;

/*
 * 		用两个队列实现一个栈的功能 - 就是利用栈结构与队列结构的不同
 * 							 
 * 
 * 		分析：
 * 			入栈：将元素进队列A
 * 			出栈：判断队列A中元素的个数是否为1，如果等于1，则出队列，
 * 				 否则将队列A中的元素以此出队列并放入队列B，直到队列A中的元素留下一个，
 * 				 然后队列A出队列，再把队列B中的元素出队列以此放入队列A中
 * 
 * 
 * poll是队列数据结构实现类的方法，从队首获取元素，同时获取的这个元素将从原队列删除；
 * pop是栈结构的实现类的方法，表示返回栈顶的元素，同时该元素从栈中删除，当栈中没有元素时，调用该方法会发生异常
 * 
 * */

public class ImplQueueByStack {
	
	// 关于这道算法 - 只需要理解栈的结构-能够正常push和pop方法的进行即可
	
	Queue<Integer> queue1 = new ArrayDeque<Integer>();
	Queue<Integer> queue2 = new ArrayDeque<Integer>();
	
	// 入栈
	public void push(int node){
		// 两个栈都为空时，优先考虑queue1
		if(queue1.isEmpty()&&queue2.isEmpty()){
			queue1.add(node);
		}
		// 如果queue1为空，queue2有元素，优先使用queue2
		if(queue2.isEmpty()){
			queue1.add(node);
		}
		
		if(queue1.isEmpty()){
			queue2.add(node);
		}
	}
	
	// 出栈
	public int pop() throws Exception{
		// 如果两个栈都为空的话，则抛异常
		if(queue1.isEmpty()&&queue2.isEmpty()){
			throw new Exception("栈为空");
		}
		// 如果queue1为空，queue2有元素，将queue2的元素依次放入queue1中，直到最后一个元素弹出
		if(queue1.isEmpty()){
			while(queue2.size()>1){
				queue1.add(queue2.poll());
			}
			return queue2.poll();
		}
		if(queue2.isEmpty()){
			while(queue1.size()>1){
				queue2.add(queue1.poll());
			}
			return queue1.poll();
		}
		return 0;
	}
	
	public static void main(String[] args) throws Exception {
		
		ImplQueueByStack implQueueByStack = new ImplQueueByStack();
		implQueueByStack.push(2);
		implQueueByStack.push(4);
		implQueueByStack.push(0);
		System.out.println(implQueueByStack.pop());
		implQueueByStack.push(10);
		implQueueByStack.push(20);
		System.out.println(implQueueByStack.pop());
		
	}
	
	
	
	
	

}
	