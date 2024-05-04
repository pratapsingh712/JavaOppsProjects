package inheritance;

import java.text.DecimalFormat;

public class Batsman extends Player{
	
	private int runsScored, ballsFaced, centuries, halfCenturies;
	
	public Batsman() {}
	
	public Batsman(int jerseyNo, String name, int runScored, int ballsFaced, int centuries, int halfCenturies)
	{
		super(jerseyNo, name);// i could also use setjerseyNO(jerseyNo) getters/setters
		this.runsScored = runScored;
		this.ballsFaced = ballsFaced;
		this.centuries = centuries;
		this.halfCenturies = halfCenturies;
	}

	public int getRunsScored() {
		return runsScored;
	}

	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}

	public int getBallsFaced() {
		return ballsFaced;
	}

	public void setBallsFaced(int ballsFaced) {
		this.ballsFaced = ballsFaced;
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
	 
	public double getStrikeRate() {
		
		double strike = (double)(runsScored*100)/ballsFaced;
		DecimalFormat d = new DecimalFormat("0.##");
		
		String res = d.format(strike);
		return Double.parseDouble(res);
	}

	@Override
	public String toString() {
		return "Batsman ["+super.toString()+", runsScored "+runsScored+", ballsFaced=" + ballsFaced + ", centuries=" + centuries
				+ ", halfCenturies=" + halfCenturies + ", getStrikeRate()=" + getStrikeRate() + "]";
	}
	
	
}
