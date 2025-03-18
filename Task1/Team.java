import java.util.ArrayList;

// entity Class
public class Team{
//Attributes
	private String teamName;
	private int rank;
	private ArrayList<String> playerNames;

public Team(String teamName, int rank){
	this.teamName = teamName;
	this.rank = rank;
	this.playerNames = new ArrayList<>();

}
public void setRank(int rank){
	this.rank = rank;
	}
public void addPlayer(String playerName){
		this.playerNames.add(playerName);
}
@Override
public String toString(){
	StringBuilder teamInfo = new StringBuilder("Team: " + teamName + "Rank: " + rank);
		for (String player : playerNames) {
			teamInfo.append("\n").append(player);
		}	
			return teamInfo.toString();
	}
}