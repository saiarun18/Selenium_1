package week1.day2;

import java.util.Scanner;

public class Whileloopverification {
	
	public void addition()
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		
		int number=sc.nextInt();
				
				int i=1,sum=0;
		while(i<=number)
		{
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}
	
public void countofoddnum()
{
	System.out.println("Enter the number");

	Scanner sc=new Scanner(System.in);
	
	int number=sc.nextInt();
	int i=1,count=0;
	while(i<=number)
	{
		if(i%2!=0)
		{
			count++;

		}
		i++;
	}
	System.out.println(count);
}

public void printmult()
{
	System.out.println("please enter the number");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int number1=0;
int i=1;
while(i<=number)
{
	number1=i*number;
System.out.println(i + "*"+number +"=" +number1);
i++;
}
}

	public void verifystringsplit() {

		String text = "Please focus on Java atleast next 2 weeks";
		String[] text1 = text.split(" ");
		for (int i = 0; i <text1.length; i++) {
			if (text1[i].startsWith("J") || text1[i].contains("o"))
			{
				System.out.println(text1[i]);
			}
		}
}

public static void main(String[] args) {
		
		Whileloopverification wp=new Whileloopverification();
		wp.addition();
		//wp.countofoddnum();
	//	wp.printmult();
		//wp.verifystringsplit();
	}

}
