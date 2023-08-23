package javaoops;

public class Berry {
	String berry = "bil";

   

    void juicy(String b) {
        this.berry="rasp";
        System.out.println(b + "berry");
    }
    public static void main(String[] args) {
        Berry b= new Berry();
        
        b.juicy("cran");
        System.out.println(b.berry);
        
         
     }

	
}

