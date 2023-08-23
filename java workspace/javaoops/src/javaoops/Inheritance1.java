package javaoops;
class Circl{
	private double radius;
	public double area() {
		return Math.PI*radius*radius;
	}
	public double peri() {
		return 2*Math.PI*getRadius();
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
}
class Cylinder extends Circl{
	public double height;
	public double volume() {
		return area()*height*getRadius();
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cylinder c=new Cylinder();
		c.height=2;
		c.setRadius(3);
				
		System.out.println("Area:"+c.area());
		System.out.println("Volume :"+c.volume());

	}

}
