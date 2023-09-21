
public class EmployeeRaise {

	public static void main(String[] args) {
		Employee Camryn = new Employee("Camryn M",10000);
		System.out.println(Camryn.getName());
		System.out.println(Camryn.getSalary());
		Camryn.raiseSalary(10);
		System.out.println(Camryn.getSalary());
	}
}
