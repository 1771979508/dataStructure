package orderInt;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月5日 下午11:31:27	
*/
public class adjustArr {
	
	public static void main(String[] args) {
		
		int posOdd = 0;
		
	}
	
	public class Solution {
	    public void reOrderArray(int [] array) {
	        // 调整前：{1，4，9，6，0}
	        // 调整后：{1，9，4，6，0}
	        
	        //定义一个数组
	        int[] result = new int[array.length];
	        
	        // 奇数往前走即自增
	        int posOdd = 0;
	        // 偶数倒着走即自减
	        //int even = result.length-1;
	        for(int i=0;i<array.length;i++){
	            if(array[i]%2==0){ // 如果为偶数
	                result[posOdd+1] = array[i];
	                //even--;
	            }else{ // 否则如果为奇数的话
	                result[posOdd] = array[i];
	                posOdd++;
	            }
	        }
	    }
	}
	
}
	