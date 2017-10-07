package cn.edu.fjnu.midemode;

class ColleagueB2 extends AbstractColleague2{    
    
    public void setNumber(int number, AbstractMediator coll) {    
        this.number = number;    
        coll.BaffectA();
    }    
}   