package cn.edu.fjnu.factorymode;

public class FactoryB implements ICarFactory{

	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	@Override
	public Aircondition crateAirCondition() {
		return new AirconditionB();
	}

}
