import java.util.Scanner;

public class task3_1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter quantity:");
      int n = sc.nextInt();
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int sum = 0;
      for(int i=1; i<=n; i++)
      {
        int num = sc.nextInt();
        if(num>max){
          max=num;
        }
        if(num<min){
        min=num;
        }
        sum=sum+num;
      }
       double avg =(double)sum/n;
      
        System.out.println("Maxmum " +max);
        System.out.println("Minimum " +min);
        System.out.println("Average is " +avg);
    }
    }
   
       