import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String input = 5 + scanner.nextLine();
		int converted = Integer.parseInt(input) + 5;
		System.out.println(converted);
		scanner.close();
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		String input = 4 + scanner.nextLine() + 3;
		double converted = Double.parseDouble(input) + 3.4;
		System.out.println(converted);
		scanner.close();
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String input = scanner.nextLine();
		boolean converted = !Boolean.parseBoolean(input);
		System.out.println(converted);
		scanner.close();
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String input = scanner.nextLine() + 3;
		int converted = Integer.parseInt(input) + 2;
		char secondConverted = (char) converted;
		System.out.println(secondConverted);
		scanner.close();
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String input = scanner.nextLine() + 1;
		int converted = Integer.parseInt(input) / 2;
		double secondConverted = (double) converted;
		System.out.println(secondConverted);
		scanner.close();
	}

	public static void q6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		String input = 1 + scanner.nextLine();
		double converted = Double.parseDouble(input);
		int secondConverted = (int) converted;
		System.out.println(secondConverted);
		scanner.close();
	}

}
