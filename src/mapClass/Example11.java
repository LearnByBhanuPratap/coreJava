package mapClass;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example11 {

	public static void main(String[] args) {
		
		// same Example will work for all
		// only output sequence will change
		Map<String, String> map = new HashMap<>();
		
		//Map<String, String> map = new LinkedHashMap<>();
		
		//Map<String, String> map = new TreeMap<>();
		
		map.put("Test1", "A");
		map.put("Test2", "B");
		map.put("Test4", "D");
		map.put("Test3", "C");
		
		System.out.println(map);

		System.out.println(map.replace("Test100", "100"));
		
		System.out.println(map.replace("Test1", "100"));
		
		System.out.println(map);

		map.replace("Test2", "B", "200");
		
		System.out.println(map);

		map.replace("Test2", "C", "2000");
		
		System.out.println(map);

		map.replaceAll( (n, oldValue) -> oldValue+ " replaced");
		System.out.println(map);
		
		map.replaceAll( (n, oldValue) -> "enjoy");
		
		System.out.println(map);
		
/**
Hash Map Output

{Test1=A, Test4=D, Test3=C, Test2=B}
null
A
{Test1=100, Test4=D, Test3=C, Test2=B}
{Test1=100, Test4=D, Test3=C, Test2=200}
{Test1=100, Test4=D, Test3=C, Test2=200}
{Test1=100 replaced, Test4=D replaced, Test3=C replaced, Test2=200 replaced}
{Test1=enjoy, Test4=enjoy, Test3=enjoy, Test2=enjoy}

*/

	}
}
