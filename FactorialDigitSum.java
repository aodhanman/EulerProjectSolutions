package euler;

import java.util.Scanner;

public class FactorialDigitSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		double n = sc.nextDouble();
		double x = 1;
		double y = 1;
		
		for(double i = n;i > 1;i --){
				x=(x*i);
			System.out.println(x + " * " + (i-1));

		}
		String s = String.valueOf(x);
		int [] intArray = new int[s.length()];
		
		for(int i = 0; i < s.length(); i ++){
			intArray[i] = Character.digit(s.charAt(i),10);
			System.out.println(s.charAt(i));
			y += intArray[i];
		}
		System.out.println(y);

		
		//System.out.println(y);
	}
}