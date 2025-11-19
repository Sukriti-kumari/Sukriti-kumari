package oopsConsept;

import java.util.Scanner;

public class MethodOverloading {
	//Creating multiple methods with same name  but different parameters is called method overloading.
	/*
	 * Either parameter type should different
	 * or order of parameter should be different
	 * or number of parameter should different
	 * 
	 * 
	 */
	Scanner s = new Scanner(System.in);
	int sum(int i, int j){
		int add = i + j;
		System.out.println("Sum of two integers " );
		return add;
	}
	float sum(float i, float j){
		float add = i + j;
		System.out.println("Sum of two floats " );
		return add;
	}
	double sum(float i, double j){
		double add = i + j;
		System.out.println("Sum of one float one double " );
		return add;
	}
	
	int deposit(int amount){
		return amount;
	}
	
	double deposit(double amount){
		return amount;
	}
	
	int deposit(int amount, String accountType){
		System.out.println(accountType);
		return amount;
	}
	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		
		m.depositex();
		

	}
	
	public void intmethodoverload() {
		System.out.println("enter the first number: ");
		int a = s.nextInt();
		System.out.println("enter second number: ");
		int b = s.nextInt();
		System.out.println(sum(a, b));
		
		System.out.println("enter the first number: ");
		float c = s.nextFloat();
		System.out.println("enter second number: ");
		float d = s.nextFloat();
		System.out.println(sum(c, d) );
		
		System.out.println("enter the first number: ");
		float e = s.nextFloat();
		System.out.println("enter second number: ");
		double f = s.nextDouble();
		System.out.println(sum(e, f) );
	}
	
	public void depositex() {
		System.out.println("enter the amount in integer to deposit: ");
		int g = s.nextInt();
		System.out.println(deposit(g));
		System.out.println("enter the amount in double to deposit: ");
		double h = s.nextDouble();
		System.out.println(deposit(h));
		
		
		System.out.println("enter the amount in integer to deposit: ");
		int i = s.nextInt();
		System.out.println("enter the acount type: ");
		String j = s.next();
		System.out.println(deposit(i,j ));
	}


}
