package cn.edu.fjnu.factorymode;

public class FactoryA implements ICarFactory{

	@Override
	public Engine createEngine() {
		return new EngineA();
	}

	@Override
	public Aircondition crateAirCondition() {
		return new AirconditionA();
	}

}
