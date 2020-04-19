import java.util.HashMap;
import java.util.Set;

public class PersonHashingTest1{

	String data;

	PersonHashingTest1(String key) {
		this.data = key;
	}

	@Override
	public int hashCode() {
		int hash = (int) data.charAt(0);
		//System.out.println("hashCode for key: " + data + " = " + hash);
		return hash;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		return super.equals(obj);
//	}

	@Override
	public boolean equals(Object obj) {
		return data ==(((PersonHashingTest1) obj).data);
	}

	public static void main(String[] args) {

		HashMap<PersonHashingTest1, Integer> map = new HashMap<PersonHashingTest1, Integer>();
		map.put(new PersonHashingTest1("bhanu"), 10);
		map.put(new PersonHashingTest1("pratap"), 20);
		map.put(new PersonHashingTest1("bhanuTest"), 30);
		map.put(new PersonHashingTest1("bhanuTest"), 40);
		Set<PersonHashingTest1> keys = map.keySet();
		
		for (PersonHashingTest1 key : keys) {
			System.out.println("key=" + key.data + " Value=" + map.get(key)+ " hashCode " + key.hashCode()  + " index=" + (key.hashCode() % 15));
		}
	}

	@Override
	public String toString() {
		return "Key1 [data=" + data + "]";
	}
}