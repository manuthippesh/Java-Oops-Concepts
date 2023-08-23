package javaoops;
class Super {
	public void display() {
		System.out.println("hello");
	}
}
class Sub extends Super{
	
	public void display() {
		System.out.println("hello world");
		
	}
	public void show() {
		System.out.println("show");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super su=new Sub();
		su.display();
		//su.show();
		Sub sb=new Sub();
		sb.display();
		

	}

}
