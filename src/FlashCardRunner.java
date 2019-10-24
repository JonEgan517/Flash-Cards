import java.util.ArrayList;
import java.util.Random;

public class FlashCardRunner 
{
	static ArrayList<FlashCard> trivia;
	static ArrayList<FlashCard> math; 
	public static void main(String[] args) 
	{
		trivia = new ArrayList<FlashCard>();
		trivia.add(new FlashCard("How many days are in a year?", "365"));
		trivia.add(new FlashCard("Who is the first President of the United States?", "George Washington"));
		trivia.add(new FlashCard("What is the capital of Colorado?", "Denver"));
		
		math = new ArrayList<FlashCard>();
		math.add(new FlashCard("What is 12 * 12?", "144"));
		math.add(new FlashCard("What is 2 + 2?", "4"));
		math.add(new FlashCard("What is 24 / 2?", "12"));
		
		ChoosingQuestion.pickRandom();
		ChoosingQuestion.choosing();
	}
}
