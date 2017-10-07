package cn.edu.fjnu.midemode;

public class Client2 {    
    public static void main(String[] args){    
    	   AbstractColleague2 collA = new ColleagueA2();    
           AbstractColleague2 collB = new ColleagueB2();    
               
           AbstractMediator am = new Mediator(collA, collB);    
               
           System.out.println("==========通过设置A影响B==========");    
           collA.setNumber(1000, am);    
           System.out.println("collA的number值为："+collA.getNumber());    
           System.out.println("collB的number值为A的10倍："+collB.getNumber());    
       
           System.out.println("==========通过设置B影响A==========");    
           collB.setNumber(1000, am);    
           System.out.println("collB的number值为："+collB.getNumber());    
           System.out.println("collA的number值为B的0.1倍："+collA.getNumber());      
    }    
}    