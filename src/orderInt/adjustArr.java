package orderInt;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月5日 下午11:31:27	
*/

/*
 * 	输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 		使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 			并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * */
	
/*
 * 	思路：
 * 		1.从前往后遍历，第一个元素如果是偶数，记住这个偶数的下标。如果不是偶数，啥也不干
 * 		2.当遇到偶数的时候，判断这是不是第一个偶数，如果是记住角标位
 * 		3.当遇到奇数的时候，判断前面有没有偶数，如果有，则将前面的连续的多个偶数，顺序往后移动一位，然后将奇数插入第一个偶数的位置
 * 	
 * 具体步骤如下例子：

	2，1，8，3，4，9   //index=0  
	
	             index>=0       奇数1 和2 交换位置  然后修改index=1
	
	1，2，8，3，4，9   //index=1
	
	1，3，2，8，4，9   //index=2
	
	              index>=0       奇数3存入临时变量，然后元素2 和8 依次后移，之后将3存入2位置。
	
	1，3，9，2，8，4   //index=3
	
	               index>=0       奇数9存入临时变量，然后元素2 ，8和4 依次后移，之后将9存入2位置。

 * */

public class adjustArr {
	
	public static void reOrderArray(int[] array){
		int i=0;
		int j=array.length;
		int index = -1;  // 表示偶数的下标
		// 如果数组为空则进行返回
		if(array.length==0){
			return;
		}
		while(i<j){
			// 找到第一个奇数
			if((array[i]&1)==1){
				// 如果前面存在偶数
				if(index>=0){
					// 记录奇数的值 
					int ss = array[i];
					// 将前面存在的偶数顺序地往后移动
					for(int in=i;in>index;in--){
						array[in]=array[in-1];
					}
					//和index位置元素互换(将奇数放到当前偶数的位置)
					array[index]=ss;
					index++;
				}
				i++;
				continue;
			}else{
				if(i==0){
					index=0;
					if(index<0){
						index=i;
					}
					i++;
					continue;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] testData = new int[]{1,4,8,6,4,3,7};
		reOrderArray(testData);
		
	}

}
	