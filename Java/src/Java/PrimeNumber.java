package Java;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		boolean check=true;
		int number;
		
		while(true)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Enter number :");
			number =input.nextInt();
		
			for(int i = 2; number/2 >= i; i++)
			{
				if(number%i == 0)
				{
					check = false;
					break;
				}
			}
		
			if(check==true)	
				System.out.println("Prime number.");
			
			else
				System.out.println("Not prime number.");
		
		}
	}
}
