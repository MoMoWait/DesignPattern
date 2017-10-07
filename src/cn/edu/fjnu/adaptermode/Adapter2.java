package cn.edu.fjnu.adaptermode;



public class Adapter2  implements Target{
	private Adaptee mAdaptee;
	public Adapter2(Adaptee adaptee){
		mAdaptee = adaptee;
	}
	public void request(){
		mAdaptee.specificRequest();
	}
	
	public static void main(String[] args) {
		
		Target adater = new Adapter2(new Adaptee());
		adater.request();
	}
}
