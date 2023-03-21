package Practice;

import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int prime = 2;
		
		while(prime<num) {
		int num1 = 2;
		boolean b = true;
		while(num1<=prime/2) {
			if(prime%num1==0) {
//				System.out.println(prime);
				b = false;
				break;
				}
			num1++;	
		}
		
		if(b) 
		{
		    System.out.println(prime);
		
		} 
		
		prime++;
		
		}
	}

}
