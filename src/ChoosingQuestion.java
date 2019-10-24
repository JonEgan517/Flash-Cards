import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class ChoosingQuestion 
{
	static int questionNumber;
	
	public static void choosing()
	{
		Scanner intInput = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);
		
		
		System.out.println("What flahscards do you want to study first?\n1. Trivia\n2. Math\n");
		questionNumber = pickRandom();
		int chooseQuestions = intInput.nextInt();
		String answer;
		int counterCorrect = 0;
		int counterWrong = 1;
		
		
		if(chooseQuestions == 1)
		{	 
			System.out.println(FlashCardRunner.trivia.get(questionNumber).getQuestion());
			
			for (int i = FlashCardRunner.trivia.size(); i > 0; i--)
			{
				
				answer = stringInput.nextLine();			
				
				if(answer.equals(FlashCardRunner.trivia.get(questionNumber).getAnswer()))
				{
					counterCorrect = counterCorrect + 1;
					System.out.println("Number got correct: " + counterCorrect + "\n"); 	
					FlashCardRunner.trivia.remove(questionNumber);
					
					if(FlashCardRunner.trivia.isEmpty() == true)
					{	
						System.out.println("You have answered all of the questions.");
					}
					
					else
					{
						pickRandom();
						System.out.println("That is correct. Here is a new question\n" + FlashCardRunner.trivia.get(questionNumber).getQuestion());
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
						
						if(FlashCardRunner.trivia.isEmpty() == true)
						{
							FlashCardRunner.trivia.remove(questionNumber);
							System.out.println("You have answered all of the questions.");
						}
						
						else
						{
							System.out.println("Again, that is incorrect. The correct answer is: " 
							+ FlashCardRunner.trivia.get(questionNumber).getAnswer()+ ".\n");
							FlashCardRunner.trivia.remove(questionNumber);
							System.out.println("Here is a new question.\n" + FlashCardRunner.trivia.get(questionNumber).getQuestion());
							
						}	
					}
				}
			}
		}
		
		else if(chooseQuestions == 2)
		{
			System.out.println(FlashCardRunner.math.get(questionNumber).getQuestion());
			answer = stringInput.nextLine();			
			
			if(answer.equals(FlashCardRunner.math.get(questionNumber).getAnswer()))
			{
				System.out.println("That is correct.");
			}
			else
			{
				System.out.println("That is incorrect. The correct answer is: " + FlashCardRunner.math.get(questionNumber).getAnswer() + ".\n");
			}
		}
	}

	public static int pickRandom() 
	{
		questionNumber = (int)(Math.random()*(FlashCardRunner.trivia.size()));
		if(questionNumber >= FlashCardRunner.trivia.size())
		{
			pickRandom();
		}
		return (questionNumber);
	}
}
