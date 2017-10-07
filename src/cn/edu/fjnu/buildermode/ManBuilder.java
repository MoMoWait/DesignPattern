package cn.edu.fjnu.buildermode;

public class ManBuilder implements PersonBuilder{

	
	Person person;
	
	public  ManBuilder() {
		person = new Person();
	}
	
	@Override
	public PersonBuilder buildHead() {
		person.setHead("create man head");
		return this;
	}

	@Override
	public PersonBuilder buildBody() {
		person.setBody("create man body");
		return this;
	}

	@Override
	public PersonBuilder buildFoot() {
		person.setFoot("create man foot");
		return this;
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
