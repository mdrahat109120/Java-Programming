import java.util.Scanner;

public class loop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxVal=0,i;
        for(i=1; i<=5; i++)
        {
          System.out.println("enter a number");
          int num = sc.nextInt();
          if (i==0){
            maxVal=num; 
          }
          else
          {
            if(num>maxVal){
              maxVal=num;
            }
           }
        }
        System.out.println(maxVal+"is the largest");
        
    }
}

        