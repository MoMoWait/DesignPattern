package cn.edu.fjnu.watchmode;

public class Test {
	public static void main(String[] args) {
		 Transporter transporter = new Transporter();  
		  
         Police police = new Police();  
         Security security = new Security();  
         Thief thief = new Thief();  
 
         transporter.addWatcher(police);  
         transporter.addWatcher(thief);  
         transporter.addWatcher(security);  
 
         transporter.notifyWatchers();  
	}
}
