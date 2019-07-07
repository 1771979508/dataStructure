package nowcoder;

import java.util.HashMap;
import java.util.Map;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年7月7日 上午10:42:26	
*/

/*
 * 		登记式单例
 * 
 * */
public class RegisterSingleton {
	
	private static Map<String,RegisterSingleton> map = new HashMap<String,RegisterSingleton>();
	static{
		RegisterSingleton singleton = new RegisterSingleton();
		map.put(singleton.getClass().getName(), singleton);
	}
	// 保护的默认构造方法
	protected RegisterSingleton(){}
	// 静态工厂方法，返还此类唯一的实例
	public static RegisterSingleton getInstance(String name){
		if(name == null){
			name = RegisterSingleton.class.getName();
			System.out.println("name == null"+"--->name="+name);
		}
		if(map.get(name) == null){
			try{
				map.put(name,(RegisterSingleton)Class.forName(name).newInstance());  // 通过反射来拿到动态的构造
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return map.get(name);
	}
	// 一个示意性的商业方法
	public String about(){
		return "Hello,I am RegSingleton.";
	}
	public static void main(String[] args) {
		
		RegisterSingleton registerSingleton = RegisterSingleton.getInstance(null);
		System.out.println(registerSingleton.about());
		
	}
}
	