package javaoops;
abstract class Sup{
	
	Sup(){
		System.out.println("sup const");
	}
	void meth1() {
		System.out.println("meth1 called");
	}
	abstract void meth2();
}
class Sub1 extends Sup{

	@Override
	void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Sub of meth2");
		
	}
	
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sup su=new Sub1();
		
		su.meth1();
		su.meth2();
		System.out.println(Integer.MAX_VALUE);

	}

}
