package cn.edu.fjnu.factorymode;

public class Factory {
	public static Car createCar(String carName){
		switch (carName) {
		case "bm":
			return new BMCar();
		case "byd":
			return new BYDCar();
		default:
			return null;
		}
	}
}
