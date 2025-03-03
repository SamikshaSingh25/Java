// Java program to find the lexicographically
// maximum substring.
import java.io.*;
import java.util.*;
class rads
{ 
static String LexicographicalMaxString(String str)
{
	char maxchar = 'a';
	ArrayList<Integer> index = new ArrayList<Integer>(); 

	// We store all the indexes of maximum
	// characters we have in the string
	for (int i = 0; i < str.length(); i++) 
	{
	if (str.charAt(i) >= maxchar)
	{
		maxchar = str.charAt(i);
		index.add(i);
	}
	}
	String maxstring = "";

	// We form a substring from that maximum
	// character index till end and check if
	// its greater that maxstring
	for (int i = 0; i < index.size(); i++) 
	{
	if (str.substring(index.get(i), 
						str.length()).compareTo( maxstring) > 0)
	{
		maxstring = str.substring(index.get(i), 
								str.length());
	}
	}
	return maxstring;
}

// Driver code
public static void main (String[] args) 
{ 
	String str = "banana"; 
	System.out.println(LexicographicalMaxString(str));
}
}

// This code is contributed by rag2127.
