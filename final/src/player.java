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
	public static void whichBoard() throws InterruptedException
		{
		System.out.println("Which board would you like to use to play?");
		System.out.println(" (1) Board 1");
		System.out.println(" (2) Board 2");
		System.out.println(" (3) Board 3");
		System.out.println(" (4) Board 4");
		int choice = userInput.nextInt();
		if (choice == 1)
			{
			System.out.println("Okay you're using board 1");
			startGame(chooseBoard(1),1);
			}
		else if (choice == 2) 
			{
			System.out.println("Okay you're using board 2");
			startGame(chooseBoard(2),2);
			}
		else if (choice == 3) 
			{
			System.out.println("Okay you're using board 3");
			startGame(chooseBoard(3),3);
			}
		else if (choice == 4) 
			{ 
			System.out.println("Okay you're using board 4");
			startGame(chooseBoard(4),4);
			}
		else 
			{
			System.out.println("Not valid try again!!");
			whichBoard();
			}
				}
public static void startGame(String [][]gameBoard, int s) throws InterruptedException
	{
	while (1==1)
		{
				Ai.checkForX(gameBoard);
				Ai.chooseRandomMove(gameBoard);
				showBoard(gameBoard); 
				Thread.sleep(4000);
				}
	}

public static String [][] chooseBoard(int s)
	{
	switch(s)
		{
		case 1:
			{
			return board.board1; 
			}
		case 2:
			{
			return board.board2; 
			}
		case 3:
			{
			return board.board3; 
			}
		case 4:
			{
			return board.board4; 
			}
		default:
			{
			return board.board1; 
			}
		}
	}

public static void showBoard(String [][] x)
	{
	System.out.println("    1   2   3   4   5   6");
	System.out.println(" ---------------------------");
	System.out.println("A | " + x[0][0] + " | "  + x[0][1] + " | " + x[0][2] + " | " + x[0][3] + " | " + x[0][4] + " | "+ x[0][5] + " | ");
	System.out.println(" ---------------------------");
	System.out.println("B | " + x[1][0] + " | "  + x[1][1] + " | " + x[1][2] + " | " + x[1][3] + " | " + x[1][4] + " | "+ x[1][5] + " | " ); 	
	System.out.println(" ---------------------------");
	System.out.println("C | " + x[2][0] + " | "  + x[2][1] + " | " + x[2][2] + " | " + x[2][3] + " | " + x[2][4] + " | "+ x[2][5] + " | ");
	System.out.println(" ---------------------------");
	System.out.println("D | " + x[3][0] + " | "  + x[3][1] + " | " + x[3][2] + " | " + x[3][3] + " | " + x[3][4] + " | "+ x[3][5] + " | ");
	System.out.println(" ---------------------------");
	System.out.println("E | " + x[4][0] + " | "  + x[4][1] + " | " + x[4][2] + " | " + x[4][3] + " | " + x[4][4] + " | "+ x[4][5] + " | "); 	
	System.out.println(" ---------------------------");
	System.out.println("F | " + x[5][0] + " | "  + x[5][1] + " | " + x[5][2] + " | " + x[5][3] + " | " + x[5][4] + " | "+ x[5][5] + " | " );
	System.out.println(" ---------------------------");
	System.out.println("");
	}
 
	}
