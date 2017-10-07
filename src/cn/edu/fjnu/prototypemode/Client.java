package cn.edu.fjnu.prototypemode;


class Prototype implements Cloneable{
	@Override
	public Prototype clone() throws CloneNotSupportedException {
		return (Prototype)super.clone();
	}
}


class ConcretePrototype extends Prototype{
	public void show(){
		System.out.println("原型模式实现类 " + toString());
	}
}

public class Client {

	public static void main(String[] args) {
		ConcretePrototype cp = new ConcretePrototype();
		for(int i = 0; i < 10; ++i){
			ConcretePrototype type = null;
			try {
				type = (ConcretePrototype)cp.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(type != null)
				type.show();
		}
	}

}
