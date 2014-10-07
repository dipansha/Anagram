

import java.util.*;
import java.lang.*;
import java.io.*;


class Anagram
{
	String line;
	public String[] words;
	Anagram(String temp)
	{
		line=temp;
		words=line.split(" ");
		Arrays.sort(words);
	}
	boolean compare(String[] temp)
	{
		if(temp.length!=words.length)
			return false;
		else
		{
			for(int i=0;i<temp.length;i++)
				if(!temp[i].equals(words[i]))
					return false;
			return true;
		}
	}
	
}

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
		String temp=input.readLine();	
		Anagram L1=new Anagram(temp);		
		temp=input.readLine();	
		Anagram L2=new Anagram(temp);
		if(L1.compare(L2.words)) 
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
}