import java.util.Scanner;

public class MaxTerenary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter another number: ");
		int n2 = sc.nextInt();
		int max;
		
		max = n1>n2? n1:n2;
		System.out.println(max);

	}

}