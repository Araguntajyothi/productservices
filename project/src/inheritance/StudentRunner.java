package inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		
		// Student student = new Student();
		// student.setName("Ranga");
		// student.setName("akshayajyothi17@gmail.com");

		/*
		 * Person person = new Person(); person.setName("Ranga");
		 * person.setEmail("akshayajyothi17@gmail.com");
		 * person.setPhoneNumber("123-456-7890"); String value = person.toString();
		 * System.out.println(value); System.out.println(person);
		 */
		// above all is inheritance

		// below one is inheritance baics

		Employee employee = new Employee("Ranga", "Programmer Analyst");
		// employee.setName("Ranga");
		employee.setEmail("akshayajyothi17@gmail.com");
		employee.setPhoneNumber("123-456-7890");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		System.out.println(employee);
	}

}
