
public class Employee extends Person {
	private int id;
	private String department;
	private double salary;
	private MyDate dateOfJoining;
	
	public Employee(String name, MyDate dob, int id, String department, double salary, MyDate doj) {
		super(name,dob);
		this.id=id;
		this.department=department;
		this.salary=salary;
		this.dateOfJoining=doj;
		
	}
	public int getId() {
		return id;
	}
	
	public double getsalary() {
		return salary;
	}
	
	public MyDate getDateOfJoining() {
		return dateOfJoining;	
	}
	
	public String toString(){
		return super.toString() +
				 ", ID: " + id +
	               ", Dept: " + department +
	               ", Salary: " + salary +
	               ", DOJ: " + dateOfJoining;		
					
	}
	
}
