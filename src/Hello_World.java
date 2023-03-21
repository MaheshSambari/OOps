import java.util.Scanner;

public class Hello_World extends Mahesh {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
             System.out.println("Hi");
             int i=0;
             while(i==0) {
             Mahesh m = new Mahesh();
             System.out.println("enter Best Worker in your Company");
             m.setI(sc.nextLine());
             String test=m.getI();
             if(test.equals("Srilakshmi"))
             {
            	 System.out.println("Yes "+test+" Is Perfect All Dynatrace errors will come to monitor group and she will get bonus");
            	 }
             else if(test.equals("Tulasi")) 
             {
            	 System.out.println("Yes "+test+" Is Perfect Seniour");
            	 }
             
             else if(test.equals("Nithish")) {
             System.out.println("No  No  "+test+" is escaping star");
	}
             else {
            	 System.out.println("I don't know about " + test + " Yaar");
            	 System.out.println("");
            	 i=1;
            	 
             }
             
	}
            //System.out.println(r);
             
	}


}