package programs;

import java.util.HashMap;

public class CountNumberInArray {
	
	public static void main(String[] args) {
		int[] a = {355,655,677};
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i =0; i<a.length; i++){
			char[] charr = String.valueOf(a[i]).toCharArray();
			for(int j =0; j<charr.length; j++){
				if(map.containsKey(charr[j])){
					map.put(charr[j], map.get(charr[j])+1);
				}
				else{
					map.put(charr[j], 1);
				}
			}
		}
		System.out.println(map);
		
	}

}
