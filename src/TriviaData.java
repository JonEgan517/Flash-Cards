import java.util.ArrayList;

public class TriviaData 
{
	public static void triviaData()
	{
		FlashCardRunner.trivia = new ArrayList<FlashCard>();
		FlashCardRunner.trivia.add(new FlashCard("How many days are in a year?", "365"));
		FlashCardRunner.trivia.add(new FlashCard("Who is the first President of the United States?", "George Washington"));
		FlashCardRunner.trivia.add(new FlashCard("What is the capital of Colorado?", "Denver"));
	}
}
