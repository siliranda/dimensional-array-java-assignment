import java.util.Scanner;

public class OtherFlag {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the height of the flag:");
		int height = scanner.nextInt();
		
		for(int i =0; i < height; i++) {
			if((i < height/2)) {
				System.out.println("****========");
			} else {
				System.out.println("============");
			}
		}
		
		System.out.println("");
		scanner.close();
		
		FlagWithLoop();
	}
	
	public static void FlagWithLoop() {
		int height = 8 ;
		int width = 12;
		
		for (int i =0; i < height; i++) {
			for (int j=0; j < width; j++) {
				if((j < (width/3)) && (i < (height/2))) {
					System.out.print("*");
				}else {
					System.out.print("=");
				}
			}
			System.out.println();
		}
	}
}
