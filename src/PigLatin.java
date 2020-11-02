import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char part1;
		String part2;
		String ay = "ay";
		String yay = "yay";
		String vowel;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter a word for me to translate into pig latin.");
		
		String userInput = scnr.next();
		part1 = userInput.charAt(0);
		part2 = userInput.substring(1); 
		
		if(isVowel(userInput.charAt(0)) == true) {
			
			System.out.println(part1 + part2 + yay);
		} else {
			System.out.println(part2 + part1 + ay);
		}
		
		
	}
	
	public static boolean isVowel(char vowelCheck) {
		
		if(vowelCheck == 'a' || vowelCheck == 'e' || vowelCheck == 'i' ||
				vowelCheck == 'o' || vowelCheck == 'u') {
			return true;
		} else {
			return false; 
		}
	}

}
