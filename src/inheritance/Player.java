package inheritance;

public class Player {

	private int jerseyNo;
	private String name;
	
	public Player() {}
	
	public Player(int jerseyNo, String name)
	{
		this.jerseyNo = jerseyNo;
		this.name = name;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Player [jerseyNo=" + jerseyNo + ", name=" + name + "]";
	}
	
	
	
}
