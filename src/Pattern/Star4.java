package Pattern;

import java.util.Scanner;

public class Star4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
			
			System.out.print("* ");
			
		}
		
		System.out.println();
		
		

	}
		for(int i=1; i<=n; i++) {
		for(int j=n; j>=i;j--) {
			System.out.print("* ");
			
	}
		System.out.println();

		}
	}
}
