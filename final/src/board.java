
public class board
	{
	public static String [][] board1=new String [6][6];
	public static String [][] board2=new String [6][6];
	public static String [][] board3=new String [6][6];
	public static String [][] board4=new String [6][6];
	static String pawn;
	public static void createBoard()
		{
			{
			for(int i=0;i<6;i++)
				{
				for(int j=0;j<6;j++)
					{
					board1 [i][j]= " ";
					board2 [i][j]= " ";
					board3 [i][j]= " ";
					board4 [i][j]= " ";
					}
				}
			}
		}
	public static void displayBoard1()
		{
			{
			board1[0][0]="X";
			board1[0][1]="X";
			board1[0][2]="X";
			board1[0][3]="X";
			board1[0][4]="X";
			board1[2][5]="X";
			board1[3][5]="X";
			board1[4][5]="X";
			board1[5][5]="X";
			board1[2][1]="X";
			board1[2][2]="X";
			board1[2][3]="X";
			board1[3][0]="X";
			board1[4][0]="X";
			board1[5][3]="X";
			}
		System.out.println("    1   2   3   4   5   6");
		System.out.println(" ---------------------------");
		System.out.println("A | " + board1[0][0] + " | "  + board1[0][1] + " | " + board1[0][2] + " | " + board1[0][3] + " | " + board1[0][4] + " | "+ board1[0][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("B | " + board1[1][0] + " | "  + board1[1][1] + " | " + board1[1][2] + " | " + board1[1][3] + " | " + board1[1][4] + " | "+ board1[1][5] + " | " ); 	
		System.out.println(" ---------------------------");
		System.out.println("C | " + board1[2][0] + " | "  + board1[2][1] + " | " + board1[2][2] + " | " + board1[2][3] + " | " + board1[2][4] + " | "+ board1[2][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("D | " + board1[3][0] + " | "  + board1[3][1] + " | " + board1[3][2] + " | " + board1[3][3] + " | " + board1[3][4] + " | "+ board1[3][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("E | " + board1[4][0] + " | "  + board1[4][1] + " | " + board1[4][2] + " | " + board1[4][3] + " | " + board1[4][4] + " | "+ board1[4][5] + " | "); 	
		System.out.println(" ---------------------------");
		System.out.println("F | " + board1[5][0] + " | "  + board1[5][1] + " | " + board1[5][2] + " | " + board1[5][3] + " | " + board1[5][4] + " | "+ board1[5][5] + " | " );
		System.out.println(" ---------------------------");
		System.out.println("");
		}
	public static void displayBoard2()
		{
			{
			board2[0][5]="X";
			board2[1][5]="X";
			board2[2][5]="X";
			board2[3][5]="X";
			board2[4][5]="X";
			board2[5][0]="X";
			board2[5][1]="X";
			board2[5][2]="X";
			board2[5][3]="X";
			board2[0][3]="X";
			board2[1][3]="X";
			board2[2][3]="X";
			board2[0][0]="X";
			board2[1][0]="X";
			board2[3][2]="X";
			}
		System.out.println("    1   2   3   4   5   6");
		System.out.println(" ---------------------------");
		System.out.println("A | " + board2[0][0] + " | "  + board2[0][1] + " | " + board2[0][2] + " | " + board2[0][3] + " | " + board2[0][4] + " | "+ board2[0][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("B | " + board2[1][0] + " | "  + board2[1][1] + " | " + board2[1][2] + " | " + board2[1][3] + " | " + board2[1][4] + " | "+ board2[1][5] + " | " ); 	
		System.out.println(" ---------------------------");
		System.out.println("C | " + board2[2][0] + " | "  + board2[2][1] + " | " + board2[2][2] + " | " + board2[2][3] + " | " + board2[2][4] + " | "+ board2[2][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("D | " + board2[3][0] + " | "  + board2[3][1] + " | " + board2[3][2] + " | " + board2[3][3] + " | " + board2[3][4] + " | "+ board2[3][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("E | " + board2[4][0] + " | "  + board2[4][1] + " | " + board2[4][2] + " | " + board2[4][3] + " | " + board2[4][4] + " | "+ board2[4][5] + " | "); 	
		System.out.println(" ---------------------------");
		System.out.println("F | " + board2[5][0] + " | "  + board2[5][1] + " | " + board2[5][2] + " | " + board2[5][3] + " | " + board2[5][4] + " | "+ board2[5][5] + " | " );
		System.out.println(" ---------------------------");
		System.out.println("");
		}
	public static void displayBoard3()
		{
		System.out.println("    1   2   3   4   5   6");
		System.out.println(" ---------------------------");
		System.out.println("A | " + board3[0][0] + " | "  + board3[0][1] + " | " + board3[0][2] + " | " + board3[0][3] + " | " + board3[0][4] + " | "+ board3[0][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("B | " + board3[1][0] + " | "  + board3[1][1] + " | " + board3[1][2] + " | " + board3[1][3] + " | " + board3[1][4] + " | "+ board3[1][5] + " | " ); 	
		System.out.println(" ---------------------------");
		System.out.println("C | " + board3[2][0] + " | "  + board3[2][1] + " | " + board3[2][2] + " | " + board3[2][3] + " | " + board3[2][4] + " | "+ board3[2][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("D | " + board3[3][0] + " | "  + board3[3][1] + " | " + board3[3][2] + " | " + board3[3][3] + " | " + board3[3][4] + " | "+ board3[3][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("E | " + board3[4][0] + " | "  + board3[4][1] + " | " + board3[4][2] + " | " + board3[4][3] + " | " + board3[4][4] + " | "+ board3[4][5] + " | "); 	
		System.out.println(" ---------------------------");
		System.out.println("F | " + board3[5][0] + " | "  + board3[5][1] + " | " + board3[5][2] + " | " + board3[5][3] + " | " + board3[5][4] + " | "+ board3[5][5] + " | " );
		System.out.println(" ---------------------------");
		System.out.println("");
		}
	public static void displayBoard4()
		{
		System.out.println("    1   2   3   4   5   6");
		System.out.println(" ---------------------------");
		System.out.println("A | " + board[0][0] + " | "  + board[0][1] + " | " + board[0][2] + " | " + board[0][3] + " | " + board[0][4] + " | "+ board[0][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("B | " + board[1][0] + " | "  + board[1][1] + " | " + board[1][2] + " | " + board[1][3] + " | " + board[1][4] + " | "+ board[1][5] + " | " ); 	
		System.out.println(" ---------------------------");
		System.out.println("C | " + board[2][0] + " | "  + board[2][1] + " | " + board[2][2] + " | " + board[2][3] + " | " + board[2][4] + " | "+ board[2][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("D | " + board[3][0] + " | "  + board[3][1] + " | " + board[3][2] + " | " + board[3][3] + " | " + board[3][4] + " | "+ board[3][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("E | " + board[4][0] + " | "  + board[4][1] + " | " + board[4][2] + " | " + board[4][3] + " | " + board[4][4] + " | "+ board[4][5] + " | "); 	
		System.out.println(" ---------------------------");
		System.out.println("F | " + board[5][0] + " | "  + board[5][1] + " | " + board[5][2] + " | " + board[5][3] + " | " + board[5][4] + " | "+ board[5][5] + " | " );
		System.out.println(" ---------------------------");
		System.out.println("");
		}
	}
