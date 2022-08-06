
class Empire
{
	int guesserNum;
	int player1Num;
	int player2Num;
	int player3Num;
	int n = 10;
	
	
	//Take input from Guesser
	
	public void takeNumberFromGuesser()
	{
		Guesser g = new Guesser();
		
		//Calling guessNumber() method from Guesser class
		guesserNum = g.guessNumber();		
		
		while(!(guesserNum>0 && guesserNum<=n))
		{
			System.out.println("Please don't enter number greater than 10");
			guesserNum = g.guessNumber();
			
			if(guesserNum>0 && guesserNum<=n)
				break;
		}
		
		System.out.println();
		
	}
	
	
	//Take input from Players
	
	public void takeNumberFromPlayer()
	{
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		System.out.println("Player 1 guess number");
		
		//Calling guessNumber() method from Player Class
		
		player1Num = p1.guessNumber();
		while(!(player1Num>0 && player1Num<=10))
		{
			System.out.println("Please don't enter number greater than 10");
			System.out.println("Player 1 guess number");
			player1Num = p1.guessNumber();
			
			if(player1Num>0 && player1Num<=10)
				break;
		}
		
		System.out.println();
		
		
		System.out.println("Player 2 guess number");
		
		player2Num = p2.guessNumber();
		while(!(player2Num>0 && player2Num<=10))
		{
			System.out.println("Please don't enter number greater than 10");
			System.out.println("Player 2 guess number");
			player2Num = p2.guessNumber();
			
			if(player2Num>0 && player2Num<=10)
				break;
		}

		System.out.println();
		
		System.out.println("Player 3 guess number");
		
		player3Num = p3.guessNumber();
		while(!(player3Num>0 && player3Num<=10))
		{
			System.out.println("Please don't enter number greater than 10");
			System.out.println("Player 3 guess number");
			player3Num = p3.guessNumber();
			
			if(player3Num>0 && player3Num<=10)
				break;
		}
		
		System.out.println();
		
		
	}
	
	
	//Comparing players result with guesser
	
	public void compare()
	{
		
		if(guesserNum == player1Num)
		{
			if(guesserNum == player3Num && guesserNum == player2Num)
				System.out.println("Game tie");
			else if(guesserNum == player2Num)
				System.out.println("Player 1 & Player 2 win");
			else if(guesserNum == player3Num)
				System.out.println("Player 1 & Player 3 win");
			else
				System.out.println("Player 1 win");
		}
		
		else if(guesserNum == player2Num)
		{
			if(guesserNum == player3Num)
				System.out.println("Player 2 and Player 3 win");
			else
				System.out.println("Player 2 win");
		}
		
		else if(guesserNum == player3Num)
		{
			System.out.println("Player 3 win");
		}
		
		else
			System.out.println("Game Lost! Try Again");
		
	}	
}


