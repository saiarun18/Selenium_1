package homework;

import java.util.Scanner;

//Day 5 

public class SumofNumbers {

	public static void main(String[] args) 
    {
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