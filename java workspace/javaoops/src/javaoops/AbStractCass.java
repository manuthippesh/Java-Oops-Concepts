package javaoops;
abstract class Shape{
	abstract double perimeter();
	abstract double area();
	Shape(){
		
	}
	
}
class C extends Shape{

	double radius;
	double perimeter() {
		System.out.println("Perimeter of C");
		return 2*Math.PI*radius;
	}
	C(int r){
		this.radius=r;
	}
	@Override
	double area() {
		System.out.println("Area of C");
		return Math.PI*radius*radius;
		// TODO Auto-generated method stub
	}
}
class R extends Shape{
	double length;
	double breadth;
	R(int l,int b){
		this.breadth=b;
		this.length=l;
		
	}
	
	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of R");
		return 2*(length+breadth);
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		System.out.println("area of R");
		return length*breadth;
	}
	
}
public class AbStractCass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new C(2);
		Shape s1= new R(3,4);
		System.out.println(s.area());
		System.out.println(s.perimeter());
		System.out.println(s1.area());
		System.out.println(s1.perimeter());

	}

}
