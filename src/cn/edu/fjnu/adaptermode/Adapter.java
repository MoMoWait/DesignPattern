package cn.edu.fjnu.adaptermode;


class Adaptee{
	public void specificRequest(){
		System.out.println("被适配器类具有特殊功能...");
	}
}

interface Target{
	public void request();
}

class ConcreteTarget implements Target{
	@Override
	public void request() {
		System.out.println("普通类具有普通功能");
		
	}
}

public class Adapter extends Adaptee implements Target{
	public void request(){
		super.specificRequest();
	}
	
	public static void main(String[] args) {
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();
		
		Target adater = new Adapter();
		adater.request();
	}
}
