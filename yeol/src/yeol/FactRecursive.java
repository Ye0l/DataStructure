package yeol;

import java.util.Scanner;

public class FactRecursive {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("insert any integer: ");
		Scanner sc = new Scanner(System.in);
		FactRecursive fact = new FactRecursive();
		
		int i = sc.nextInt();
		System.out.println(fact.factorial(i));
		
	}
	
	public long factorial(int n) {
		long result;
		
		if(n == 1) {
			result = 1;
		} else {
			result = n * factorial(n-1); 
		}
		
		return result;
	}
	
}

