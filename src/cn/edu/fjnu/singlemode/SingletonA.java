package cn.edu.fjnu.singlemode;

public class SingletonA {
	private static boolean isCreate = false;
	private SingletonA(){
		System.out.println("create singleton a");
		if(!isCreate)
			isCreate = !isCreate;
		else
			throw new RuntimeException("单例模式被侵犯！");  
	}
	private static SingletonA single = null;
	public static synchronized SingletonA getInstance(){
		if(single == null)
			single = new SingletonA();
		return single;
	}
}
