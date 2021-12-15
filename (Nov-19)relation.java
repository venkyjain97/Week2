import java.util.Scanner;
public class relation{
	
  
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int x,y;

       
        System.out.println("Enter x(number) and y(number) :");
        x=sc.nextInt();
        y=sc.nextInt();
        relationship(x,y);
        sc.close();	

    }
    public static void relationship(int x,int y)
    {
        if(x==y)
        {
            System.out.print(x+" equal to "+y);
        }
        else

        {
         

            System.out.print(x+"  not equal to "+y+" and= ");
            if
               (x<y)// nested if else 
            {
            System.out.println(x+" is less than "+y);
            }
            else
            {
             System.out.println(x+" is greater than "+y);	
            }	
        }
    
    }

}