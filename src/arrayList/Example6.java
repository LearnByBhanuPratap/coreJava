package arrayList;

import java.util.ArrayList;

public class Example6 {

	public static ArrayList<String> createData() {
		
		ArrayList<String> arrayListObject = new ArrayList<>();

		arrayListObject.add("A");
		arrayListObject.add("B");
		arrayListObject.add("C");
		arrayListObject.add("D");
		return arrayListObject;
	}

	public static void cloneData() {
		ArrayList<String> actualData = createData();
		ArrayList<String> arrayListClone = (ArrayList<String>) actualData.clone();
		arrayListClone.add("9");
		System.out.println(actualData);
		System.out.println(arrayListClone);
	}

	public static void main(String[] args) {
		Example6.cloneData();
	}
}
