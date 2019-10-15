import java.util.ArrayList;

public class FlashCardRunner 
{
	public static void main(String[] args) 
	{
		TriviaData.loadTrivia();
		MathData.loadMath();
		ChoosingQuestion.choosing(trivia,math);
	}
}
