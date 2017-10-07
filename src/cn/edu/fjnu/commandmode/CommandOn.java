package cn.edu.fjnu.commandmode;

public class CommandOn implements Command{

	private Tv myTv;
	
	public CommandOn(Tv tv) {
		myTv = tv;
	}
	
	@Override
	public void execute() {
		myTv.turnOn();
	}

}
