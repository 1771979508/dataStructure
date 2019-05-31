package search;

import java.util.Arrays;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月31日 下午11:34:14	
*/

/*
 *   使用递归查找
 * 
 * */

public class binarySearchByRecusive {
	
	public static void main(String[] args) {
		
		// 给定分数数组
		int[] scoreArr = {89,45,78,45,100,98,86,100,65};
		
		// 对给定的数组进行排序
		Arrays.sort(scoreArr);
		
		// 给定要查找的分数
		int score = 45;
		
		// 进行折半二分查找
		int index = binarySearch(scoreArr,score);
		
		if(index == -1){
			System.out.println("分数不存在");
		}else{
			System.out.println("分数"+score+"在数组中对应的下标为："+index);
		}
		
	}
	
	// 剥离查找的方法
	public static int binarySearch(int[] arr,int key){
		// 指定low和high
		int low = 0;
		int high = arr.length - 1;
		return binarySearch(arr,key,low,high);
	}
	
	public static int binarySearch(int[] arr,int key,int low,int high){
		// 递归结束的条件
		if(low>high){
			return -1;
		}
		int mid = (low+high)/2;
		if(key == arr[mid]){
			return mid;
		}else if(key > arr[mid]){
			return binarySearch(arr, key, mid+1, high);
		}else{
			return binarySearch(arr, key, low, mid-1);
		}
	}
	
	
	
	
	
	
}
	