package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		String text = new String("We learn java basics as part of java sessions in java week1");
		char[] charArray = text.toCharArray();		
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if (charSet.add(charArray[i]) == true) {
				charSet.add(charArray[i]);
			} else {
				dupCharSet.add(charArray[i]);				
			}
		}
		System.out.println("String without duplicate characters are: " + charSet);
		System.out.println("The duplicate characters are: " + dupCharSet);		
	}

}
//