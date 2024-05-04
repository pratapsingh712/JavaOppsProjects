package inheritance;

public class PlayerDetailsMain {

	public static void main(String[] args) {
		//int jerseyNo, String name, int runScored, int ballsFaced, int centuries, int halfCenturies
		
		Batsman rohitSharma = new Batsman(45,"Rohit sharma",230,198,39,44);
		Batsman viratKohli = new Batsman(18,"virat kohli",183,135,51,50);
		Batsman thala = new Batsman(07,"Thala",185,65,45,55);
		
		
		System.out.println(rohitSharma.toString());
		System.out.println(viratKohli.toString());
		System.out.println(thala.toString());
		
		double max = 0;
		String name = "";
		
		if(rohitSharma.getStrikeRate()>max)
		{
			max = rohitSharma.getStrikeRate();
			name = rohitSharma.getName();
		}
		if(viratKohli.getStrikeRate()>max)
		{
			max = viratKohli.getStrikeRate();
			name = viratKohli.getName();
		}
		if(thala.getStrikeRate()>max)
		{
			max = thala.getStrikeRate();
			name = thala.getName();
		}
		
		System.out.println("Player with highest strike rate is :"+name+" and strike rate is :"+max);

	}

}
