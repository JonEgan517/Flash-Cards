import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class ChoosingQuestion 
{
	public static void choosing(ArrayList <FlashCard> trivia, ArrayList <FlashCard> math, int questionNumber)
	{
		Scanner intInput = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);
		
		
		System.out.println("What flahscards do you want to study first?\n1. Trivia\n2. Math\n");
		
		int chooseQuestions = intInput.nextInt();
		String answer;
		int counterCorrect = 0;
		int counterWrong = 1;
		
		
		if(chooseQuestions == 1)
		{	 
			System.out.println(trivia.get(questionNumber).getQuestion());
			for (int i = trivia.size(); i > 0; i--)
			{
				
				answer = stringInput.nextLine();			
				
				if(answer.equals(trivia.get(questionNumber).getAnswer()))
				{
					counterCorrect = counterCorrect + 1;
					System.out.println("Number got correct: " + counterCorrect + "\n"); 	
					trivia.remove(questionNumber);
					
					if(trivia.isEmpty() == true)
					{	
						System.out.println("You have answered all of the questions.");
					}
					
					else
					{
						System.out.println("That is correct. Here is a new question\n" + trivia.get(questionNumber).getQuestion());
					}	
				}
		
				else
				{
					if(counterWrong < 3)
					{
						System.out.println("That is incorrect, try again.\n");
						counterWrong = counterWrong + 1;
					}
					
					else
					{ 	
						
						if(trivia.isEmpty() == true)
						{
							trivia.remove(questionNumber);
							System.out.println("You have answered all of the questions.");
						}
						
						else
						{
							System.out.println("Again, that is incorrect. The correct answer is: " 
							+ trivia.get(questionNumber).getAnswer()+ ".\n");
							trivia.remove(questionNumber);
							System.out.println("Here is a new question.\n" + trivia.get(questionNumber).getQuestion());
							
						}	
					}
				}
			}
		}
		
		else if(chooseQuestions == 2)
		{
			System.out.println(math.get(questionNumber).getQuestion());
			answer = stringInput.nextLine();			
			
			if(answer.equals(math.get(questionNumber).getAnswer()))
			{
				System.out.println("That is correct.");
			}
			else
			{
				System.out.println("That is incorrect. The correct answer is: " + math.get(questionNumber).getAnswer() + ".\n");
			}
		}
	}

	public static void pickRandom(int questionNumber, ArrayList <FlashCard> trivia, ArrayList <FlashCard> math) 
	{
		if(questionNumber >= trivia.size())
		{
			pickRandom();
		}
		
	}

	public static int pickRandom() 
	{
		return (0);  	
	}
}
