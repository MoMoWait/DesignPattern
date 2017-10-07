package cn.edu.fjnu.midemode;

public class Mediator extends AbstractMediator{

	public Mediator(AbstractColleague2 a, AbstractColleague2 b) {
		super(a, b);
	}
	
	@Override
	public void AaffectB() {
		int number = A.getNumber();
		B.setNumber(number * 100);;
	}

	@Override
	public void BaffectA() {
		int number = B.getNumber();
		A.setNumber(number / 100);
	}

}
