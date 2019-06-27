package thread;


/*
 * 		发生原由：两个线程访问同一个实例类的两个同步方法，会不会相互影响
 * 
 * 
 * */

public class SynchronizationObject {
	
	public SynchronizationObject(){}
	
	public synchronized void runSynchronizationMethod0(){
		System.out.println("this is start test00!");
		//该循环的目地只有一个,就是可以使当前方法在一定时间内交出执行线程
		for(int i=0;i<100000000;i++){}
		System.out.println("this is end test00!");
	}
	
	public synchronized void runSynchronizationMethod1(){
		System.out.println("this is start test11!");
		//该循环的目地只有一个,就是可以使当前方法在一定时间内交出执行线程
		for(int i=0;i<100000000;i++){}
		System.out.println("this is end test1!1");
	}
	
}
