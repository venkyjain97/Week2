import java.util.Scanner;

public class MaxamongThree{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int n3 = sc.nextInt();
		int max;
		max = (n1>n2)?(n1>n3? n1:n3):(n2>n3? n2:n3);
		System.out.println(max);
		
sc.close();
	}

}