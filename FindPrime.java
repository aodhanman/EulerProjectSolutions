package euler;

public class FindPrime {
	public static void main(String[] args) {
		
		for (int i = 2; i < 10; i++) {
			for(int k = 2; k < i; k ++){
				for(int j = 0; i % k != 0;j++){
					
					if(j == 0){
						System.out.println(i + " " + k);
						}
					}
				}
			
		}
		
		
	}

}
