import java.util.ArrayList;

public class MathData 
{
	static ArrayList<FlashCard> math = new ArrayList<FlashCard>();
	public static void loadMath()
	{
		math.add(new FlashCard("What is 12 * 12", "144"));
		math.add(new FlashCard("What is 2 + 2", "4"));
		math.add(new FlashCard("What is 24 / 2", "12"));
	}
}
