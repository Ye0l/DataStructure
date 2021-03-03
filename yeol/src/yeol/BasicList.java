package yeol;

import java.util.Scanner;

public class BasicList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("print Arr");
		System.out.print("[");
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i]);
			if(i != 4)
				System.out.print(", ");
		}
		System.out.print("]");
	}

}
