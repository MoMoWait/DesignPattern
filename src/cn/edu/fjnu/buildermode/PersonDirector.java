package cn.edu.fjnu.buildermode;

public class PersonDirector {
	  public Person constructPerson(PersonBuilder pb) {  
          pb.buildHead();  
          pb.buildBody();  
          pb.buildFoot();  
          return pb.buildPerson();  
     }  
}
