package cn.edu.fjnu.commandmode;

public class CommandOff implements Command{

	private Tv myTv;
	
	public CommandOff(Tv tv) {
		myTv = tv;
	}
	
	@Override
	public void execute() {
		myTv.turnOff();
	}

}
