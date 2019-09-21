package programs;

public class TwoMaxNumbersInArray {
	
	
	public void twoMaxNumbersInArray(int[] a){
		int firstBigNumber = 0;
		int secondBigNumber = 0;
		
		for(int num:a){
			
			if(firstBigNumber < num){
				secondBigNumber = firstBigNumber;
				firstBigNumber = num;
				System.out.println("secondBigNumber:-"+secondBigNumber);
				System.out.println("firstBigNumber:-"+firstBigNumber);
				System.out.println("-------");
				
			}
			else if(secondBigNumber < num){
				secondBigNumber = num;
				
				System.out.println("secondBigNumber:-"+secondBigNumber);
				System.out.println("*******");
			}
		}
		
		System.out.println("firstBigNumber is:-"+firstBigNumber);
		System.out.println("secondBigNumber is:-"+secondBigNumber);
				
	}
	
    public static void main(String a[]){
        int num[] = {5,34,78,2,45,1,99,23};
        TwoMaxNumbersInArray obj = new TwoMaxNumbersInArray();
        obj.twoMaxNumbersInArray(num);
       
    }

}
