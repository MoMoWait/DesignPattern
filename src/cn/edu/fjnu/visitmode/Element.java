package cn.edu.fjnu.visitmode;

abstract class Element {    
    public abstract void accept(IVisitor visitor);    
    public abstract void doSomething();    
} 

class ConcreteElement1 extends Element {    
    public void doSomething(){    
        System.out.println("这是元素1");    
    }    
        
    public void accept(IVisitor visitor) {    
        visitor.visit(this);    
    }    
}    
    
class ConcreteElement2 extends Element {    
    public void doSomething(){    
        System.out.println("这是元素2");    
    }    
        
    public void accept(IVisitor visitor) {    
        visitor.visit(this);    
    }    
}   