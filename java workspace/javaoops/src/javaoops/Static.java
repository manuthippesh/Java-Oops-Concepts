package javaoops;
class HondaCity{
	static int x;
	static double price=10;

	static double onRoadPrice(String city) {
		switch(city) {
			case "dehli":return price+price*0.1;
		    case "mumbai":return price*0.09;
		}
		return 0;
	}
}
public class Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HondaCity.price);
		//System.out.println(HondaCity.x);
		System.out.println(HondaCity.onRoadPrice("dehli"));
	}

}
