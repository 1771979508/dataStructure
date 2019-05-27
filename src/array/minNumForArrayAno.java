package array;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月27日 下午10:56:22	
*/

	/*
	 * 二分查找实现旋转数组最小值
	 * 
	 * */

public class minNumForArrayAno {
	
	public int minNumberInRotateArray(int [] array) {
        int low = 0 ; int high = array.length - 1;   
        while(low < high){
            int mid = low + (high - low) / 2;        
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }   
        }
        return array[low];
    }
	
}
	