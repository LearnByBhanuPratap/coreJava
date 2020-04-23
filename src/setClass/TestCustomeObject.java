package setClass;

public class TestCustomeObject {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Emplyee emp = new Emplyee("Test1", 30);
		CustomeObject originalObject = new CustomeObject(1,emp);
		
		CustomeObject clonedObject = (CustomeObject)originalObject.clone();
		
		System.out.println(originalObject);
		System.out.println(clonedObject);
		
		clonedObject.getEmplyee().setName("Changed");
		
		System.out.println(originalObject);
		System.out.println(clonedObject);
		
	}

}
