import java.util.HashMap;
import java.util.Set;

public class PersonHashingTest2{

	String data;

	PersonHashingTest2(String key) {
		this.data = key;
	}

	@Override
	public boolean equals(Object obj) {
		return data ==(((PersonHashingTest2) obj).data);
	}

	public static void main(String[] args) {

		HashMap<PersonHashingTest2, Integer> map = new HashMap<PersonHashingTest2, Integer>();
		map.put(new PersonHashingTest2("bhanu"), 10);
		map.put(new PersonHashingTest2("pratap"), 20);
		map.put(new PersonHashingTest2("bhanuTest"), 30);
		map.put(new PersonHashingTest2("bhanuTest"), 40);
		Set<PersonHashingTest2> keys = map.keySet();
		
		for (PersonHashingTest2 key : keys) {
			System.out.println("key=" + key.data + " Value=" + map.get(key)+ " hashCode " + key.hashCode()  + " index=" + (key.hashCode() % 15));
		}
	}

	@Override
	public String toString() {
		return "Key1 [data=" + data + "]";
	}
}