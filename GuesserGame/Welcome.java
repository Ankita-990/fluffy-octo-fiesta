
import java.util.Scanner;

public class Welcome 
{
	char select;
	
	
	//Welcome Page
	
	public void welcomePage()
	{
		
		Umpire ump = new Umpire();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Guesser Game");
		
		while(true)
		{
			System.out.println("Press 'p' to play");
			System.out.println("Press 'h' for help");
			System.out.println("Press 'q' to quit");

			
			select = sc.next().charAt(0);
			
			System.out.println();
			System.out.println("******************************** \n");
			
			if(!(select == 'p' || select == 'h' || select == 'q'))
				System.out.println("Invalid option");
			else
			{
				
				switch(select)
				{
				case 'p':
					ump.takeNumberFromGuesser();
					ump.takeNumberFromPlayer();
					ump.compare();
					break;
					
				case 'h':
					System.out.println("1. In this Game there are 3 players, 1 Guesser, and 1 Empire");
					System.out.println("2. Guesser will give 1 random number to Empire");
					System.out.println("3. Each player have to guess number that Guesser guesses");
					System.out.println("4. The Player that guess the correct number wins the game");
					System.out.println("Note that: You cannot choose number greater than 10");
					break;
					
				case 'q':
					System.out.println("Thanks for playing the game");
					System.exit(0);
					
				}
			}
			
			System.out.println();
			
		}
		
		
		
	}
}
