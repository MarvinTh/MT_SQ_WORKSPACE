
public class MainProg {

	public static void main(String[] args) {
		
		Student a = new Student(123);
		Student b = new Student(9889);
		
		Employee x = new Employee(4.45);
		Employee y = new Employee(9.45);

		EmployedStudent test = new EmployedStudent(123, 8.45);
		System.out.println(test.toString());
		test.setEmployee(x);
		System.out.println(test.toString());
		test.setName("Horst Müller");
		test.setEmployee(y);
		System.out.println(test);
	}

}
