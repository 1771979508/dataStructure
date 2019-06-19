package tree;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月19日 下午11:13:10	
*/

/*
 * 		操作给定的二叉树，将其变换为源二叉树的镜像。
	
		二叉树的镜像定义：源二叉树 
	    	    8
	    	   /  \
	    	  6   10
	    	 / \  / \
	    	5  7 9 11
	    	镜像二叉树
	    	    8
	    	   /  \
	    	  10   6
	    	 / \  / \
	    	11 9 7  5
 * 
 * */

public class TransformBinaryComposer {
	
	public void Mirror(TreeNode root) {
        // 判断节点是否为空
        if(root == null){
            return;
        }
        
        if(root.left == null && root.right == null){
            return;
        }
        
        // 拿个临时节点用来存放左节点的值,然后和右节点进行操作了，最后达到节点互换的结果
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // 接下来查看左右子节点是否还存在子节点，如果存在则进行递归操作
        if(root.left!=null){
            Mirror(root.left);
        }
        if(root.right!=null){
            Mirror(root.right);
        }
    }
	
}
	