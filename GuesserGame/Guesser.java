import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	//Guesser Class
	
	public int guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guesser guess a number");	
		guessNum = sc.nextInt();
		
		
		return guessNum;
	}
}