package cn.edu.fjnu.midemode;

class ColleagueA2 extends AbstractColleague2{    
    public void setNumber(int number, AbstractMediator coll) {    
        this.number = number;    
        coll.AaffectB();
    }    
}  