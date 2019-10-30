import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FlashCardRunner 
{
	static ArrayList<FlashCard> trivia;
	static ArrayList<FlashCard> math; 
	
	public static void main(String[] args) 
	{
		TriviaData.triviaData();
		MathData.mathData();
		
		Scanner intInput = new Scanner(System.in);
		Scanner stringInput = new Scanner (System.in);
		int chooseQuestions = 0;
		String wouldYouLikeToAddQuestion;
		
		
		System.out.println("What flahscards do you want to study first?\n1. Trivia\n2. Math\n");
		chooseQuestions = intInput.nextInt();
		
		if(chooseQuestions == 1)
		{
			System.out.println("Would you like to add a question to trivia? Enter Yes or No.\n");
			wouldYouLikeToAddQuestion= stringInput.nextLine();
			
			if(wouldYouLikeToAddQuestion.equals("Yes") || wouldYouLikeToAddQuestion.equals("yes"))
			{
				ChoosingQuestion.addQuestionTrivia();
				ChoosingQuestion.pickRandomTrivia();
				ChoosingQuestion.choosingTrivia();
			}
			
			else if(wouldYouLikeToAddQuestion.equals("No") || wouldYouLikeToAddQuestion.equals("no"))
			{
				ChoosingQuestion.pickRandomTrivia();
				ChoosingQuestion.choosingTrivia();
			}
		}
		
		else if(chooseQuestions == 2)
		{
			System.out.println("Would you like to add a question to trivia? Enter Yes or No.\n");
			wouldYouLikeToAddQuestion= stringInput.nextLine();
			
			if(wouldYouLikeToAddQuestion.equals("Yes") || wouldYouLikeToAddQuestion.equals("yes"))
			{	
				ChoosingQuestion.addQuestionMath();
				ChoosingQuestion.pickRandomMath();
				ChoosingQuestion.choosingMath();
			}
			
			else if(wouldYouLikeToAddQuestion.equals("No") || wouldYouLikeToAddQuestion.equals("no"))
			{
				ChoosingQuestion.pickRandomMath();
				ChoosingQuestion.choosingMath();
			}
		}
	}
}
