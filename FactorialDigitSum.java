package euler;

import java.util.Scanner;

public class FactorialDigitSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		double n = sc.nextDouble();
		double x = 1;
		double y = 0;
		
		for(double i = n;i > 1;i --){
				x=(x*i);
			System.out.println(x + " * " + (i-1));

		}
		String s = String.valueOf(x);
		String [] stuff = s.split("");
		
		for (int i = 0; i < stuff.length; i++) {
			y += i;
		}
		System.out.println(y);
	}
}