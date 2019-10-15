import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


public class ChoosingQuestion 
{
	public static void choosing(ArrayList <FlashCard> trivia, ArrayList <FlashCard> math)
	{
		Scanner intInput = new Scanner(System.in);

		System.out.println("What flahscards do you want to study first?\n1. Trivia\n2. Math");
		int chooseQuestions = intInput.nextInt();
		Random rand = new Random();
		
		for(FlashCard triviaQuestion : trivia)
		{
			if(chooseQuestions == 1)
			{	 
		        System.out.println(trivia.get(rand.nextInt(trivia.size()))); 
			}
		}
		
		for(FlashCard mathQuestion : math)
		{
			if(chooseQuestions == 2)
			{
				System.out.println(mathQuestion.getQuestion());
			}
		}
	}
}
