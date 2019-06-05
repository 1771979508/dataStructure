package linkedList;

import java.lang.reflect.Array;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月4日 下午11:09:06	
*/
public class myLinkedList {
	
	// 头节点指针
	private Node head;
	
	// 尾节点指针
	private Node last;
	
	// 链表实际长度
	private int size;
	
	/*
	 * 	链表插入元素
	 * 
	 * */
	public void insert(int data,int index) throws Exception{
		// 首先判断插入的位置是否合理
		if(index < 0 || index > size){
			throw new IndexOutOfBoundsException("超出链表节点范围！");
		}
		// 申明新插入的节点
		Node insertNode = new Node(data);
		// 下面分别对插入位置不同的操作
		if(size == 0){
			// 插入头部
			head = insertNode;
			last = insertNode;
		}else if(size == index){
			// 插入尾部
			last.next = insertNode;
			last = insertNode;
		}else{
			// 插入中间
			Node prevNode = get(index - 1);
			prevNode.next = insertNode;
			Node nextNode = prevNode.next;
			insertNode.next = nextNode;
		}
		size++; // 如果不自增，则会导致越界
	}
	
	/*
	 * 
	 * 		链表查找元素
	 * 
	 * */
	public Node get(int index) throws Exception{
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("超出链表范围！");
		}
		Node temp = head;
		for(int i=0;i<index;i++){
			temp = temp.next;
		}
		size--;  // 这里表示没看懂，为啥要自减？
		return temp;
	}
	
	
	/*
	 * 	删除链表元素
	 * 
	 * */
	public Node remove(int index) throws Exception{
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("超出链表范围！");
		}
		Node removeNode = null;
		if(index == 0){
			// 删除头节点
			removeNode = head;
			head = head.next;
		}else if(index == size-1){
			// 删除尾节点 -- 因为需要指定删除节点的前一个节点为最后一个节点，所以需要用get方法来获得索引的前一个节点
			Node prevNode = get(index - 1);
			removeNode = prevNode.next;
			prevNode.next = null;
			prevNode = last;
		}else{
			// 删除中间的节点
			Node prevNode = get(index - 1);
			Node nextNode = prevNode.next.next;
			removeNode = prevNode.next;
			prevNode.next = nextNode;
		}
		size--;
		return removeNode;
	}
	
	/*
	 * 	输出链表
	 * 
	 * */
	public void output(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		myLinkedList myLinkedList = new myLinkedList();
		myLinkedList.insert(3, 0);
		myLinkedList.insert(7, 1);
		myLinkedList.insert(9, 2);
		myLinkedList.insert(5, 3);
		myLinkedList.insert(8, 4);
		myLinkedList.insert(4, 5);
		myLinkedList.remove(0);
		myLinkedList.output();
		
	}
	
	
	/*链表节点*/
	private static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
}
	