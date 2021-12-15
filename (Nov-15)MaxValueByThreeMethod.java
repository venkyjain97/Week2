import java.util.Scanner;

public class MaxValueByThreeMethod {
	
	public static char maxvalue(int a, int b) {
		char ch;
		if(a>b) {
			ch = 'a';
		}
		else {
			ch = 'b';
		}
		return ch;
	}
	
	public static char maxvalue(int a,int b,int c) {
		char ch;
		if(a>b && a>c) {
			ch = 'a';
		}
		else if(b>a && b>c) {
			ch = 'b';
		}
		else{
			ch = 'c';
		}
		return ch;
	}
	
	public static char maxvalue(int a,int b,int c,int d) {
		char ch;
		if(a>b && a>c && a>d) {
			ch = 'a';
		}
		else if(b>a && b>c && b>d) {
			ch = 'b';
		}
		else if(c>a && c>b && c>d) {
			ch = 'c';
		}
		else {
			ch = 'd';
		}
		return ch;
	}

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		
        char f ;
        do
     {
		int i;
		System.out.print("How many inputs are you entered for find max value(2/3/4): ");
		i = userinput.nextInt();
		
		if(i == 2) {
			System.out.print("Enter the first integer number a : ");
			int a = userinput.nextInt();
			System.out.print("Enter the second Integer number b : ");
			int b = userinput.nextInt();
			System.out.println("your max value is : " + maxvalue(a,b));
		}
		else if(i == 3) {
			System.out.print("Enter the first integer number a : ");
			int a = userinput.nextInt();
			System.out.print("Enter the second integer number b : ");
			int b = userinput.nextInt();
			System.out.print("Enter the third integer number c : ");
			int c = userinput.nextInt();
			System.out.println("your max value is : " + maxvalue(a,b,c));
		}
		else if(i == 4) {
			System.out.print("Enter the first integer number a : ");
			int a = userinput.nextInt();
			System.out.print("Enter the second integer number b : ");
			int b = userinput.nextInt();
			System.out.print("Enter the third integer number c : ");
			int c = userinput.nextInt();
			System.out.print("Enter the fourth integer number d : ");
			int d = userinput.nextInt();
			System.out.println("your max value is : " + maxvalue(a,b,c,d));
		}
		else {
			System.out.println("You press invalid number");
		}
        System.out.println(" if you want to continue again then type 'y' or 'Y' = ");
        f = userinput.next().charAt(0);
     }
        while (f=='y' || f=='Y');

	}

}