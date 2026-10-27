import java.util.Scanner;
public class prog5  
{
  public static void main(String[]args)
  { 
    Scanner sc = new Scanner(System.in);
   System.out.println("enter a number");
   int num = sc.nextInt();
   if(num>10)
   {
   System.out.println(num+"greater than 10");
    }
   else if(num<10)
   {
     System.out.println(num+"less than 10");
   }
   else
   {
     
     System.out.println("Number is equal to 10");
   }
   sc.close();
    }
   }
 
