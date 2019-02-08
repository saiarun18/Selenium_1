package week2.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Removeduplicates {

	public void removedupusingchararray()
	{
		String txt="arunruarunnnnn";
		char[] ch=txt.toCharArray();
		
		HashSet<Character> charset=new LinkedHashSet<>();
		
		for(char cha:ch)
		{
			charset.add(cha);
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(charset);
		System.out.println(sb.toString());
		
	}
	
	
	
	public static void main(String[] args) {
		
		Removeduplicates rd=new Removeduplicates();
		rd.removedupusingchararray();

	}

}
