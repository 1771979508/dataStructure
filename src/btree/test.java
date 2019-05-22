package btree;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月14日 下午10:02:20	
*/
public class test {

	public static void main(String[] args) {
		
		// 创建一个二叉树
		Node node5 = new Node(5,null,null);
		Node node4 = new Node(4,null,node5);
		
		Node node7 = new Node(7,null,null);
		
		Node node6 = new Node(6,null,node7);
		Node node3 = new Node(3,null,null);
		
		Node node2 = new Node(2,node3,node6);
		Node node1 = new Node(1,node4,node2);
		
		// 创建一颗二叉树
		BinaryTree bTree = new LinkedBinaryTree(node1);

		// 判断二叉树是否为空
//		bTree.isEmpty();
		System.out.println(bTree.isEmpty());
		
		// 先序遍历递归  1 4 5 2 3 6 7
		System.out.println("先序遍历");
		bTree.preOrderTraverse();
		System.out.println();
		
		// 中序遍历递归 4 5 1 3 2 6 7
		bTree.inOrderTraverse();
		
		// 后序遍历递归 5 4 3 7 6 2 1
		bTree.postOrderTraverse();
		
		
		// 中序遍历非递归(借助栈实现)
		
		
		
		// 按照层次遍历(借助队列实现)
		
		
		
		// 在二叉树中查找某个值
		System.out.println(bTree.findKey(7));
		
		
		// 二叉树的高度
		System.out.println(bTree.getHeight());
		
		
		// 二叉树的节点
		System.out.println(bTree.size());
	}

}
	