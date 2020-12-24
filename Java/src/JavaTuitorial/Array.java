package JavaTuitorial;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int score[];
		
		int [] score=new int[5];
		score[0]=5;
		score[1]=7;
		score[2]=9;
		score[3]=1;
		score[4]=5;
		
		System.out.println("The value at 1st position is  " + score[0]);
		
		int s1=score[0];
		
		
		System.out.println("The value at 1st position is  " + s1);
		
		int length =score.length;
		
		System.out.println("The length of an array is  " + length);
		
		double []runs= new double[5];
		
		runs[0]=53;
		runs[1]=53;
		runs[2]=53;
		runs[3]=53;
		runs[4]=53;
		int i;
		
		for (i=0;i<length;i++)
		{
		System.out.println("The value at postion " +i + " of an array  is " +score[i]);
		}
		
		
		
	}

}
