import java.util.Scanner;

interface IPlayerStatistics
{
	public void displayPlayerStatistics() ;



}
abstract class Player implements IPlayerStatistics
{
	
	protected  String name, teamName;
	protected  int noOfMatches;
	public Player(String name, String teamName, int noOfMatches) {
	
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
	}
	
	
}


class CricketPlayer extends Player implements IPlayerStatistics
{
	private int totalRunsScored,noOfWicketsTaken;


public CricketPlayer(String name, String teamName, int noOfMatches, int totalRunsScored, int noOfWicketsTaken) {
	super(name, teamName, noOfMatches);
	this.totalRunsScored = totalRunsScored;
	this.noOfWicketsTaken = noOfWicketsTaken;



}
public void displayPlayerStatistics() 
{
	
	System.out.println("Player Details");
			System.out.println("Player name : "+name);
		System.out.println("Team name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("Total runsscored : "+totalRunsScored);
		System.out.println("No of wickets taken : "+noOfWicketsTaken);

}
}

class HockeyPlayer extends Player implements IPlayerStatistics
{
	
private int noOfGoals;
public HockeyPlayer(String name, String teamName, int noOfMatches, int noOfGoals, String position) {
	super(name, teamName, noOfMatches);
	this.noOfGoals = noOfGoals;
	this.position = position;
}

private String position;

public void displayPlayerStatistics()
{
	


	
	System.out.println("Player Details");
	System.out.println("Player name : "+name);
System.out.println("Team name : "+teamName);
System.out.println("No of matches : "+noOfMatches);
	System.out.println("Position : "+position);
	System.out.println("No of goals taken : "+noOfGoals);
}




}




public class Main {
	
	
	public static void main(String[] args)
	
	{
		
		
		
		
		Scanner sc=new Scanner(System.in);
		int t,ra;
		int ta,td,tf;
		String pc,mc,pe,l;
		System.out.println("Menu");
		System.out.println("1.Crciket Player Details");
		System.out.println("2.Hockey Player Details");
		System.out.println("Enter choice");
		t=sc.nextInt();
		
		if(t==1)
		{
			sc.nextLine();
			System.out.println("Enter player name");
			pc=sc.nextLine();
			System.out.println("Enter team name");
			pe=sc.nextLine();
			System.out.println("Enter number of matches played");
			ta=sc.nextInt();
			
			
			
			
			System.out.println("Enter total runs scored");
			td=sc.nextInt();
			System.out.println("Enter total number of wickets taken");
			tf=sc.nextInt();
			CricketPlayer obj=new CricketPlayer(pc,pe,ta,td,tf);
			obj.displayPlayerStatistics();
			
			
				
		}
		else if(t==2)
		{
			sc.nextLine();

			System.out.println("Enter player name");
			pc=sc.nextLine();
			System.out.println("Enter team name");
			pe=sc.nextLine();
			System.out.println("Enter number of matches played");
			ta=sc.nextInt();
			sc.nextLine();
			//String[] de=pc.split("\\|",3);
			//PaybackCard ob=new PaybackCard(de[0],de[1],de[2],pe,ta);
			
			System.out.println("Enter the position");
			l=sc.nextLine();
			System.out.println("Enter total number of goals taken");
			tf=sc.nextInt();
			HockeyPlayer obj1=new HockeyPlayer(pc,pe,ta,tf,l);
			obj1.displayPlayerStatistics();
		}
		else{
			
			
			System.out.println("Invalid Input");
		}
	}
	}


