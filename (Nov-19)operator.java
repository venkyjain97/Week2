
import java.util.Scanner;
public class operator{
    public static double abc(int x,int y,char sym)
	
	{
		double sum=0;
		if(sym == '*')
		{
			sum=x*y;
		}
		else if(sym == '/')
		{
            sum=((float)x)/y;
			
		}
		else if(sym == '+')
		{
			sum=x+y;
		}
		else if(sym == '-')
		{
            sum=x-y;
        }	
		else
		{
			System.out.println(" operator not exits ");
		}
		return sum;
	}

	public static void main(String[] args)
    
    {
		Scanner sc = new Scanner(System.in);
		char sym;
		int x,y;
		double sum;
		
		System.out.println("1. Enter '*' for multiplication\n2. Enter '/' for division\n3. Enter '+' for addition\n4. Enter '-' for substraction");
		System.out.print("choice any one :");
		sym = sc.next().charAt(0);
		System.out.println("Enter the first number");
		x = sc.nextInt();

        System.out.println("Enter the second number");
        y = sc.nextInt();
		sum=abc(x,y,sym);
		System.out.println(x+ " "  +sym+  " " +y+ " = "+sum);
		sc.close();
	}

}