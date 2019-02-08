package week1.day2;

import java.util.Scanner;

// Mobile brand dealing with Static and Dynamic Array.

public class Mobilebrands {

	String brands[] = { "oppo", "mi", "redmi" };
	String brands1[] = new String[4];

	public void staticarrayverify() {
		for (int i = 0; i < brands.length; i++)
			System.out.println(brands[i]);
	}

	public void dynamicarrayverify() {
		System.out.println("Please enter the mobile brands");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < brands1.length; i++)
			brands1[i] = sc.nextLine();

		for (int i = 0; i < brands1.length; i++)
			System.out.println(brands1[i]);
	}

	public static void main(String[] args) {

		Mobilebrands mb = new Mobilebrands();
		// mb.staticarrayverify();
		mb.dynamicarrayverify();
	}

}
