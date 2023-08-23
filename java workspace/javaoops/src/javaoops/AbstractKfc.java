package javaoops;
abstract class KFC{
	KFC(){
		System.out.println("set the outlet");
	}
	void makeItem() {
		System.out.println("make item");
		
	}
	abstract void billing();
	abstract void offers();
}
class MyKfc extends KFC{

	@Override
	void billing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void offers() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractKfc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KFC k=new MyKfc();
		//k.makeItem();
		k.billing();
		k.offers();

	}

}
