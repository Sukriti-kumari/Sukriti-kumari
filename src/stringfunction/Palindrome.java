package stringfunction;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		/*System.out.println("Check if the given string is palindrome. ");
		String s = "Madam";
		String p = "";
		for(int i = s.length()-1; i>=0; i--){
			
			p = p + s.charAt(i);
		}
		if(p.equalsIgnoreCase(s)) {
			System.out.println("Given word is Palindrome");
		}
		else {
			System.out.println("Given word is not a Palindrome");
		}*/
		/*System.out.println("WAP to reverse a String");
		String s = "Sukriti";
		String r = "";
		for(int i = s.length()-1; i>=0; i--){
			
			r = r + s.charAt(i);
		}
		
			System.out.println(s +"   " +r);*/
		System.out.println("Count Vowels");
		System.out.println("Give a word: ");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String w = input.toLowerCase();
		int count = 0;
		for(int i =w.length()-1; i>=0; i--){
			if(w.charAt(i) == 'a' || w.charAt(i) == 'e' || w.charAt(i) == 'i' ||w.charAt(i) == 'o' || w.charAt(i) == 'u') {
				count = count+1;
			}
			
		}
		
		System.out.println("Number of Vowels in given string is: " + count);
		
	}
	
}
