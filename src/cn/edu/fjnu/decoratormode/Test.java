package cn.edu.fjnu.decoratormode;

public class Test {
	public static void main(String[] args) {
//		Human person = new Person();
//		Decorator decorator = new Decorator_two(new Decorator_first(new Decorator_zero(person)));
//		decorator.wearClothes();
//		decorator.walkToWhere();
		
		 Humburger humburger = new ChickenBurger();    
	        System.out.println(humburger.getName()+"  价钱："+humburger.getPrice());    
	        Lettuce lettuce = new Lettuce(humburger);    
	        System.out.println(lettuce.getName()+"  价钱："+lettuce.getPrice());    
	        Chilli chilli = new Chilli(humburger);    
	        System.out.println(chilli.getName()+"  价钱："+chilli.getPrice());    
	        Chilli chilli2 = new Chilli(lettuce);    
	        System.out.println(chilli2.getName()+"  价钱："+chilli2.getPrice());
	}
}
