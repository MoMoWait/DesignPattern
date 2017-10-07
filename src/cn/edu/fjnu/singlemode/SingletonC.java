package cn.edu.fjnu.singlemode;

public class SingletonC {
	private SingletonC(){
		System.out.println("create singleton c");
	}
	private static final SingletonC single = new SingletonC();
	public static SingletonC getInstance(){
		return single;
	}
}
