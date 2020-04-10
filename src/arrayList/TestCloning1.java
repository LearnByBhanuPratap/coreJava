package arrayList;

public class TestCloning1 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department hr = new Department(1, "Human Resource");
		Employee original = new Employee(1, "Admin", hr);
		
		Employee cloned = (Employee) original.clone();

		// Let change the department name in cloned object and we will verify in
		// original object

		System.out.println("original.getDepartment()=="+original.getDepartment().getName());
		System.out.println("cloned.getDepartment()=="+cloned.getDepartment().getName());
		
		cloned.getDepartment().setName("Finance");
		System.out.println("original.getDepartment()=="+original.getDepartment().getName());
		System.out.println("cloned.getDepartment()="+cloned.getDepartment().getName());
		original.getDepartment().setName("tset");
		System.out.println("original.getDepartment()=="+original.getDepartment().getName());
		System.out.println("cloned.getDepartment()=="+cloned.getDepartment().getName());
		
		System.out.println("----------");
		
		System.out.println("original.getEmployeeName()=="+original.getEmployeeName());
		System.out.println("cloned.getEmployeeName()=="+original.getEmployeeName());
		
		cloned.setEmployeeName("Finance");
		System.out.println("original.getEmployeeName()=="+original.getEmployeeName());
		System.out.println("cloned.getEmployeeName()=="+original.getEmployeeName());
		original.setEmployeeName("tset");
		System.out.println("original.getEmployeeName()=="+original.getEmployeeName());
		System.out.println("cloned.getEmployeeName()=="+original.getEmployeeName());
		
	}
}
