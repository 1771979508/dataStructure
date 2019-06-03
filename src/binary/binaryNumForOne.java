package binary;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月3日 下午10:39:18	
*/

/*
 * 		输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 
 * */

//  https://blog.csdn.net/kongmin_123/article/details/82053824

/*
 * 		可以算一下 0x7FFFFFFF 是多少
		每个十六进制数4bit，因此8位16进制是4个字节，刚好是一个int整型
			F的二进制码为 1111
			7的二进制码为 0111
		这样一来，整个整数 0x7FFFFFFF 的二进制表示就是除了首位是 0，其余都是1
	就是说，这是最大的整型数 int（因为第一位是符号位，0 表示他是正数）
	用 INT_MAX 常量可以替代这个值。
 * 
 * 
 * */


public class binaryNumForOne {
	
	public static void main(String[] args) {
		
		long startTime=System.nanoTime();   //获取开始时间
        int num = NumberOf1(7);
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println(num);
        System.out.println("程序运行时间："+(endTime-startTime)+"ns");
		
	}
	
	public static int NumberOf1(int n){
		int count = 0;
		String string = Integer.toBinaryString(n);
		char[] cs =string.toCharArray();
		for(int i=0;i<cs.length;i++){
			if(cs[i] == '1'){
				count++;
			}
		}
		return count;
	}
	
	
}
	