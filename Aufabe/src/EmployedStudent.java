
public class EmployedStudent extends Student implements EmployeeInterface{

	private Employee employee;
	
	public EmployedStudent(int uninumber, double salary) {
		super(uninumber);
		employee = new Employee(salary);
	}
	
	public Employee getEmployee(){
		return employee;
	}
	public void setEmployee(Employee employee){
		this.employee = employee;
	}
	
	public double getSalary(){
		return employee.getSalary();
	}
	
	@Override
	public String toString(){
		return "Name: "+ getName() +"\n" +"Uninumber: "+ getUninumber()+ "\n" + employee.toString();
	}
	
}
