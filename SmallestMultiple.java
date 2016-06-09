package euler;

public class SmallestMultiple {

	public static void main(String[] args) {
		int x = 0;
		
		for (int i = 1; i < 465585110; i ++){
			for( int j = 1; j <21; j ++){
				if(i % j ==0){
					//System.out.println(j + " is it" + i);
					for(int k = 0; k < 11; k ++){
						if(j == 20){
							System.out.println("Smallest number divided by " + j + "  is: " + i );
							break;
						}
					}
				}else{
					break;
				}
				
			}
		}
	}
	
}
