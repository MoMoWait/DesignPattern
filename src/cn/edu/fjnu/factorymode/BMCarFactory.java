package cn.edu.fjnu.factorymode;

public class BMCarFactory implements IFactory{
	
	@Override
	public Car crateCar() {
		//创建宝马车
		return new BMCar();
	}

}
