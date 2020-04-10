package arrayList;

public class TestCloning1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department hr = new Department(1, "Human Resource");
		
		Employee original = new Employee(1, "Mohan", hr);
		
		Employee cloned = (Employee) original.clone();
		
		System.out.println(original.hashCode());
		System.out.println(cloned.hashCode());
		System.out.println("original.getDepartment().hashCode()=="+original.getDepartment().hashCode());
		System.out.println("cloned.getDepartment().hashCode()=="+cloned.getDepartment().hashCode());

		// Let change the department name in cloned object and we will verify in
		// original object

		System.out.println("original.getDepartment()=="+original.getDepartment().getName());
		System.out.println("cloned.getDepartment()=="+cloned.getDepartment().getName());
		
		cloned.getDepartment().setName("Finance");
		
		System.out.println("original.getDepartment()=="+original.getDepartment().getName());
		System.out.println("cloned.getDepartment()="+cloned.getDepartment().getName());
		
		original.getDepartment().setName("HR");
		
		System.out.println("original.getDepartment()=="+original.getDepartment().getName());
		System.out.println("cloned.getDepartment()=="+cloned.getDepartment().getName());
		
		System.out.println("----------");
		
		System.out.println("original.getEmployeeName()=="+original.getEmployeeName());
		System.out.println("cloned.getEmployeeName()=="+cloned.getEmployeeName());
		
		cloned.setEmployeeName("Sohan");
		
		System.out.println("original.getEmployeeName()=="+original.getEmployeeName());
		System.out.println("cloned.getEmployeeName()=="+cloned.getEmployeeName());
		
		original.setEmployeeName("Ram");
		
		System.out.println("original.getEmployeeName()=="+original.getEmployeeName());
		System.out.println("cloned.getEmployeeName()=="+cloned.getEmployeeName());
		
	}
}
