
//1.write a method that multiplies 2 numbers and returns the answer

import java.util.Scanner;

public class MultiplyByMethod {
	
	public static int Multiplication(int n1,int n2) {
		int sum;
		sum = n1*n2;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		int n1 =sc.nextInt();
		
		System.out.print("Enter the second number : ");
		int n2 = sc.nextInt();
		
		System.out.println();
		
		System.out.println("your multiplication value is : " + Multiplication(n1,n2));
		
		

	}

}