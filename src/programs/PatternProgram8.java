package programs;

public class PatternProgram8 {

	/**
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1

	 */
	public static void main(String[] args) {
		for(int i = 1; i<=7; i++){
			
			for(int j = 1; j<=i; j++){
				System.out.print(j+" ");
			}
			
			for(int j = i-1; j>=1; j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
