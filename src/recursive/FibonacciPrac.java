package recursive;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年5月28日 下午11:28:17	
*/

/*
 * 	大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 *			n<=39
 * 
 * */

public class FibonacciPrac {
	
	 public int Fibonacci(int n) {
	       /*
	       第一种实现方法：递归实现
	        if(n<=39){
	           if(n==0){
	               return 0;
	           }else if(n==1 || n==2){
	               return 1;
	           }else{
	              return Fibonacci(n-2) + Fibonacci(n-1); 
	           }
	       }else{
	           return 0;
	       }
	       */
	        
	        /*第二中实现方法 - 遍历循环*/
	        int a=1,b=1,c=0;
	            if(n==0){
	               return 0;
	           }else if(n==1 || n==2){
	               return 1;
	           }else{
	                for(int i=3;i<=n;i++){
	                    c = a + b;
	                    // b变为a
	                    b = a;
	                    // a变为c
	                    a = c;
	                }
	                return c;
	            }
	    }
	
}
	