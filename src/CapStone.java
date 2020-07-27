import java.util.Scanner;

public class CapStone {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		String word = "";
		String response = "";
		String newWord = "";
		
		
		do {
			System.out.println("Enter a word for me to translate into pig latin:");
			word = scnr.next();
			String[] wordArray = word.split(" ");
			
		for (int i = 0; i < wordArray.length; i++ ) {
			String pigLatinWord = translate(wordArray[i]);
			newWord += pigLatinWord + " ";
		}
		System.out.println(newWord);
		System.out.println("Would you like to try again? [y/n]");
		response = scnr.next();
		} while (
				response.contentEquals("y")
				);
		
		
		//take word and replace with first letter to the end
		//new word should be followed by 'ay'
		//if it starts with a vowel, then word automatically gets an ay at the end
		//without touching the vowels
		
	}
	
	public static String translate(String wort) {
		String lowerCaseWord = wort.toLowerCase();
		int pos = -1;
		char ch;
		
		for (int i = 0; i < lowerCaseWord.length(); i++) {
			ch = lowerCaseWord.charAt(i);
			
			if (isVowel(ch)) {
				pos = i;
				break;
			}
		}
		
		if (pos==0) {
			return lowerCaseWord + "yay";
		} else {
			String a = lowerCaseWord.substring(pos);
			String b = lowerCaseWord.substring(0, pos);
			return a + b + "ay";
		}
	}
	
	public static Boolean isVowel(char ch) {
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		} return false;
	}
}
