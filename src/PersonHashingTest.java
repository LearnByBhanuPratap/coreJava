import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PersonHashingTest {

	String data;

	PersonHashingTest(String key) {
		this.data = key;
	}

	public static void main(String[] args) {

		Set<Integer> obj = new HashSet<Integer>();
		obj.add(10);

		HashMap<PersonHashingTest, Integer> map = new HashMap<PersonHashingTest, Integer>();

		map.put(new PersonHashingTest("Aman"), 2);
		map.put(new PersonHashingTest("Sunny"), 7);
		map.put(new PersonHashingTest("Ritesh"), 5);
		map.put(new PersonHashingTest("Ritesh"), 50);
		map.put(new PersonHashingTest("Ram"), 2);
		map.put(new PersonHashingTest("Test"), 7);
		map.put(new PersonHashingTest("Test"), 7);

		Set<PersonHashingTest> keys = map.keySet();

		for (PersonHashingTest key : keys) {
			System.out.println("key=" + key.data + " Value=" + map.get(key) + " hashCode " + key.hashCode() + " index="
					+ (key.hashCode() % 15));
		}
	}
}