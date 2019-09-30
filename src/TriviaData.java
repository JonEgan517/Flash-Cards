import java.util.ArrayList;

public class TriviaData 
{
	static ArrayList<FlashCard> trivia = new ArrayList<FlashCard>();
	public static void loadData()
	{
		trivia.add(new FlashCard("How many days are in a year", "365"));
		trivia.add(new FlashCard("What is 2 + 2", "4"));
		trivia.add(new FlashCard("What is the capital of Colorado", "Denver"));
	}
}
