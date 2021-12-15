import java.util.Scanner;

public class Digit{
	public static String caldigits(int z) {
		String f;
		int n=0;
		
		while(z>0) {
			z=z/10;
			n++;
		}
		f="You have entered : "+n+" digit number";
		
		return f;	
	}
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	char m;
	do 
	{
	System.out.print("Enter number = ");
	int a=sc.nextInt();
	
	String r=caldigits(a);
	System.out.println(r);
	
	System.out.println("If you want to continue press 'Y' or 'Y'");
	 m=sc.next().charAt(0);
	 System.out.println();
	}
	while(m=='y' || m=='Y');
	sc.close();
}

}