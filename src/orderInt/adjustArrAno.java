package orderInt;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月5日 下午11:31:27	
*/

/*
 * 	输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 		使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分 
 * 
 * */

/*
 * 	下面这种做法跟我第一次想做的想法是一样的，但是很显然那不符合题意
 * 
 * 
 * */
public class adjustArrAno {
	
    public static void reOrderArray(int[] array) {
    	int i=0;
        int j=array.length-1;
        int temp=0;
       while(i<j){
           if ((array[i]&1)==1){
               i++;
               continue;
           }
           if ((array[j]&1)==0) {
               j--;
               continue;
           }
           temp=array[i];
           array[i]=array[j];
           array[j]=temp;
           i++;
           j--;
       }
       for (int ii=0;ii<array.length;ii++){
           System.out.print(array[ii]+",");
           //System.out.println();
       }

	}
    
    public static void main(String[] args) {
		int[] testData = new int[]{1,4,8,6,4,3,7};
    	reOrderArray(testData);
	}
	
}
	