package javaoops;
class Rectangl{
	private double length;
	private double breadth;
	
	//default constructor
	public Rectangl() {
		length=1;
		breadth=1;
	}
	// parameterized constructor
	public Rectangl(int l,int b) {
		length=l;
		breadth=b;
	}
	 public double area() {
		 return length*breadth;
		
	 }
	 public double perimeter() {
		 return 2*(length+breadth);
	 }
	
}

public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Rectangl r=new Rectangl();
		Rectangl r1=new Rectangl(10,5);
		System.out.println(r.area());
		System.out.println(r1.area());

	}

}
