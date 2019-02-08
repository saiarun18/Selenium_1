package dailypgms;

import java.util.Scanner;

//Second smallest of Three given numbers
class secondsmallest
{
	public void secondsmallest()
	{
		System.out.println("Please enter the 3 numbers");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		
		if(i<j && j<k)
		{
			System.out.println("The second smallest no.is " +j);
		}
		else if(j<i && i<k)
		{
			System.out.println("The second smallest no.is " +i);
		}
		else
		{
			System.out.println("The second smallest no.is " +k);
		}
	}
}

class fibonacciseries
{
 int i=1,j=2,op,count=100;
	public void fibonacci()
	{
		
		for(int k=1;op<=count;k++)
		{
			op=i+j;
			System.out.println(op);
			i=j;
			j=op;	
		}
	}	
}

class Month {

    
	 public void findmonth() {

	        Scanner input = new Scanner(System.in);

	        int number_Of_DaysInMonth = 0; 
	        String NameOfMonth = "Unknown";

	        System.out.print("Input a month number: ");
	        int month = input.nextInt();

	        System.out.print("Input a year: ");
	        int year = input.nextInt();

	        switch (month) {
	            case 1:
	                NameOfMonth = "January";
	                number_Of_DaysInMonth = 31;
	                break;
	            case 2:
	                NameOfMonth = "February";
	                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	                    number_Of_DaysInMonth = 29;
	                } else {
	                    number_Of_DaysInMonth = 28;
	                }
	                break;
	            case 3:
	                NameOfMonth = "March";
	                number_Of_DaysInMonth = 31;
	                break;
	            case 4:
	                NameOfMonth = "April";
	                number_Of_DaysInMonth = 30;
	                break;
	            case 5:
	                NameOfMonth = "May";
	                number_Of_DaysInMonth = 31;
	                break;
	            case 6:
	                NameOfMonth = "June";
	                number_Of_DaysInMonth = 30;
	                break;
	            case 7:
	                NameOfMonth = "July";
	                number_Of_DaysInMonth = 31;
	                break;
	            case 8:
	                NameOfMonth = "August";
	                number_Of_DaysInMonth = 31;
	                break;
	            case 9:
	                NameOfMonth = "September";
	                number_Of_DaysInMonth = 30;
	                break;
	            case 10:
	                NameOfMonth = "October";
	                number_Of_DaysInMonth = 31;
	                break;
	            case 11:
	                NameOfMonth = "November";
	                number_Of_DaysInMonth = 30;
	                break;
	            case 12:
	                NameOfMonth = "December";
	                number_Of_DaysInMonth = 31;
	        }
	        System.out.print(NameOfMonth + " " + year + " has " + number_Of_DaysInMonth + " days\n");
	    }
	}

public class Dailypgms {
	public static void main(String[] args) {
		
		/*secondsmallest ss=new secondsmallest();
		ss.secondsmallest();
		
		fibonacciseries fs=new fibonacciseries();
		fs.fibonacci(); */
		
		Month fm=new Month();
		fm.findmonth();
	}
}
