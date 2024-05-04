package player;

import java.text.DecimalFormat;

public class Player {

/*create class "Player" and implement the following features
Int id;
Int name;
int runsScored;
int centuries;
int halfCenturies;
Int ballsFaced
int sixes;
int fours;
Generate a constructor to assign values to instance variables

Create a class Cricket with the main method and create 3 objects for player class
Display the Player Details with highest strike rate..*/
	
	private int id; 
	private String name;
	private int runsScored;
	private int centuries;
	private int halfCenturies;
	private int ballsFaced;
	private int sixes;
	private int fours;
	
	private static int idgen = 101;
	
	
	public Player()
	{
		id = idgen++;
	}
	
	Player(String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int sixes, int fours)
	{
		this();
		this.name = name;
		this.runsScored = runsScored;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
		this.ballsFaced = ballsFaced;
		this.sixes = sixes;
		this.fours = fours;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getCenturies() {
		return centuries;
	}

	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}

	public int getHalfCenturies() {
		return halfCenturies;
	}

	public void setHalfCenturies(int halfCenturies) {
		this.halfCenturies = halfCenturies;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
	}

	public int getSixes() {
		return sixes;
	}

	public void setSixes(int sixes) {
		this.sixes = sixes;
	}

	public int getFours() {
		return fours;
	}

	public void setFours(int fours) {
		this.fours = fours;
	}

	/*Name of the method:getStrikeRate() with no arguments.
Return type: float
TO DO: Calculate strike rate (runsScored* 100)/ballsFaced to two decimal values
and return it.
• Name of the method:getRunsScoredInBoundaries() with no arguments.
Return type: int
TO DO: Calculate the runs scored in boundaries (4* fours + 6* sixes) and return it.
Generate toString() to return a formatted string as per the below example.
Batsman[id=?, RunsScored = ?, Centuries = ?, HalfCenturies = ?, BallsFaced = ?,
Sixes ?, Fours = ?,StrikeRate ?,RunsScored InBoundaries= ?]*/
	
	// i can use Either decimal formator or String formator to get upto two decimal points while calc strike rate.
	
	public double getStrikeRate()
	{
		double strikeRate =  (double)(runsScored*100)/ballsFaced;
		DecimalFormat d = new DecimalFormat("0.##");
		String s = d.format(strikeRate);
		return Double.parseDouble(s);
		
	}
	 
	public int getRunsScoredInBoundaries()
	{
		return (4*fours+6*sixes);
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", runsScored=" + runsScored + ", centuries=" + centuries
				+ ", halfCenturies=" + halfCenturies + ", ballsFaced=" + ballsFaced + ", sixes=" + sixes + ", fours="
				+ fours + ", Runs Scored In Boundaries  =" + getRunsScoredInBoundaries() + ", Strike Rate = "+getStrikeRate()+"]";
	}
	
	
	
}
