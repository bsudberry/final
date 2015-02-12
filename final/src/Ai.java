import java.util.Scanner; 
public class Ai
	{
	static int computerMove;
	static int computerMove1;
	static int X;
	static int Y;
	static String [] letters = {"A", "B", "C", "D", "E", "F"}; 
	public static void chooseRandomMove(String [][]gameBoard) throws InterruptedException
		{
		//This class generates a random number for the X and Y coordinates and prints the numbers
		int computerMoveX = (int) (Math.random() * 6);
		int computerMoveY = (int) (Math.random() *6);
		checkMove(gameBoard, computerMoveX, computerMoveY);
		System.out.println("The missle has been launched at " +letters[computerMoveX]+ " " +(computerMoveY+1));
		}
	
	public static void checkMove(String [][]gameBoard, int X, int Y) throws InterruptedException
		{
			if("X".equals(gameBoard[X][Y]))
				{
				gameBoard[X][Y]= "H";
				}

			else if(gameBoard[X][Y].equals(" "))
					{
					gameBoard[X][Y] = "M";
					}
			else
				{
				chooseRandomMove(gameBoard);
				}
		}
	public static void checkForX(String [][]gameBoard)
			{
			int counter=0;
			for(int i=0; i<6;i++)
				{
				for(int z=0; z<6; z++)
					{
					if(gameBoard[i]
					[z].equals("X"))
						{
						return;
						}
					else if (counter ==36 || !gameBoard[i][z].equals("X"))
						{
						System.out.println("Game Over!");
						System.exit(0);
						}
					}
				}
			
			}
	}
