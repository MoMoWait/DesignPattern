package cn.edu.fjnu.buildermode;

public  class WomanBuilder implements PersonBuilder{

	Person woman = new Person();
	
	@Override
	public PersonBuilder buildHead() {
		woman.setHead("create woman head");
		return this;
	}

	@Override
	public PersonBuilder buildBody() {
		woman.setHead("create woman body");
		return this;
	}

	@Override
	public PersonBuilder buildFoot() {
		woman.setHead("create woman foot");
		return this;
	}

	@Override
	public Person buildPerson() {
		return woman;
	}

}
