package arrayProblem;
import java.util.Scanner;

public class twoDarray {

	public static void main(String[] args) {
		System.out.println("Print sum of TwoDarray");
		Scanner s = new Scanner(System.in);
		int [][]arr = new int[5][5];
		int num =0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j< arr.length; j++) {
				System.out.println("Enter the value of " + i + "th row and " + j + " Column");
				num = s.nextInt();
				arr[i][j] = num;
			}
			
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j< arr.length; j++) {
				System.out.print(arr[i][j]);
				if(arr[i][j] < 10) {
					System.out.print("  ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
			
		}
		
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j< arr.length; j++) {
				sum = sum + arr[i][j];
			}
			
		}
		System.out.println("Sum of Two D array is: " + sum );

	}

}
