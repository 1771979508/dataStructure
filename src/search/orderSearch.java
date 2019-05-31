package search;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月31日 下午10:05:51	
*/

/*
 * 		给定一个数组：在数组中进行顺序查找
 * 
 * */

public class orderSearch {
	
	public static void main(String[] args) {
		
		// 给定分数数组
		int[] scoreArr = {89,45,78,45,100,98,86,100,65};
		
		// 给定要查找的分数
		int score = 100;
		
		// 给定查找值在数组中的索引
		int index = -1;
		
		// 遍历分数数组进行查找
		for(int i=0;i<scoreArr.length;i++){
			if(scoreArr[i] == score){
				index = i;
				break;
			}
		}
		
		//判断并输出一下
		if(index == -1){
			System.out.println("该分数不存在");
		}else{
			System.out.println("分数："+score+"在数组中的索引为："+index);
		}
		
	}
	
}
	