package JavaTuitorial;

public class DisplayingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		double b = 20.3;
		double c= 3.14785; 
		
		System.out.println("The value of a is " +a);

		System.out.println("The value of b is " +b);
 
		System.out.println("The value of c is " +c);
		
		
		if(a > b)
		{
			System.out.println("The value of a is greater than b ");
		}
		
		//if (a==b)
		//	System.out.println("The value of a is equal to b");
		else if  ( a==b)
			System.out.println("The value of b is equal to a");
		
		else
			System.out.println("The value of b is greater than a ");
		
	}

}
