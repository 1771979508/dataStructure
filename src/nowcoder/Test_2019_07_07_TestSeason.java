package nowcoder;
/**
*	@author 作者 Joker青
*	@version 创建时间：2019年7月7日 下午2:06:20	
*/

/*
 * 		一、自己定义
 * 		二、使用enum关键字定义枚举类
 * 			1.常用的方法
 * 			2.如何让枚举类实现接口
 * 
 * */
public class Test_2019_07_07_TestSeason {
	
	public static void main(String[] args) {
		
		// 1.values() 的用法 返回所有的枚举类的对象
		SeasonEnum[] values = SeasonEnum.values();
		for (int i = 0; i < values.length; i++) {
	        values[i].showMe();
	    }
	      //2.valueOf(String name):要求传入的形参name是枚举类对象的名字，
	      //否则，报java.lang.IllegalArgumentException异常
	      String str = "SUMMER";
	      SeasonEnum season= SeasonEnum.valueOf(str);
	      season.showMe();
	      System.out.println(season);
	     //3.getDeclaringClass()这个方法得到枚举常量所属枚举类型的Class对象
	      //可以用它来判断两个枚举常量是否属于同一个枚举类型
	      System.out.println(season.getDeclaringClass());
	      //4.ordinal() 得到当前枚举常量的次序
	      System.out.println(season.ordinal());
	      //toString()方法  可以重写，使结果更好看
	      //equals()在枚举类型中可以直接使用“==”来比较两个枚举常量是否相等。Enum提供的这个equals()方法，
	      //也是直接使用“==”实现的。它的存在是为了在Set、List和Map中使用。注意，equals()是不可变的。
	      //hashcode   Enum实现了hashCode()来和equals保持一致。它也是不可变的。
	      //compareTo 枚举类型实现了comparable 接口，这样可以比较两个枚举常量的大小（按照声明的顺序排列）
	      //clone 枚举类型不能被clone。为了防止子类实现克隆方法，enum实现了一个仅抛出clonenotsupportedexception异常的不变clone().
		
	}
	
	
}

class Season{
	// 1.提供类的属性，声明为private final
	private final String seasonName;
	private final String seasonDesc;
	// 2.声明为final的属性，在构造器中初始化
	private Season(String seasonName,String seasonDesc){
		this.seasonName = seasonName;
		this.seasonDesc = seasonDesc;
	}
	// 3.通过公共的方法来调属性
	public String getSeasonName() {
		return seasonName;
	}
	public String getSeasonDesc() {
		return seasonDesc;
	}
	// 4.创建枚举类的对象
	public static final Season SPRING = new Season("spring","春暖花开");
	public static final Season SUMMER = new Season("summer","夏日炎炎");
	public static final Season AUTUMN = new Season("autumn","秋高气爽");
	public static final Season WINTER = new Season("winter","白雪皑皑");
	
	@Override
	public String toString() {
		return "Season [seasonName=" + seasonName + ", seasonDesc=" + seasonDesc + "]";
	}
	
	public void show(){
	    System.out.println("这是一个季节");
	}
	
	
}

// 泛型类 要实现的接口
interface Info{
	void showMe();
}

// 泛型类，这个是系统提供
enum SeasonEnum implements Info{
	// 放在第一行
	SPRING("spring","出暖花开"){
		public void showMe(){
			System.out.println("我叫春天");
		}
	},
	SUMMER("summer","夏日炎炎"){
		public void showMe(){
			System.out.println("我叫夏天");
		}
	},
	AUTUMN("autumn","秋高气爽"){
		public void showMe(){
			System.out.println("我叫秋天");
		}
	},
	WINTER("winter","白雪皑皑"){
		public void showMe(){
			System.out.println("我叫冬天");
		}
	};
	
	private final String seasonName;
	private final String seasonDesc;
	
	private SeasonEnum(String seasonName,String seasonDesc){
		this.seasonDesc = seasonDesc;
		this.seasonName = seasonName;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public String getSeasonDesc() {
		return seasonDesc;
	}
	
	@Override
     public String toString() {
         return this.getSeasonName()+":"+this.getSeasonDesc();
     }
 
     public void showMe() {
         
     }
	
}

	