import java.util.HashMap;
import java.util.Set;

public class PersonHashingTest3{

	String data;

	PersonHashingTest3(String key) {
		this.data = key;
	}
	
	@Override
	public int hashCode() {
		int hash = (int) data.charAt(0);
		return hash;
	}

	public static void main(String[] args) {

		HashMap<PersonHashingTest3, Integer> map = new HashMap<PersonHashingTest3, Integer>();
		map.put(new PersonHashingTest3("bhanu"), 10);
		map.put(new PersonHashingTest3("pratap"), 20);
		map.put(new PersonHashingTest3("bhanuTest"), 30);
		map.put(new PersonHashingTest3("bhanuTest"), 40);
		
		Set<PersonHashingTest3> keys = map.keySet();
		
		for (PersonHashingTest3 key : keys) {
			System.out.println("key=" + key.data + " Value=" + map.get(key)+ " hashCode " + key.hashCode()  + " index=" + (key.hashCode() % 15));
		}
	}

	@Override
	public String toString() {
		return "Key1 [data=" + data + "]";
	}
}