import java.util.Scanner;
public class palin {
	
	public static void main(String[] args){
		String input = "";
		Scanner s = new Scanner (System.in);
		System.out.print("Input a string to see if it is a palindrome!!!");
		input=s.next();
		boolean result = false;
		result = isPalindrome(input);
		System.out.println("Your string is a palindrome: "+result);
	}
	public static boolean isPalindrome (String s){
		if (s.length() == 0 || s.length() == 1){
			return true;
		}
		if (s.charAt(0) == s.charAt(s.length()-1)){
			return isPalindrome(s.substring(1, s.length()-1));
		}
		return false;
	}

}
