package week2.day1;

import java.util.Scanner;

public class Arraypgm {
	
	public void sumofarray()
	{
		int[] a= {10,20,30,40};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		/*Arraypgm ap=new Arraypgm();
		ap.sumofarray();*/
		
		
		int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum += a[i];
        }
        System.out.println("Sum:"+sum);
    }
}
		
		
		

