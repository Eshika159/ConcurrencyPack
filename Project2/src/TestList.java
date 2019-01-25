import java.util.*;
 class TestList {
	private static List<String>l=new ArrayList<>();
	
	
	public  void insert()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the item to be inserted:");
		String s=sc.next();
		l.add(s);
		System.out.println("Inserted successfully");
		
	}
	public void Exit() {
		System.exit(0);
	}
	public  void display() {
		System.out.println("Items in the list are:");
		for(String s:l)
		{
			System.out.println(s);
		}
	}
	public void delete() {
		System.out.println("Enter the item to delete:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(l.contains(s))
			{
			l.remove(s);
			System.out.println("Item deleted succesfully");
			}
		else{
			System.out.println("Item does not exist");
		}
		
	}
	public  void search() {
		System.out.println("Enter the item to search");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(l.contains(s))
		System.out.println("Item found in the list");
		else
		System.out.println("Item not found in the list");
	}

}
