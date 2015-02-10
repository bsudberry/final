import java.util.Scanner;
public class Ai
	{
	static int computerMove;
	static int computerMove1;
	static String [] letters = {"A", "B", "C", "D", "E", "F"}; 
	public static void chooseRandomMove() throws InterruptedException
		{
		int computerMoveX = (int) (Math.random() * 6);
		System.out.println(letters[computerMoveX]);
		int computerMoveY = (int) (Math.random() *6);
		System.out.println(computerMoveY);
		System.err.println("The missle has been launched");
		}

	
	
	
	}