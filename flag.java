import java.util.Scanner;

public class Flag {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int height = 0;
		System.out.println("Input the height of the flag: \t");
		height = myScanner.nextInt();
		
		for(int i=0; i< height; i++) {
			System.out.println("*****=====*****");
		}
		
		System.out.println("");
		FlagWithForLoop();
		
		myScanner.close();
	}
	
	public static void FlagWithForLoop() {
		int height = 8;
		int width = 12;
		
		for (int i = 0;i < height; i++ ) {
			for(int j = 0; j < width; j++) {
				if((j > 3) && (j < 8)) {
					System.out.print("=");
				} else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
	
}
