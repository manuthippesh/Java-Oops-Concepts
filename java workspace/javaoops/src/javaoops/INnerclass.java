package javaoops;
class Outer{
	int x=10;
	class Inner {
		int y;
		Inner(int y){
			this.y=y;
		}
		void display() {
			System.out.println(x);
			System.out.println(y);
		}
		
	}
	void display() {
		Inner i=new Inner(20);
		i.display();
		System.out.println(i.y);
	}
}
public class INnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.display();
		Outer.Inner i=new Outer().new Inner(2);
	}

}
