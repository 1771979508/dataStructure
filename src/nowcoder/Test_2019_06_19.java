package nowcoder;

/**
*	@author 作者 Joker青
*	@version 创建时间：2019年6月16日 上午11:48:12	
*/
public class Test_2019_06_19 {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("123");
		System.out.println(employee.empID);
		
	}
	
}

class Person{
	String name = "No name";
	public Person(String nm){
		name = nm;
	}
	public Person(){
		
	}
}

/*
 * 
 * 子类的构造方法总是先调用父类的构造方法，如果子类的构造方法没有明显地指明使用父类的哪个构造方法，子类就调用父类不带参数的构造方法。
		而父类没有无参的构造函数，所以子类需要在自己的构造函数中显示的调用父类的构造函数。
 * 
 * */

class Employee extends Person {

	String empID = "0000";
	public Employee(String id){
		empID = id;
	}
	
}