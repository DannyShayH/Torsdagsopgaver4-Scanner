import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args){
	
	//Team Object
	Team team = new Team("TheBest ",1);
	Team team1 = new Team("TheMany ", 2);
	Team team2 = new Team("TheHorrible ", 3);
	Team team3 = new Team("TheGreat ", 4);
	Team team4 = new Team("TheDumb ", 5);

	//adding player names to teams
	team.addPlayer("Johnny");
	team1.addPlayer("Drake");
	team2.addPlayer("Vinny");
	team3.addPlayer("Valentino");
	team4.addPlayer("Vero");

	//print teams
	System.out.println(team);
	System.out.println(team1);
	System.out.println(team2);
	System.out.println(team3);
	System.out.println(team4);

	}
}