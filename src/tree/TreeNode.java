package tree;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月9日 下午10:39:30	
*/
public class TreeNode {
	
	//数据域
	public int data;
	
	//左指针域
	public TreeNode left;
	
	// 右指针域
	public TreeNode right;
	
	//构造方法
	public TreeNode(int data){
		this.data = data;
	}
	
	// 重写toString方法
	public String toString(){
		return "TreeNode [data=" + data + ",left=" + left + ",right=" + right + "]";
	}
	
	
}
	