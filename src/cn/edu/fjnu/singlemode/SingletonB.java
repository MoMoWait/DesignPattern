package cn.edu.fjnu.singlemode;

public class SingletonB {
	private SingletonB(){
		System.out.println("create singleton b");
	}
	private static class LazyHolder{
		private static final SingletonB INSTANCE = new SingletonB();
	}
	
	public static final SingletonB getInstance(){
		return LazyHolder.INSTANCE;
	}
}
