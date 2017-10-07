package cn.edu.fjnu.strategymode;

public class BlackEnemy implements Strategy {

	@Override
	public void operate() {
		System.out.println("孙夫人断后，挡住追兵");  
	}

}
