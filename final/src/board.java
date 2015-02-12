import java.util.ArrayList; 


public class board
	{
	public static String [][] board1=new String [6][6];
	public static String [][] board2=new String [6][6];
	public static String [][] board3=new String [6][6];
	public static String [][] board4=new String [6][6];
	static String pawn;
	static ArrayList<ArrayList<space>> boardSpots = new ArrayList<ArrayList<space>>();
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
		System.out.println("This is board 1");
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
			board1[5][2]="X";
			board1[5][1]="X";
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
		  
		for(int i=0; i<6; i++)
			{
			for(int z=0; z< 6; z++)
				{
				if(board1[i][z].equals("X"))
					{
					ArrayList <space> row = new ArrayList<space>(); 
					row.add(new space(false, true, i,z));
					boardSpots.add(row);
					}
				else
					{
					ArrayList <space> row = new ArrayList<space>(); 
					row.add(new space(false, false, i,z));
					boardSpots.add(row);
					}
				}
			}
		}
	public static void displayBoard2()
		{
		System.out.println("This is board 2");
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
			board2[3][1]="X";
			board2[3][0]="X";
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
		for(int i=0; i<6; i++)
			{
			for(int z=0; z< 6; z++)
				{
				if(board2[i][z].equals("X"))
					{
					ArrayList <space> row = new ArrayList<space>(); 
					row.add(new space(false, true, i,z));
					boardSpots.add(row);
					}
				else
					{
					ArrayList <space> row = new ArrayList<space>(); 
					row.add(new space(false, false, i,z));
					boardSpots.add(row);
					}
				}
			}
		}
	public static void displayBoard3()
		{
		System.out.println("This is board 3");
			{
			board3[2][2]="X";
			board3[3][2]="X";
			board3[4][2]="X";
			board3[5][2]="X";
			board3[0][0]="X";
			board3[0][1]="X";
			board3[0][2]="X";
			board3[0][3]="X";
			board3[3][0]="X";
			board3[4][0]="X";
			board3[2][0]="X";
			board3[0][5]="X";
			board3[1][5]="X";
			board3[3][4]="X";
			board3[4][4]="X";
			board3[5][4]="X";
			}
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
		for(int i=0; i<6; i++)
			{
			for(int z=0; z< 6; z++)
				{
				if(board3[i][z].equals("X"))
					{
					ArrayList <space> row = new ArrayList<space>(); 
					row.add(new space(false, true, i,z));
					boardSpots.add(row);
					}
				else
					{
					ArrayList <space> row = new ArrayList<space>(); 
					row.add(new space(false, false, i,z));
					boardSpots.add(row);
					}
				}
			}
		}
	public static void displayBoard4()
		{
		System.out.println("This is board 4");
			{
			board4[0][0]="X";
			board4[0][1]="X";
			board4[0][5]="X";
			board4[1][5]="X";
			board4[2][5]="X";
			board4[3][4]="X";
			board4[4][4]="X";
			board4[5][4]="X";
			board4[4][2]="X";
			board4[5][2]="X";
			board4[3][0]="X";
			board4[4][0]="X";
			board4[5][0]="X";
			board4[2][2]="X";
			board4[2][3]="X";
			}
		System.out.println("    1   2   3   4   5   6");
		System.out.println(" ---------------------------");
		System.out.println("A | " + board4[0][0] + " | "  + board4[0][1] + " | " + board4[0][2] + " | " + board4[0][3] + " | " + board4[0][4] + " | "+ board4[0][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("B | " + board4[1][0] + " | "  + board4[1][1] + " | " + board4[1][2] + " | " + board4[1][3] + " | " + board4[1][4] + " | "+ board4[1][5] + " | " ); 	
		System.out.println(" ---------------------------");
		System.out.println("C | " + board4[2][0] + " | "  + board4[2][1] + " | " + board4[2][2] + " | " + board4[2][3] + " | " + board4[2][4] + " | "+ board4[2][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("D | " + board4[3][0] + " | "  + board4[3][1] + " | " + board4[3][2] + " | " + board4[3][3] + " | " + board4[3][4] + " | "+ board4[3][5] + " | ");
		System.out.println(" ---------------------------");
		System.out.println("E | " + board4[4][0] + " | "  + board4[4][1] + " | " + board4[4][2] + " | " + board4[4][3] + " | " + board4[4][4] + " | "+ board4[4][5] + " | "); 	
		System.out.println(" ---------------------------");
		System.out.println("F | " + board4[5][0] + " | "  + board4[5][1] + " | " + board4[5][2] + " | " + board4[5][3] + " | " + board4[5][4] + " | "+ board4[5][5] + " | " );
		System.out.println(" ---------------------------");
		System.out.println("");
		for(int i=0; i<6; i++)
			{
			for(int z=0; z< 6; z++)
				{
				if(board4[i][z].equals("X"))
					{
					ArrayList <space> row = new ArrayList<space>(); 
					row.add(new space(false, true, i,z));
					boardSpots.add(row);
					}
				else
					{
					ArrayList <space> row = new ArrayList<space>(); 
					row.add(new space(false, false, i,z));
					boardSpots.add(row);
					}
				}
			}
		}
	}


	 
	
	
	