import java.util.Scanner;
public class Ai
	{
	static int computerMove;
	static int computerMove1;
	static String [] letters = {"A", "B", "C", "D", "E", "F"}; 
	public static void chooseRandomMove(String [][]gameBoard) throws InterruptedException
		{
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
			
			board.board1 = gameBoard; 
			}
	public static void checkForX()
			{
			for(int i=0; i<6; i++)
				{
				
				}
			}
	}
