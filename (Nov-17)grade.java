
import java.util.Scanner;

public class grade{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks:");
		int n = sc.nextInt();
		if(n<50){
			System.out.println("Fail");
		}
		else if(n>49 && n<60) {
			System.out.println("D grade");
		}
		else if(n>59 && n<70) {
			System.out.println("C grade");
		}
		else if(n>69 && n<80) {
			System.out.println("B grade");
		}
		else if(n>79 && n<90) {
			System.out.println("A grade");
		}
		else if(n>89 && n<=100) {
			System.out.println("A+ grade");
		}
        sc.close();
	}

}