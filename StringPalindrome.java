package assignments;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "Reviver";
		String rev = "";
		
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
