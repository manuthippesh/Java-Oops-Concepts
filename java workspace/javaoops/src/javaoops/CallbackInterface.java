package javaoops;
interface Member{
	void callback();
}
class Store{
	Member mem[]=new Member[100];
	int count=0;
	void rigister(Member m) {
		mem[count++]=m;
	}
	void inviteSale() {
		for(int i=0;i<count;i++) {
			mem[i].callback();
		}
	}
}
class Customer1 implements Member{
	String name;
	Customer1(String n){
		this.name=n;
	}
	@Override
	public void callback() {
		// TODO Auto-generated method stub
		System.out.println("ok iwill visit"+" "+this.name);
		
	}
	
}

public class CallbackInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store s=new Store();
		Customer1 c1=new Customer1("Manu");
		Customer1 c2=new Customer1("Rajesh");
		s.rigister(c1);
		s.rigister(c2);
		s.inviteSale();
		//c1.callback();
		//c2.callback();
	}

}
