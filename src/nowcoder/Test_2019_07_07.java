package nowcoder;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年7月7日 上午9:49:26	
*/
public class Test_2019_07_07{
	
	public static void main(String[] args) {
		Chinese obj1 = Chinese.getInstance();
		Chinese obj2 = Chinese.getInstance();
		System.out.println(obj1==obj2);
	}
	
}
	
class Chinese{
	private static Chinese objref = new Chinese();
	// 构造方法私有，单例模式
	private Chinese(){}
	public static Chinese getInstance(){return objref;}
}