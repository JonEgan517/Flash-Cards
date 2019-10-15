import java.util.Scanner;
import java.util.ArrayList;

public class ChoosingQuestion 
{
	public static void choosing(ArrayList <FlashCard> trivia, ArrayList <FlashCard> math)
	{
		Scanner intInput = new Scanner(System.in);
		int chooseQuestions = intInput.nextInt();
		System.out.println("What flahscards do you want to study first?\n1. Trivia\n2. Math");
		
		if(chooseQuestions == 1)
		{
			System.out.println(TriviaData.trivia.get(0).getQuestion());
		}
		
		else if(chooseQuestions == 2)
		{
			System.out.println(MathData.math.get(0).getQuestion());
		}
	}
}
