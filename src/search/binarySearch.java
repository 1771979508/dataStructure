package search;

import java.util.Arrays;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月31日 下午10:23:24	
*/
public class binarySearch {
	
	public static void main(String[] args) {
		
		// 给定分数数组
		int[] scoreArr = {89,45,78,45,100,98,86,100,65};
		
		// 给定要查找的分数
		int score = 100;
		
		// 给定查找值在数组中的索引
		//int index = -1;
		
		// 对给定的数组进行排序
		Arrays.sort(scoreArr);
		
		int low = 0;
		int high = scoreArr.length - 1;
		while(low<=high){
			// 定义中间的索引 mid
			int mid = (low+high)/2;
//			System.out.println(mid);
			if(score == scoreArr[mid]){
				System.out.println("分数："+score+"的下标为："+mid);
				break;
			}else if(score > scoreArr[mid]){
				low = mid + 1;
			}else if(score < scoreArr[mid]){
				high = mid - 1;
			}
		}
		
	}
	
}
	