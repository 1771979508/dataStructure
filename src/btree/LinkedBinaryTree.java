package btree;

import javax.print.attribute.Size2DSyntax;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月14日 下午9:55:35	
*/
public class LinkedBinaryTree implements BinaryTree{
	
	private Node root; // 根节点
	
	public LinkedBinaryTree() {
		super();
	}

	public LinkedBinaryTree(Node root) {
		super();
		this.root = root;
	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public int size() {
		System.out.print("二叉树的节点数量是：");
		return this.size(root);
	}
	
	private int size(Node root){
		if(root != null){
			int cl = this.size(root.leftChild);
			int cr = this.size(root.rightChild);
			return cl+cr+1;
		}else{
			return 0;
		}
	}
	
	@Override
	public int getHeight() {
		System.out.print("二叉树的高度是：");
		return this.getHeight(root);
	}
	
	private int getHeight(Node root){
		if(root != null){
			// 获取左子树的高度
			int nl = this.getHeight(root.leftChild);
			// 获取右子树的高度
			int nr = this.getHeight(root.rightChild);
			// 返回左子树、右子树中较大树的高度并加1
			return nl > nr ? nl+1 : nr+1;
		}else{
			return 0;
		}
	}

	@Override
	public Node findKey(int value) {
		return this.findKey(value,root);
	}
	
	public Node findKey(Object value,Node root){
		if(root == null){ // 递归结束条件1：节点为空，可能是整个树的根节点，也可能是递归调用中叶子节点中左孩子和右孩子
			return null;
		}else if(root != null && root.value == value){ // 递归的结束条件2：找到了
			return root;
		}else{  // 递归体
			Node nodeLeftChild = this.findKey(value,root.leftChild);
			Node nodeRightChild = this.findKey(value,root.rightChild);
			if(nodeLeftChild != null && nodeLeftChild.value == value){
				return nodeLeftChild;
			}else if(nodeRightChild != null && nodeRightChild.value == value){
				return nodeRightChild;
			}else {
				return null;
			}
		}
	}

	@Override
	public void preOrderTraverse() {
		if(root != null){
			// 1.输出根节点的值
			System.out.print(root.value + " ");
			
			// 2.对左子树进行先序遍历 - 先构建左子树
			BinaryTree leftChild = new LinkedBinaryTree(root.leftChild);
			leftChild.preOrderTraverse();	
			
			// 3.对右子树进行先序遍历
			BinaryTree rightChild = new LinkedBinaryTree(root.rightChild);
			rightChild.preOrderTraverse();
		}	
	}
	
	@Override
	public void inOrderTraverse() {
		System.out.println("中序遍历");
		this.inOrderTraverse(root);
		System.out.println();
	}
	
	private void inOrderTraverse(Node root) {
		if(root != null){
			//1.先对左子树进行遍历
			this.inOrderTraverse(root.leftChild);
			//2.再输出根节点
			System.out.print(root.value+" ");
			//3.输出右节点
			this.inOrderTraverse(root.rightChild);
		}
		
	}

	@Override
	public void postOrderTraverse() {
		System.out.println("后序遍历");
		this.postOrderTraverse(root);
		System.out.println();
	}
	
	public void postOrderTraverse(Node node) {
		if(node != null){
			//1.左子树
			this.postOrderTraverse(node.leftChild);
			//2.右子树
			this.postOrderTraverse(node.rightChild);
			//3.根节点
			System.out.print(node.value+" ");
		}
		
	}

	@Override
	public void inOrderByStatck() {
		
	}

	@Override
	public void preOrderByStack() {
		
	}

	@Override
	public void levelOrderByStack() {
		
	}

}
	