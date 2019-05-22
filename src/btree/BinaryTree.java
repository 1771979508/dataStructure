package btree;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月14日 下午9:43:09	
*/

/*
 *   二叉树的接口
 * 		 - 可以有不同的实现类，每个类可以使用不同的存储结构，比如顺序结构、链式结构
 * */

public interface BinaryTree {
	
	// 是否空树
	public boolean isEmpty();
	
	// 树节点数量
	public int size();
	
	// 获得二叉树的高度
	public int getHeight();
	
	// 查询指定值的节点
	public Node findKey(int value); //查找
	
	// 前序递归遍历
	public void preOrderTraverse();
	
	// 中序递归遍历
	public void inOrderTraverse();
	
	// 后序递归遍历
	public void postOrderTraverse();
	
	/*
	 * 	带参数遍历递归
	 * */
	
	// 后序遍历非递归操作     node:根节点
	public void postOrderTraverse(Node node);
	
	//中序遍历非递归操作：
	public void inOrderByStatck();
	
	// 前序遍历非递归操作
	public void preOrderByStack();
	
	/*
	 * 按照层次遍历二叉树 - 队列的形式
	 * 
	 * */
	public void levelOrderByStack();

}
	