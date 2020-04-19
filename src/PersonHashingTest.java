import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonHashingTest {

	String data;

	PersonHashingTest(String key) {
		this.data = key;
	}

	public static void main(String[] args) {

		Set<Integer> obj = new HashSet<Integer>();
		List<Integer> ob1 = new ArrayList<Integer>();
		obj.add(10);
		obj.add(10);
		System.out.println(ob1);

		
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		map1.put(10, 20);
		
		Set<Integer> keys1 = map1.keySet();
		
		for (Integer key : keys1) {
			System.out.println("key="+key+" hashCode " + key.hashCode());
		}
		
		System.out.println(map1);
		System.out.println("---------------");
		
		
		map1.put(20, 200);
		keys1 = map1.keySet();
		for (Integer key : keys1) {
			System.out.println("key="+key+" hashCode " + key.hashCode());
		}
		
		System.out.println(map1);
		System.out.println("---------------");
		
		map1.put(20, 4000);
		
		keys1 = map1.keySet();
		for (Integer key : keys1) {
			System.out.println("key="+key+" hashCode " + key.hashCode());
		}
		System.out.println(map1);
		System.out.println("---------------");
		
		map1.put(10, 4000);
		
		keys1 = map1.keySet();
		for (Integer key : keys1) {
			System.out.println(" hashCode " + key.hashCode());
		}
		System.out.println(map1);

		HashMap<PersonHashingTest, Integer> map = new HashMap<PersonHashingTest, Integer>();

		map.put(new PersonHashingTest("Aman"), 2);
		map.put(new PersonHashingTest("Sunny"), 7);
		map.put(new PersonHashingTest("Ritesh"), 5);
		map.put(new PersonHashingTest("Ritesh"), 50);
		map.put(new PersonHashingTest("Ram"), 2);
		map.put(new PersonHashingTest("Test"), 7);
		map.put(new PersonHashingTest("Test"), 7);

		System.out.println(map);

		Set<PersonHashingTest> keys = map.keySet();

		for (PersonHashingTest key : keys) {
			System.out.println("key=" + key.data + " Value=" + map.get(key) + " hashCode " + key.hashCode() + " index="
					+ (key.hashCode() % 15));
		}
	}

//	@Override
//	public String toString() {
//		return "PersonHashingTest [Key=" + data + "]";
//	}
}