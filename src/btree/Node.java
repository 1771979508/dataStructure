package btree;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月14日 下午9:34:01	
*/

/*
 * 	二叉链表的节点
 * 
 * */

public class Node {
	
	Object value; // 节点值
	Node leftChild; // 左子树的引用
	Node rightChild; // 右子树的引用
	
	@Override
	public String toString() {
		return "Node [value=" + value + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}
	
	public Node(Object value, Node leftChild, Node rightChild) {
		super();
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}
	
	public Node(Object value){
		super();
		this.value = value;
	}
	
	
}
	