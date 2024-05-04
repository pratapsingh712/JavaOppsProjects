package player;

public class Cricket {

	public static void main(String[] args) {
		
		//int id, String name, int runsScored, int centuries, int halfCenturies, int ballsFaced, int sixes, int fours
		
		Player rohitSharma = new Player("Rohit Sharma",251,40,65,45,6,5);
		Player viratKohli = new Player("Virat Kohli",200,50,65,45,6,5);
		Player thala = new Player("Dhoni",183,50,65,45,6,5);
		

		
		System.out.println(rohitSharma.toString());
		System.out.println("=====================================");
		System.out.println(viratKohli.toString());
		System.out.println("=====================================");
		System.out.println(thala.toString());
		System.out.println("=====================================");
		
		System.out.println("=====================================");
		System.out.println("=====================================");
		System.out.println("=====================================");
		
		
		System.out.println(rohitSharma.getName()+" has strike rate of : "+rohitSharma.getStrikeRate());
		System.out.println("=====================================");
		System.out.println(viratKohli.getName()+" has strike rate of : "+viratKohli.getStrikeRate());
		System.out.println("=====================================");
		System.out.println(thala.getName()+" has strike rate of : "+thala.getStrikeRate());
		
		
		
	}
}
