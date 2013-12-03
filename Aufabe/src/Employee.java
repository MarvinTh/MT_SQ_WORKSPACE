
public class Employee implements EmployeeInterface{

	private double salary;
	
	public Employee(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	
	@Override
	public String toString(){
		return "Salery: " + salary + "\n";
	}
}
