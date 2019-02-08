package week1.day1;

import java.util.Scanner;

public class Findgreatestnumber {
	
public void verifygreatestnumber(int i,int j,int k)
	{
	
	Scanner sc=new Scanner(System.in);
	
	
		if(i>j && i>k)
		{
			System.out.println("The greatest number is " +i);
		}
		else if(j>i && j>k)
		{
			System.out.println("The greatest number is " +j);
		}
		else 
		{
			System.out.println("The greatest number is " +k);
		}
	}

	public static void main(String[] args) {
		Findgreatestnumber fn=new Findgreatestnumber();
		fn.verifygreatestnumber(21,28,29);	
		fn.verifygreatestnumber(20,21,19);
	}
	}


