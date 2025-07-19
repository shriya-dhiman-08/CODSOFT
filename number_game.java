//number game
import java.util.Random;
import java.util.Scanner;
public class number_game{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		
		int total_games=0;
		int totalAttempts=0;
		int score=0;
		
		final int max_attempts=8;
		String playagain;
		
		do{
			int random_Number=rd.nextInt(100)+1;
			int guess;
			int attempt=0;
			boolean guessedCorrectly=false;
			
			System.out.println("Guess the number between (1-100)");
			System.out.println("You have maximum "+max_attempts+" attempts");
			
			while(attempt<max_attempts)
			{
				System.out.print("Enter your guess:");
				guess=sc.nextInt();
				attempt++;
				
				if(guess==random_Number)
				{
					System.out.println("You have guessed the Right number");
					guessedCorrectly=true;
					break;
				}
				else if(guess<random_Number)
				{
					System.out.println("Guessed Number is LOW, Try Again!");
				}
				else if(guess>random_Number)
				{
					System.out.println("Guessed Number is HIGH, Try Again!");
				}
				
				System.out.println("Attempts left "+(max_attempts-attempt));
			}
			if(!guessedCorrectly)
			{
				System.out.println("You have used all the attempts, Random Number is "+random_Number);
			}
			else{
				score++;
			}
			
			total_games++;
			totalAttempts+=attempt;
			
			System.out.println("Do you want to play again(yes/no)?");
			sc.nextLine();
			playagain=sc.nextLine().toLowerCase();
		}
		while(playagain.equals("yes"));
		
		System.out.println("Thanks for playing");
		System.out.println("Games played "+total_games);
		System.out.println("Total Attempts "+totalAttempts);
		System.out.println("Your score is "+score+"/"+total_games);
		
	}
}