package arrayProblem;

import java.util.Scanner;

public class ArrProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
	
		Scanner s = new Scanner(System.in);
		for(int i=0; i< arr.length; i++){
			System.out.println("Enter the value for Index " + i);
			int v = s.nextInt();
			arr[i] = v;
		}
		for(int i=0; i< arr.length; i++){
			if((arr[i]%2)==0) {
			System.out.println(arr[i] + " is Even number");
			}
			else {
				System.out.println(arr[i] + " is Odd number");	
			}
		}
		int max = 0;
		int min = arr[0];
		int sum = 0;
			for(int i=0; i< arr.length; i++){
				
			
				if(arr[i]> max) {
				max = arr[i];
				}
				
				if(arr[i]<min) {
					min = arr[i];
				}
			sum = sum + arr[i];	
			}
			System.out.println("The maximum number is: " + max);
			System.out.println("The minimum number is: " + min);
			int avg = sum / arr.length;
			System.out.println("The average of array value is: " + avg);
			
		}
	}


