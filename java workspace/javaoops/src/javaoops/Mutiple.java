package javaoops;
class Wishes  
{  
void message()  
{  
System.out.println("Best of Luck!!");  
}  
}  
class Birthday  
{  
void message()  
{  
System.out.println("Happy Birthday!!");  
}  
} 
class Demo extends Birthday,Wishes //considering a scenario   
{  
	
	

}
class Mutiple extends Wishes,Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.message();

	}

}
