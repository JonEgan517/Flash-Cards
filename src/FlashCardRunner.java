
public class FlashCardRunner 
{
	public static void main(String[] args) 
	{
		TriviaData.loadData();
		System.out.println(TriviaData.trivia.get(0).getQuestion());
	}
}
