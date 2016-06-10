import java.util.Scanner;

public class LargePrime {

	public static void main(String[] args) {
		int x =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		if(Prime(n)){
			System.out.println(n + " is a prime");
		}else{
			System.out.println(n + " not a prime");
		}
		for (int i = 2; x < 10001; i++) {
			if(Prime(i)){
				x ++;
				System.out.println(i + " " + x);
			}
		}
		System.out.println(x);
	}
	public static boolean Prime(int n){
		if(n<=1){
			return false;
		}
		for (int i =2; i < Math.sqrt(n); i ++){
			if(n%i ==0){
				return false;
			}
		}
		return true;
	}
}
