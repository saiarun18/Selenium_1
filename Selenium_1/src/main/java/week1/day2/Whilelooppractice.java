package week1.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Whilelooppractice {

	public static void main(String[] args) {
		
		Whilelooppractice wp=new Whilelooppractice();
		//wp.printoddnum();
		wp.printfibonacci();
		
	}
		public void verifyadd()
		{
		Scanner sc=new Scanner(System.in);
		int i=0;
		int Number=sc.nextInt();
		int sum=0;
		while(i<=Number)
		{
			sum+=i;	
			i++;
		}
		System.out.println(sum);
		}
		
		public void printoddnum()
		{
			System.out.println("Please enter the number");
			Scanner sc=new Scanner(System.in);
			int Number=sc.nextInt();
			int i=1;
			int count=0;
			int sum=0;
			List<Integer> odd=new ArrayList<>();
			//int[] odd=new int[Number];
			while(i<Number)
			{
				if(i%2!=0)
				{
					odd.add(i);
					count++;
					sum=sum+i;
				}
				
				i++;
			}
			String oddnumbers=odd.toString();
			
			System.out.println(oddnumbers);
			System.out.println(count);
			System.out.println(sum);
			
		}
		
		public void printfibonacci()
		{
			System.out.println("Please enter the number");
			Scanner sc=new Scanner(System.in);
			int Number=sc.nextInt();
			int i=0;
			int fibo=0;
			int num=1;
			while(fibo<=Number)
			{
			
				fibo=fibo+num;
				System.out.println(fibo);
				i=num;
				num=fibo;
				i++;
			}
			
			
			
			
		}
		
	}


