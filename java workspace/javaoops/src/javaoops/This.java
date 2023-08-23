package javaoops;
class React{
	int length;
	int breadth;
	React(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
		
	}
	void display() {
		System.out.println(this.length+" "+"\n"+this.breadth);
	}
}

public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		React r=new React(19, 21);
		r.display();
	}

}
