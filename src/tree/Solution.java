package tree;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月9日 下午10:39:15	
*/
public class Solution {
	
	public TreeNode rebuildBinaryTree(int preorder[],int inorder[]){
		if(preorder == null || inorder == null){
			return null;
		}
		// 定义构建二叉树的核心算法
		TreeNode root = rebuildBinaryTreeCore(preorder,0,preorder.length-1,
				inorder,0,inorder.length-1);
		return root;
	}
	
	public TreeNode rebuildBinaryTreeCore(int preorder[],int startPreorder,int endPreorder,
			int inorder[],int startInorder,int endInorder){
			
			return null;
	}
	
}
	