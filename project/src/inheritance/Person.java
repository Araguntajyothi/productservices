package inheritance;

//inheritance is used to reuse the code in person class and create a class called student
//person is a super class
//in java every class extends object
//object is the root of the class hierarchy
public class Person extends Object {
	private String name;
	private String email;
	private String phoneNumber;


	public Person(String name) {
		System.out.println("person constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
@Override
	// method overriding
	public String toString() {
		// return getClass().getName() + "#" + Integer.toHexString(hashCode());
		return name + "#" + email + "#" + phoneNumber;
	}
}
