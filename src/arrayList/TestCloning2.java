package arrayList;

public class TestCloning2 {

	public static void main(String[] args) throws CloneNotSupportedException {

		Department1 hr = new Department1(1, "Human Resource");

		Employee1 original = new Employee1(1, "Admin", hr);

		Employee1 cloned = (Employee1) original.clone();

		// Let change the department name in cloned object and we will verify in
		// original object

		System.out.println("original.getDepartment()==" + original.getDepartment().getName());
		System.out.println("cloned.getDepartment()==" + cloned.getDepartment().getName());

		cloned.getDepartment().setName("Finance");
		System.out.println("original.getDepartment()==" + original.getDepartment().getName());
		System.out.println("cloned.getDepartment()==" + cloned.getDepartment().getName());
		original.getDepartment().setName("tset");
		System.out.println("original.getDepartment()==" + original.getDepartment().getName());
		System.out.println("cloned.getDepartment()==" + cloned.getDepartment().getName());

	}
}
