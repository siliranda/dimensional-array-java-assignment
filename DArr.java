import java.util.Scanner;

public class DArr{
	public static void main(String[] args) {
		Scanner mine = new Scanner(System.in);
		int[][] array = new int[10][10];
		int height = 10;
		int width = 10;
		System.out.println("You can begin to enter your input for the array");
		
		for(int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.println("Please enter an element for the position [" + (i+1) +"] [" + (j+1) + "] :");
				array[i][j] = mine.nextInt();
			}
		}
		
		for (int out =0; out < height; out++) {
			for (int in = 0; in < width; in++) {
				System.out.print("\t [" + array[out][in] + "]");
			}
			System.out.println();
		}
	}
}
