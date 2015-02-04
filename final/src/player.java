import java.util.Scanner;


public class player
	{
	static Scanner userInput = new Scanner(System.in);
	public static void askNameToPlay()
		{
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello," + name + " would you like to play Battleship?");
		System.out.println(" (1) yes");
		System.out.println(" (2) No");
		int choice = userInput.nextInt();
		if (choice == 1)
			{
			System.out.println("Okay lets play!");
			}
		else if (choice == 2) 
			{
			System.out.println("Ok, maybe later");
			System.exit(0);
			}

		}
	public static void whichBoard()
		{
		int boardChoice=0;
		System.out.println("Which board would you like to use to play?");
		System.out.println(" (1) Board 1");
		System.out.println(" (2) Board 2");
		System.out.println(" (3) Board 3");
		System.out.println(" (4) Board 4");
		int choice = userInput.nextInt();
		if (choice == 1)
			{
			System.out.println("Okay your using board 1");
			boardChoice=1;
			}
		else if (choice == 2) 
			{
			System.out.println("Okay your using board 2");
			boardChoice=2;
			}
		else if (choice == 3) 
			{
			System.out.println("Okay your using board 3");
			boardChoice=3;
			}
		else if (choice == 4) 
			{
			System.out.println("Okay your using board 4");
			boardChoice=4;
			}
		else
			{
			System.out.println("Not valid try again!!");
			whichBoard();
			}
		startGame(boardChoice);
		}
public static void startGame(int gameBoard)
	{
	
	}

	}
