import java.util.ArrayList;

public class FlashCardRunner 
{
	public static void main(String[] args) 
	{
		ArrayList<FlashCard> trivia = new ArrayList<FlashCard>();
		trivia.add(new FlashCard("How many days are in a year?", "365"));
		trivia.add(new FlashCard("Who is the first President of the United States?", "George Washington"));
		trivia.add(new FlashCard("What is the capital of Colorado?", "Denver"));
		
		ArrayList<FlashCard> math = new ArrayList<FlashCard>();
		math.add(new FlashCard("What is 12 * 12?", "144"));
		math.add(new FlashCard("What is 2 + 2?", "4"));
		math.add(new FlashCard("What is 24 / 2?", "12"));

		ChoosingQuestion.choosing(trivia,math);
	}
}
