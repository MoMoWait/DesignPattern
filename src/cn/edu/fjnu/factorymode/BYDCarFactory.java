package cn.edu.fjnu.factorymode;

public class BYDCarFactory implements IFactory{
	@Override
	public Car crateCar() {
		return new BYDCar();
	}
}