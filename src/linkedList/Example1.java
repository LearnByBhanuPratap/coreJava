package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {
		{
			LinkedList<String> linkedList = new LinkedList<>();

			linkedList.add("A");
			linkedList.add("B");
			linkedList.add("C");
			linkedList.add("D");

			//System.out.println(linkedList);

			linkedList.add(4, "4A");
			linkedList.add(5, "5A");

			linkedList.addFirst("TT");
			linkedList.addLast("LL");

			System.out.println(linkedList);
			
			Iterator<String> itr = linkedList.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
//			
//			for (String data : linkedList) {
//				System.out.println(data);
//			}
//			
//			for (int i = 0; i < linkedList.size(); i++) {
//				System.out.println(linkedList.get(i));
//			}

			ListIterator<String> itrator = linkedList.listIterator();
			while (itrator.hasNext()) {
				System.out.println(itrator.next());
			}
			
			while (itrator.hasNext()) {
				System.out.println(itrator.next());
			}
			
			System.out.println("-----");
			while (itrator.hasPrevious()) {
				System.out.println(itrator.previous());
			}
		}
	}
}
