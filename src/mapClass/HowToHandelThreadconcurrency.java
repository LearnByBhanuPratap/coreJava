package mapClass;

import java.util.Collections;
import java.util.HashSet;

public class HowToHandelThreadconcurrency {
	
	public static void main(String[] args) {
		Collections.synchronizedSet(new HashSet<Integer>());
	}

}
