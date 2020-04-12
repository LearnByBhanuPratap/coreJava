import java.util.HashMap;

public class Key1 {

	String key;

	Key1(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		int hash = (int) key.charAt(0);
		System.out.println("hashCode for key: " + key + " = " + hash);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		return key.equals(((Key1) obj).key);
	}

	public static void main(String[] args) {
		HashMap<Key1, Integer> map = new HashMap<Key1, Integer>();
		map.put(new Key1("bhanu"), 20);
		map.put(new Key1("pratap"), 30);
		map.put(new Key1("bhanuTest"), 40);
	}
}