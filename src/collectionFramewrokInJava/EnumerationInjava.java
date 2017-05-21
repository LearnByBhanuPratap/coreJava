package collectionFramewrokInJava;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationInjava {
	
	public static void main(String[] args) {
		
		Vector<Integer> obj = new Vector<>();
		obj.add(3);
		obj.add(3);
		obj.add(300);
		obj.add(30);
		obj.add(3666);
		obj.add(3);
		obj.add(3);
		
		Enumeration<Integer> enu = obj.elements();
		
		/*
		while(enu.hasMoreElements()){
			System.out.println(enu.nextElement());
		}
		*/
		Iterator<Integer> itr = obj.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println(":::::::::");
		ArrayList<Integer> obj1 = new ArrayList<>();
		obj1.add(3);
		obj1.add(3);
		obj1.add(3);
		
		//Enumeration<Integer> enu1 = obj1.elements();
		
		
	}
	
	
	
	
	
	

}
