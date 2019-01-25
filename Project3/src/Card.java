import java.util.HashSet;
import java.util.Scanner;


public class Card {
char symbol;
int number;
static HashSet<Card> h=new HashSet<>();
static int i=0;

public Card(char symbol, int number) {
	super();
	this.symbol = symbol;
	this.number = number;
}
public int hashCode()
{
	return (int)symbol;
}

public boolean equals(Object o)
{
	if(o instanceof Card && this.symbol==((Card)o).symbol)
		return true;
	
	return false;
}

public void main()
{
	
	while(h.size()!=4)
	{	Scanner sc=new Scanner(System.in); 
		System.out.println("Enter a card");
		char ch=sc.next().charAt(0);
		int num=sc.nextInt();
		Card c=new Card(ch,num);
		h.add(c);
		i++;
	}
	
	System.out.println("Four symbols gathered in "+i+" cards \n Cards in Set are:");

	for(Card cd:h)
	{
		System.out.println(cd.symbol+" "+cd.number);
	}
}


}
