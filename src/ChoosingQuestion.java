import java.util.Scanner;


public class ChoosingQuestion 
{
	static int questionNumber;
	static String answer;
	static int counterCorrect = 0;
	static int counterWrong = 0;
	static Scanner stringInput = new Scanner(System.in);
	
	public static void choosingTrivia()
	{
		questionNumber = pickRandomTrivia();
		System.out.println(FlashCardRunner.trivia.get(questionNumber).getQuestion());
			
		while(FlashCardRunner.trivia.size()>0)
		{
			answer = stringInput.nextLine();			
				
			if(answer.equals(FlashCardRunner.trivia.get(questionNumber).getAnswer()))
			{
				counterCorrect = counterCorrect + 1;
				System.out.println("Number got correct: " + counterCorrect + "\n"); 	
				FlashCardRunner.trivia.remove(questionNumber);
					
				if(FlashCardRunner.trivia.isEmpty() == true)
				{	
					System.out.println("You have answered all of the questions.");
				}
					
				else
				{
					pickRandomTrivia();
					System.out.println("That is correct. Here is a new question\n" + FlashCardRunner.trivia.get(questionNumber).getQuestion());
				}	
			}
		
			else
			{
				if(counterWrong < 2)
				{
					System.out.println("That is incorrect, try again.\n");
					counterWrong = counterWrong + 1;
				}
					
				else
				{ 	
						
					if(FlashCardRunner.trivia.isEmpty() == true)
					{
						FlashCardRunner.trivia.remove(questionNumber);
						System.out.println("You have answered all of the questions.");
					}
						
					else
					{
						System.out.println("Again, that is incorrect. The correct answer is: "
						+ FlashCardRunner.trivia.get(questionNumber).getAnswer()+ ".\n");
						FlashCardRunner.trivia.remove(questionNumber);
						pickRandomTrivia();
						counterWrong = 0;
						System.out.println("Here is a new question.\n" + FlashCardRunner.trivia.get(questionNumber).getQuestion());
					}	
				}
			}
		}
	}
	
	public static void choosingMath()
	{
		questionNumber = pickRandomMath();
		System.out.println(FlashCardRunner.math.get(questionNumber).getQuestion());
			
		while(FlashCardRunner.math.size()>0)
		{
			answer = stringInput.nextLine();			
				
			if(answer.equals(FlashCardRunner.math.get(questionNumber).getAnswer()))
			{
				counterCorrect = counterCorrect + 1;
				System.out.println("Number got correct: " + counterCorrect + "\n"); 	
				FlashCardRunner.math.remove(questionNumber);
					
				if(FlashCardRunner.math.isEmpty() == true)
				{	
					System.out.println("You have answered all of the questions.");
				}
					
				else
				{
					pickRandomMath();
					System.out.println("That is correct. Here is a new question\n" + FlashCardRunner.math.get(questionNumber).getQuestion());
				}	
			}
		
			else
			{
				if(counterWrong < 2)
				{
					System.out.println("That is incorrect, try again.\n");
					counterWrong = counterWrong + 1;
				}
					
				else
				{ 		
					if(FlashCardRunner.math.isEmpty() == false)
					{
						System.out.println("Again, that is incorrect. The correct answer is: "
						+ FlashCardRunner.math.get(questionNumber).getAnswer()+ ".\n");
						FlashCardRunner.math.remove(questionNumber);
						pickRandomMath();
						counterWrong = 0;
						System.out.println("Here is a new question.\n" + FlashCardRunner.math.get(questionNumber).getQuestion());	
					}
						
					else
					{
						FlashCardRunner.math.remove(questionNumber);
						System.out.println("You have answered all of the questions.");
					}	
				}
			}
		}
	}
	
	public static void addQuestionTrivia() 
	{
		Scanner intInput = new Scanner (System.in);
		System.out.println("How many questions are you going to add to trivia?\n");
		int numberOfQuestions = intInput.nextInt();
		
		for (int i = 0; i < numberOfQuestions; i++) 
		{
			Scanner stringInput = new Scanner(System.in);
			
			System.out.println("Please enter a trvia question.\n");
            String addingQuestion = (stringInput.nextLine());

            System.out.println("Please enter the answer.\n");
            String addingAnswer = (stringInput.nextLine());
            
            FlashCardRunner.trivia.add(new FlashCard(addingQuestion, addingAnswer));
        }
		
		
	}
	
	public static void addQuestionMath() 
	{
		Scanner intInput = new Scanner (System.in);
		System.out.println("How many questions are you going to add to math?\n");
		int numberOfQuestions = intInput.nextInt();
		
		for (int i = 0; i < numberOfQuestions; i++) 
		{
			Scanner stringInput = new Scanner(System.in);
			
			System.out.println("Please enter a math question.\n");
            String addingQuestion = (stringInput.nextLine());

            System.out.println("Please enter the answer.\n");
            String addingAnswer = (stringInput.nextLine());
            
            FlashCardRunner.math.add(new FlashCard(addingQuestion, addingAnswer));
        }
	}
	
	public static int pickRandomTrivia() 
	{
		questionNumber = (int)(Math.random()*(FlashCardRunner.trivia.size()));
		
		if(questionNumber >= FlashCardRunner.trivia.size())
		{
			pickRandomTrivia();
		}
		
		return (questionNumber);
	}
	
	public static int pickRandomMath()
	{
		questionNumber = (int)(Math.random()*(FlashCardRunner.math.size()));
		
		if(questionNumber >= FlashCardRunner.math.size())
		{
			pickRandomMath();
		}
		
		return (questionNumber);
	}
}
