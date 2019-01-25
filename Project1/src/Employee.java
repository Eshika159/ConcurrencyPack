import java.util.*;
public class Employee implements Comparable<Employee> {
	
	String	firstName, lastName ,email,  address,mobileNumber;
	
	
		public Employee(String firstName, String lastName,String mobileNumber, String email,
			String address) {
		
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
		
		
	}


		@Override
		public int compareTo(Employee obj) {
			
			return this.firstName.compareTo(obj.firstName);
		} 

	
	
}
