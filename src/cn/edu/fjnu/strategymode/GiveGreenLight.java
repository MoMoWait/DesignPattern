package cn.edu.fjnu.strategymode;

public class GiveGreenLight implements Strategy {

	@Override
	public void operate() {
		System.out.println("求吴国太开个绿灯，放行");  
	}

}
