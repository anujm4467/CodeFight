/*

Question :- 
 Given a string s, find and return the first instance of a non-repeating character in it.
 If there is no such character, return '_'.

Example --

For s = "abacabad", the output should be
firstNotRepeatingCharacter(s) = 'c'.

There are 2 non-repeating characters in the string: 'c' and 'd'. Return c since it appears in the string first.

For s = "abacabaabacaba", the output should be
firstNotRepeatingCharacter(s) = '_'.

There are no characters in this string that do not repeat.
 * */
import java.util.*;

public class FirstNonRepeatingChar
{
   public static void main(String arg[])
   {
	  String s = "abacabaabacaba";
	  char c = firstNonRepeatingchar(s);
	  System.out.println(c);
   }
   
   public static char firstNonRepeatingchar(String s)
   {
	      int count[] = new int[26];
	      for(int i=0; i<s.length(); i++)
	    	  count[s.charAt(i) -97]++;
	      
	      for(int i=0; i<s.length(); i++)
	    	  if(count[s.charAt(i)-97] == 1)
	    		  return s.charAt(i);
	      
		  return '_';
   }
}
