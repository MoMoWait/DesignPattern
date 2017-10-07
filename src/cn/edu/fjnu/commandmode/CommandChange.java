package cn.edu.fjnu.commandmode;

public class CommandChange implements Command{

	private Tv myTv;
	private int channel;
	
	public CommandChange(Tv tv, int channel) {
		myTv = tv;
		this.channel = channel;
	}
	
	@Override
	public void execute() {
		myTv.changeChannel(channel);
	}

}
