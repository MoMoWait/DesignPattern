package cn.edu.fjnu.watchmode;

public class Police implements Watcher{

	@Override
	public void update() {
		System.out.println("运输车有行动，警察护航");
	}

}
