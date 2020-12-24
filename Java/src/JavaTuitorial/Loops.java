package JavaTuitorial;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for loop
		
		for(int i=0; i<10;i++) {
			
			System.out.println("value is  i " +i);
			if (i==5)
				break;
		}
		
		
		// while loop
		
		int a=0;
	
		while(a<10) {
			
			System.out.println("value is  a " +a);
			a++;
		//	if (a==7)
		//		continue;
			
		}
		
	//	Do while loop
	
		//int b =0;
		
		int b=0;
		do {
			 b++;
			
			System.out.println("value is b " +b);
		}while(b<10);
		

	}

}
