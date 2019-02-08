package week1.day1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("Please enter the 2 numbers");

		calculatormethods cm = new calculatormethods();
		int add_result = cm.addition();
		System.out.println(add_result);

		int sub_result = cm.subraction();
		System.out.println(sub_result);

		int mul_result = cm.multiplication();
		System.out.println(mul_result);

		int div_result = cm.division();
		System.out.println(div_result);

	}

}

class calculatormethods {
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	int j = sc.nextInt();
	int k;

	public int addition() {
		k = i + j;
		return k;

	}

	public int subraction() {

		k = i - j;

		return k;

	}

	public int multiplication() {
		k = i * j;
		return k;
	}

	public int division() {
		k = i / j;
		return k;
	}
}
