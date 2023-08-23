package javaoops;
class Tv{
	public void swithOn() {
		System.out.println("Tv switch on");
	}
	public void changeChannel() {
		System.out.println("Tv channel changed");
	}
}
class SmartTv extends Tv{
	public void swithOn() {
		System.out.println("SmartTv switch on");
	}
	public void changeChannel() {
		System.out.println("SmartTv channel changed");
	}
	public void browse() {
		System.out.println("Smarttv browser");
	}
}

public class Methodover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t=new SmartTv();
		t.swithOn();
		t.changeChannel();
		

	}

}
