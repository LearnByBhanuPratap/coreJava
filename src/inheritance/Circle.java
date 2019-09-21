package inheritance;

public class Circle {
	
	Operation operation;
	
	public void calculateArea(int area){
		operation = new Operation();
		int a = operation.square(area);
		System.out.println("Circle area="+a);
	}
	
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.calculateArea(5);
	}

}
