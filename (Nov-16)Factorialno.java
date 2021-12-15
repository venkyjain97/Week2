import java.util.Scanner;
public class Factorialno{

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
			System.out.print("Enter the number = ");
			int n=sc.nextInt();
			long fact=1;
			if(n==0) {
				System.out.println(fact);
			}
			else {
				do {
					 fact*= n;
						n--;
				} while(n>0);
				System.out.println(fact);
			}
			System.out.print("Do you want to continue (Y/N) : ");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

	    sc.close();
	}
}