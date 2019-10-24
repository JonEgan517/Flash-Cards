import java.util.ArrayList;
import java.util.Random;

public class FlashCardRunner 
{
	static ArrayList<FlashCard> trivia;
	static ArrayList<FlashCard> math; 
	
	public static void main(String[] args) 
	{
		TriviaData.triviaData();
		MathData.mathData();
		ChoosingQuestion.pickRandom();
		ChoosingQuestion.choosing();
	}
}
