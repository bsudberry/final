import java.util.Scanner;
 

public class space
	{
	private boolean Hit;
	private boolean Ship;
	private int X;
	private int Y;
	
	public boolean isHit()
		{
		return Hit;
		}
	public void setHit(boolean hit)
		{
		Hit = hit;
		}  
	public boolean isShip()
		{
		return Ship;
		}
	public void setShip(boolean ship)
		{
		Ship = ship;
		}
	
	public space  (boolean H, boolean S, int X, int Y)
		{
		Hit=H;
		Ship=S;
		
		}
	}


