import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class ChoosingQuestion 
{
	public static void choosing(ArrayList <FlashCard> trivia, ArrayList <FlashCard> math)
	{
		Scanner intInput = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);
		
		System.out.println("What flahscards do you want to study first?\n1. Trivia\n2. Math\n");
		
		Random rand = new Random();
		int chooseQuestions = intInput.nextInt();
		int questionNumber = rand.nextInt(trivia.size());
		String answer;
		int counterCorrect = 0;
		int counterWrong = 0;
		
		
		if(chooseQuestions == 1)
		{	 
			System.out.println(trivia.get(questionNumber).getQuestion());
			for (int i = trivia.size() -1; i >= 0; i--)
			{
				answer = stringInput.nextLine();			
				
				if(answer.equals(trivia.get(questionNumber).getAnswer()))
				{
					counterCorrect = counterCorrect + 1;
					System.out.println("Number got correct: " + counterCorrect + "\n"); 
					trivia.remove(questionNumber);	
					
					if(trivia.isEmpty() == true)
					{
						System.out.println("You have answered all questions.");
					}
					
					else
					{
						System.out.println("That is correct. Here is a new question\n" + trivia.get(questionNumber).getQuestion());
					}	
				}
		
				else
				{
					if(counterWrong < 2)
					{
						System.out.println("That is incorrect, try again.\n");
						counterWrong = counterWrong + 1;
					}
					
					else
					{
						trivia.remove(questionNumber); 
						
						if(trivia.isEmpty() == true)
						{
							System.out.println("You have answered all questions.");
						}
						
						else
						{
							System.out.println("Again, that is incorrect. The correct answer is: " + trivia.get(questionNumber).getAnswer() + ".\n"
							+ "Here is a new question.\n" + trivia.get(questionNumber).getQuestion());
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
}
