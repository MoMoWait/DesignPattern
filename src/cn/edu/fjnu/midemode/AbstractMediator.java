package cn.edu.fjnu.midemode;
abstract class AbstractMediator {    
    protected AbstractColleague2 A;    
    protected AbstractColleague2 B;    
        
    public AbstractMediator(AbstractColleague2 a, AbstractColleague2 b) {    
        A = a;    
        B = b;    
    }    
    
    public abstract void AaffectB();    
        
    public abstract void BaffectA();    
    
}    
