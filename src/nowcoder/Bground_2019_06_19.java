package nowcoder;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月16日 下午4:52:37	
*/
public class Bground_2019_06_19 extends Thread{
	
	public static void main(String[] args) {
		
		Bground_2019_06_19 bground_2019_06_19 = new Bground_2019_06_19();
		bground_2019_06_19.run();
		
	}
	
	public void start(){
		for(int i=0;i<10;i++){
			System.out.println("Value of i= "+i);
		}
	}
	
}
	