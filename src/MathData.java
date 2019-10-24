import java.util.ArrayList;

public class MathData 
{
	public static void mathData()
	{
		FlashCardRunner.math = new ArrayList<FlashCard>();
		FlashCardRunner.math.add(new FlashCard("What is 12 * 12?", "144"));
		FlashCardRunner.math.add(new FlashCard("What is 2 + 2?", "4"));
		FlashCardRunner.math.add(new FlashCard("What is 24 / 2?", "12"));
	}
}
