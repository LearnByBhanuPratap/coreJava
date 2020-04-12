import java.util.HashMap;
import java.util.Set;

public class Key {

	String key;

	Key(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return key.equals(((Key) obj).key);
	}

	public static void main(String[] args) {
		HashMap<Key, Integer> map = new HashMap<Key, Integer>();
		map.put(new Key("Aman"), 2);
		map.put(new Key("Sunny"), 7);
		map.put(new Key("Ritesh"), 5);
		map.put(new Key("Ram"), 2);
		map.put(new Key("Test"), 7);
		Set<Key> keys = map.keySet();
		for (Key key : keys) {
			System.out.println("key=" + key.key + " Value=" + map.get(key) + " hashCode " + key.hashCode() + " index="
					+ (key.hashCode() % 15));
		}
	}
}