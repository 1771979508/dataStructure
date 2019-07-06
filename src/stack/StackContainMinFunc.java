package stack;

import java.util.Arrays;
import java.util.Stack;

import javax.swing.border.EmptyBorder;

/*
 * 
 * 		包含min函数的栈:
 * 			
 * 			定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数(时间复杂度为O(1))
 * 
 * 
 * */

public class StackContainMinFunc {
	
	private int size;
	private int min = Integer.MAX_VALUE;
	private Stack<Integer> minStack = new Stack<Integer>();
	private Integer[] elements = new Integer[10];
	
	public void push(int node){
		ensureCapacity(size++);
		elements[size++] = node;
		if (node<=min) {
			minStack.push(node);
			min = minStack.peek();
		}else{
			minStack.push(min);
		}
	}
	
	// 定义确保容量的函数
	private void ensureCapacity(int size){
		int len = elements.length;
		if(size > len){
			int newLen = (len*3)/2+1;  // 每次扩容的方式,这里的扩容为什么这么写？
			elements = Arrays.copyOf(elements, newLen);
		}
	}
	
	// 移出的函数
	public void pop(){
		Integer top = top();
		if(null != top){
			elements[size -1] = (Integer)null;
		}
		size--;
		minStack.pop();
		min = minStack.peek();
	}
	
	// 取出栈顶元素
	public int top(){
		if(!empty()){
			//  数组的动态移动
			if(size -1>=0){
				return elements[size -1];
			}
		}
		return (Integer)null;
	}
	
	// 判断栈中元素是否为空
	public boolean empty(){
		return size == 0;
	}
	
	public int min(){
		return min;
	}
	
}
