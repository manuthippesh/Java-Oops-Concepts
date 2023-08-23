package javaoops;
class Param{
	Param(){
		System.out.println("no param");
	}
	Param(int x){
		System.out.println("Param");
	}
}
class Chil extends Param{
	Chil(){
		System.out.println("chil non param");
	}
	Chil(int x){
		super(x);
		System.out.println("2 Param ");
	}
}

public class Parameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chil c=new Chil(20);
		Param p=new Param(12);
		

	}

}
