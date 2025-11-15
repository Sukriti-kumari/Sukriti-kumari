package ArithmaticProblem;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*grade calculater grade calculater is nothing but i will give each subject marks out of 100 count the total 
		 percentage based on percentage like if precentage (90% above  print O grade if 80 % to (90 % then A+ like
		 that upto b grade if  below 35% fail*/
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks you got in Maths: ");
		double m = s.nextDouble();
		System.out.println("Enter the marks you got in Science: ");
		double sc = s.nextDouble();
		System.out.println("Enter the marks you got in SST: ");
		double ss = s.nextDouble();
		System.out.println("Enter the marks you got in FirstLanguage: ");
		double fl = s.nextDouble();
		System.out.println("Enter the marks you got in Second Language: ");
		double sl = s.nextDouble();
		double persentage = ((m+sc+ss+fl+sl)/500)*100;
		if(persentage >= 80) {
			System.out.println("Grade A+");
		}
		else if(persentage < 35) {
			System.out.println("Grade FAIL");
		}
		else if(persentage > 35 || persentage < 70) {
			System.out.println("Grade B");
		}
		
		else if(persentage >= 70 || persentage < 80) {
			System.out.println("Grade A");
		} 
	}

}
