package cn.edu.fjnu.buildermode;
public interface PersonBuilder {
	PersonBuilder buildHead();
	PersonBuilder buildBody();
	PersonBuilder buildFoot();
	Person buildPerson();
}
