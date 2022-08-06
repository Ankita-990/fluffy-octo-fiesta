import java.util.Scanner;

class Player
{
	int guessNum;
	
	//Player Class
	
	public int guessNumber()
	{
		Scanner sc = new Scanner(System.in);
		
		guessNum = sc.nextInt();		
		
		return guessNum;
		
	}
}