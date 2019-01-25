import java.util.*;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of employees");
		Scanner sc=new Scanner(System.in);
		int empNo=sc.nextInt();
		
		TreeSet<Employee>list=new TreeSet<>();
		
		while(empNo>0){
			
			System.out.println("Enter Employee "+empNo+" Details: ");
			System.out.println("Enter the FirstName");
			String firstName=sc.next();
			System.out.println("Enter the LastName");
			String lastName=sc.next();
			System.out.println("Enter the Mobile");
			String mobile=sc.next();
			System.out.println("Enter the Email");
			String email=sc.next();
			System.out.println("Enter the Address");
			String address=sc.next();
			Employee e=new Employee(firstName,lastName,mobile,email,address);
			list.add(e);
			empNo--;
			
		}
		System.out.println("Employee List:");
		System.out.format("%-15s %-15s %-15s %-30s %15s\n","Firstname","Lastname","Mobile","Email","Address"); 
		
		for(Employee e:list){
			
			System.out.println();
			System.out.format("%-15s %-15s %-15s %-30s %15s\n",e.firstName,e.lastName,e.mobileNumber,e.email,e.address); 
			 
		}
	}

}
