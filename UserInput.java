import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner nope = new Scanner(System.in);
		int inputArray[] = new int[10];
		System.out.println("This will store 10 values of your choice");
		int number;
		for (int i =0; i < 10; i++) {
			System.out.println("Input a number at [" + i + "] : ");
			number = nope.nextInt();
			inputArray[i] = number;
		}
		System.out.println("\n This is an array of the numbers you chose");
		System.out.println(Arrays.toString(inputArray));
	}
}
