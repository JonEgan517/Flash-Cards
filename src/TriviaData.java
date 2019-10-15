import java.util.ArrayList;

public class TriviaData 
{
	static ArrayList<FlashCard> trivia = new ArrayList<FlashCard>();
	public static void loadTrivia()
	{
		trivia.add(new FlashCard("How many days are in a year", "365"));
		trivia.add(new FlashCard("Who is the first President of the United States.", "George Washington"));
		trivia.add(new FlashCard("What is the capital of Colorado", "Denver"));
	}
}
