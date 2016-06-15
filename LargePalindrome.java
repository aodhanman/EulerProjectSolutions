package euler;

public class LargePalindrome {
	public static void main(String[] args) {
		
		int x = 1000;
		
		for (int i = x; i > 900; i--) {
			for (int j = x; j > 900; j--) {
				int f = i * j;
				StringBuilder num = new StringBuilder();
				StringBuilder num1 = new StringBuilder();

				num.append(f);
				num1.append(f);
				num1.reverse();
				
				if(num.toString().equals(num1.toString())){
					System.out.println(num);

				}

			}
		}
	}
}
