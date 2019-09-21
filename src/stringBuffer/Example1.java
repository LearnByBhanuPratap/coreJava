package stringBuffer;

public class Example1 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("hello ");
		sb.append("Java");
		System.out.println(sb);

		// insert() method

		StringBuffer sb1 = new StringBuffer("Hello ");
		sb1.insert(1, "Java");
		System.out.println(sb1);

		// replace() method
		StringBuffer sb2 = new StringBuffer("Hello");
		sb2.replace(1, 3, "Java");
		System.out.println(sb2);

		// delete() method
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.delete(1, 3);
		System.out.println(sb3);

		// capacity() method

		StringBuffer sb4 = new StringBuffer();
		System.out.println(sb4.capacity());// default 16
		sb4.append("Hello");
		System.out.println(sb4.capacity());// now 16
		sb4.append("java is my favourite language");
		System.out.println(sb4.capacity());// now (16*2)+2=34 i.e // (oldcapacity*2)+2
	}

}
