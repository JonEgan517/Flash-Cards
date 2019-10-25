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
		System.out.println("What flahscards do you want to study first?\n1. Trivia\n2. Math\n");
		int chooseQuestions = intInput.nextInt();
		
		
		if(chooseQuestions == 1)
		{
			ChoosingQuestion.pickRandomTrivia();
			ChoosingQuestion.choosingTrivia();
		}
		
		else if(chooseQuestions == 2)
		{
			ChoosingQuestion.pickRandomMath();
			ChoosingQuestion.choosingMath();
		}
	}
}
