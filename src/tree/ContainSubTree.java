package tree;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月18日 下午11:02:12	
*/

/*
 * 
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

 * 
 * */

public class ContainSubTree {
public boolean HasSubtree(TreeNodeSubTree root1,TreeNodeSubTree root2) {  // 这里root1表示树A，root2标识树B
        
        boolean result = false;
        
        // 当Tree1和Tree2都不为零的时候，才进行比较。否则直接返回false
        if(root2 != null && root1 != null){
            // 如果找到了对应的Tree2的根节点的点
            if(root1.val == root2.val){
                // 以这个节点为起点判断root1是否包含root2
                result = doesTree1HaveTree2(root1,root2);
            }
            // 如果找不到，那么就再去root的左儿子当做起点，去判断是否包含root2
            if(!result){
                result = doesTree1HaveTree2(root1.left,root2);
            }
            if(!result){
                result = doesTree1HaveTree2(root1.right,root2);
            }
        }
        
        // 返回结果
        return result;
        
    }
    
    public static boolean doesTree1HaveTree2(TreeNodeSubTree node1,TreeNodeSubTree node2){
        // 如果Tree2已经遍历完了都能对应的上 -> 这里是怎么知道对应的上的
        if(node2 == null){
            return true;
        }
        if(node1 == null){
            return false;
        }
        // 如果其中有一个点没有对应上，返回false
        if(node1.val != node2.val){
            return false;
        }
        
        // 如果根节点对应的上，那么就分别去子节点里面匹配
        return doesTree1HaveTree2(node1.left,node2.left) && doesTree1HaveTree2(node1.right,node2.right);
    }
}
	