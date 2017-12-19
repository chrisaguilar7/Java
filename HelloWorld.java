// calling out the Scanner class to use for my code
import java.util.Scanner;

//basic setup, green text needs to match name of .java file
public class HelloWorld {

// basic setup as well
	public static void main(String[] args) {
		// list class first, then assign output to be a user input
		Scanner ScannerOutput = new Scanner(System.in);
		//simply print a command for user
		System.out.println("Enter number here");
		// list class first, assign output to be whatever the user input was
		int number = ScannerOutput.nextInt();
		// simply print the number you picked
		System.out.println("The number you selected is");
		System.out.println(number);


	// list class first, then assign output to be a user input
		Scanner ScannerOutput2 = new Scanner(System.in);
		//simply print a command for user
		System.out.println("Enter string here");
		// list class first, assign output to be whatever the user input was
		String string1 = ScannerOutput2.nextLine();
		// convert string to int
		int newnumber = Integer.parseInt(string1);
		// simply print the number you picked
		System.out.println("The string you selected to be a number is");
		System.out.println(newnumber);

// you could have listed out all your outputs first like this:
		//Scanner ScannerOutput = new Scanner(System.in);
		//Scanner ScannerOutpu2 = new Scanner(System.in);

	}
}