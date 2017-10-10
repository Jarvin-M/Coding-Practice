import java.util.*;

class ReadingUserInput{
	public static void main(String[] args){
		System.out.println("Enter your age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner2.nextLine();

		System.out.println("Name:"+ name + "\nAge:"+ age);
	}
}