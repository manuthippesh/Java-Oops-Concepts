package javaoops;
class Data{
	private double length;
	private double breadth;
	
	public double area() {
		return getLength()*getBreadth();
	}
	public double perimeter() {
		return 2*(getLength()+getBreadth());
				
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d=new Data();
		d.setLength(5);
		d.setBreadth(3);
		System.out.println("Area of Rectangle"+d.area());
		System.out.println("Perimeter of rectangle"+d.perimeter());
		System.out.println((int)d.getLength());
		System.out.println((int)d.getBreadth());
		
		
		
	}

}
