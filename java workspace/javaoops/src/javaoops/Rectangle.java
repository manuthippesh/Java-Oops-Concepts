package javaoops;
class Rectangle1{
	public double length;
	public double breadth;
	
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	public boolean isSquare() {
		if(length==breadth) {
			return true;
		}
		else
			return false;
	}
}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 rec=new Rectangle1();
		rec.length=2;
		rec.breadth=3;
		System.out.println(rec.area());
		System.out.println(rec.perimeter());
		System.out.println(rec.isSquare());
	}

}
