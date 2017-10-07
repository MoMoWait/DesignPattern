package cn.edu.fjnu.buildermode;

public class TestBuilderMode {
	public static void main(String[] args){		
		PersonDirector director = new PersonDirector();
		Person womanPerson = director.constructPerson(new WomanBuilder());
		Person manPerson = director.constructPerson(new ManBuilder());
	}
}
