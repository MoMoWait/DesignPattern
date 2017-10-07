package cn.edu.fjnu.singlemode;

import java.lang.reflect.Constructor;

public class Test {
	public static void main(String[] args) {
		SingletonA a = SingletonA.getInstance();
		System.out.println(a.toString());
		try {
			Constructor constructor = SingletonA.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			Object b = constructor.newInstance();
			System.out.println(b.toString());
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//SingletonB.getInstance();
	}
}
