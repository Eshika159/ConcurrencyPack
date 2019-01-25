import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		TestList t=new TestList();
		
		while(true){
		
		System.out.println("1. Insert \n2. Search \n3. Delete \n4. Display \n5. Exit \nEnter your choice ");
		
		Scanner sc=new Scanner(System.in);
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:t.insert();
				break;
		case 2:t.search();
				break;
				
		case 3:t.delete();
				break;
		case 4:t.display();
				break;
		case 5:t.Exit();
				break;
		default:System.out.println("Enter valid option");
		
		
		}
		
		
		}	
	}
}
