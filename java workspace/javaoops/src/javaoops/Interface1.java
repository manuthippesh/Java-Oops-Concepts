package javaoops;
interface Test{
	public void meth1();
	public void meth2();
}
class My implements Test{

	@Override
	public void meth1() {
		// TODO Auto-generated method stub
		System.out.println("Meth1 of class My");
		
	}

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("Meth2 of class My");
		
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new My();
		t.meth1();
		t.meth2();

	}

}
