package cn.edu.fjnu.factorymode;

 class BMW320 {  
    public BMW320(){  
        System.out.println("制造-->BMW320");  
    }  
}  
  
 class BMW523 {  
    public BMW523(){  
        System.out.println("制造-->BMW523");  
    }  
}  
  
public class Customer {  
    public static void main(String[] args) {  
//        Factory.createCar("byd");
//        Factory.createCar("bm");
//        
//        IFactory bmFactory = new BMCarFactory();
//        bmFactory.crateCar();
//        
//        IFactory bydFactory = new BYDCarFactory();
//        bydFactory.crateCar();
        
    	  ICarFactory factoryA = new FactoryA();
    	  factoryA.createEngine();
    	  factoryA.crateAirCondition();
    	  
    	  
    	  ICarFactory factoryB = new FactoryB();
    	  factoryB.createEngine();
    	  factoryB.crateAirCondition();
    }  
}  

