package inheritance;

//sub class
import java.math.BigDecimal;

public class Employee extends Person {

	private String title;
	private String employerName;
	private char employeeGrade;
	private BigDecimal salary;

	public Employee(String name, String title) {
		// implicitly there would be a call,so we no need to call explicitly
		// super();
		super(name);
		this.title = title;
		System.out.println("Employee constructor");
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return super.toString() + "#" + title + "#" + employerName + "#" + employeeGrade;
	}
}
