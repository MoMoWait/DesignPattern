package cn.edu.fjnu.decoratormode;

public abstract class Humburger {    
    
    protected  String name ;    
        
    public String getName(){    
        return name;    
    }    
        
    public abstract double getPrice();    
    
}    