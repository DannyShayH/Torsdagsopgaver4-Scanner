import java.util.Scanner;

public class Task2{
	public static void main(String[] args){
//name
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type your name");

		String name = scanner.nextLine();

		System.out.println("Hello " + name + ", now please enter your age");

//age

		int age = scanner.nextInt();

		System.out.println("You are " + age + "years old");


		int canRetire = 67 - age;

		System.out.println("You got " + canRetire + " years until you can retire. TOO BAD AHAHA");


		scanner.close();

	}
}