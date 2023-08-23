package javaoops;
class Parent{
	public Parent() {
		System.out.println("Parent constructor");
		
	}
	
}
class Child extends Parent{
	public Child() {
		System.out.println("Child constructor");
	}
}
class GrandChild extends Child{
		public GrandChild() {
			System.out.println("Grand constructor");
		}
}
public class Const_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		GrandChild g=new GrandChild();

	}

}
