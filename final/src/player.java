import java.util.Scanner; 

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class player
	{  
	static String name; 
	static int choiceName;
	static int playOrNo;
	static JFrame frame = new JFrame();
	static Scanner userInput = new Scanner(System.in);
	private static final long serialVersionUID = 1L;
	public static void askNameToPlay()
		{ 
		name = JOptionPane.showInputDialog("What is your name?");  
		JOptionPane.showMessageDialog(frame, "Hi, " + name);
		Object[] options = {"Yes", "No"};
		playOrNo = JOptionPane.showOptionDialog(frame, "Would you like to play Battleship?",
				"Yes or No",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		switch(playOrNo)
		{
		case 0:
			{
			JOptionPane.showMessageDialog(frame, "Ok, lets play Battleship!");
			break;
			}
		case 1:
		
			{
			JOptionPane.showMessageDialog(frame, "Ah, you don't.");
			System.exit(0);
			break;
			}
		}

		}
	public static void whichBoard() throws InterruptedException
		{
		Object[] choice = {"Board 1", "Board 2", "Board 3", "Board 4" };
		choiceName = JOptionPane.showOptionDialog(frame, "Which board would you like to use?",
				"Option",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, choice, choice[3]);
		if (choiceName==0)
			{
			System.out.println("Okay you're using board 1");
			startGame(chooseBoard(1),1);
			}
		else if (choiceName==1)
			{
			System.out.println("Okay you're using board 2");
			startGame(chooseBoard(2),2);
			}
		else if (choiceName==2)
			{
			System.out.println("Okay you're using board 3");
			startGame(chooseBoard(3),3);
			}
		else if (choiceName==3)
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
