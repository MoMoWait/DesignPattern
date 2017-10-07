package cn.edu.fjnu.proxymode;

public class Test {
	public static void main(String[] args) {
		  People People_1 =new People();  
	      People_1.setCash(60000);  
	      People_1.setUsername("jeck");  
	  
	  
	      People People_2 =new People();  
	      People_2.setCash(40000);  
	      People_2.setUsername("rose");  
	       
	      People People_3 =new People();  
	  
	      People_3.setCash(0);  
	      People_3.setUsername("tom");  
	      People_3.setVip("vip");  
	       
	      ProxyClass proxy_buy = new ProxyClass();  
	      proxy_buy.setPeople(People_1);  
	      proxy_buy.buyCar();
	       
	      proxy_buy.setPeople(People_2);  
	      proxy_buy.buyCar();
	       
	      proxy_buy.setPeople(People_3);  
	      proxy_buy.buyCar();
	             
	}
}
