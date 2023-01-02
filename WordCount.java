package assignment.two;

//Write a program to find the total number of occurrences of a word inside a Statement.
public class WordCount {
public static void main(String args[]) {
	String string = "people love to love people";
	String word = "people";
	String temp[] = string.split(" ");
	int count = 0;
	for (int i = 0; i < temp.length; i++) {
		if (word.equals(temp[i]))
			count++;
	}
	
	System.out.println("The string is: " + string);
	System.out.println("The word: " + count);
}
}
