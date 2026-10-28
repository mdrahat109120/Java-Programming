import java.util.Scanner;
public class prog6  
{
  public static void main(String[]args)
  { 
    Scanner sc = new Scanner(System.in);
   System.out.println("enter a number");
   int num = sc.nextInt();
   if(num>0 && num%2==0)
   {
     System.out.println("the number is positive and even ");
   }
   else if(num>0 && num%2==1)
   {
     System.out.println("the number is positive and odd");
   }
   else
   {
    System.out.println("the number is negative"); 
   }
   sc.close();
    }
   }
 