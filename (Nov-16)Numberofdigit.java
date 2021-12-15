import java.util.Scanner;
public class Numberofdigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count=count+1;
        }
        if(count==1)
         System.out.println("Number of digit:1");
        else if(count==2)
        System.out.println("Number of digit:2");
        else if(count==3)
        System.out.println("Number of digit:3");
        else if(count>=4){
        System.out.println("Number is to high");
        System.out.println("Where number of digit is "+count);
        }

        sc.close();
    }
    
}