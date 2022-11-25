package assignments;

import java.util.Scanner;

public class StringPalindrome {
	//Q.4 Write programs to accept any word and check whether the word is palindrome or not.
	
	public static void main(String[] args) {
		String rev = "";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str = sc.nextLine();
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.toLowerCase().equals(rev.toLowerCase()))
		{
			System.out.println("Given string is a palindrome");
		}
		else
		{
			System.out.println("Given string is NOT a palindrome");
		}

	}

}
