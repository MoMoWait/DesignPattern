package cn.edu.fjnu.memorandummode;

public class Client2 {
	public static void main(String[] args) {
        GameRole liaowp=new GameRole();
        liaowp.init();
        liaowp.show();
        RoleStateMange adminMange=new RoleStateMange();
        adminMange.setMemento(liaowp.saveMemento());//保存
        liaowp.fightBoss();
        liaowp.show();
        liaowp.recove(adminMange.getMemento());
        liaowp.show();
        
    }
}
