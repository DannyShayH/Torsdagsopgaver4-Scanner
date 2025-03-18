import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void doAction(int action){

	switch(action){
	case 1:
		System.out.println("Starting the game now");
		break;
	case 2:
		System.out.println("Fetching previously saved game data");
		break;
	case 3:
		System.out.println("Game paused");
		break;
	case 4:
		System.out.println("Ending game");
		break;
	default:
		System.out.println("Invalid choice");
		break;
		}
	}
	public static void main(String[] args){

	ArrayList<String> actions = new ArrayList<String>();
	actions.add("1) Start Game");
	actions.add("2) Resume Game");
	actions.add("3) Pause Game");
	actions.add("4) End Game");

	//To test
	System.out.println(actions.get(2));

	GameMenu menu = new GameMenu(actions);

	menu.displayMenu();

	String choice = menu.getAction();

	int action = Integer.parseInt(choice);
	doAction(action);

	}
}