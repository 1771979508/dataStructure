package search;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月31日 下午10:14:11	
*/

/*
 * 	将从数组中查找的某个值的方法抽取出来
 * 
 * */
public class baseOrderSearch {

	public static void main(String[] args) {
		
		int[] scoreArr = {89,45,78,45,100,98,86,100,65};
		
		int score = 45;
		
		int index = search(scoreArr, score);
		
		if(index == -1){
			System.out.println("该分数不存在");
		}else{
			System.out.println(score+"在数组中的索引为"+ index);
		}
	}
	
	public static int search(int[] scoreArr,int score){
		int index = -1;
		for(int i=0;i<scoreArr.length;i++){
			if(score == scoreArr[i]){
				index = i;
				break;
			}
		}
		return index;
	}
	
}
	