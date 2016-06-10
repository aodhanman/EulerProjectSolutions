import java.util.Scanner;

public class FactorialDigitS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		double n = sc.nextDouble();
		double x = 1;
		
		for(double i = n;i > 1;i --){
				x=(x*i);
			System.out.println(x + " * " + (i-1));

		}
		String s = String.valueOf(x);
		String [] stuff = s.split("");
		System.out.println(s);
		
	}
}
