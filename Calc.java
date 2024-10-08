import java.util.Scanner;

class Calc
{
 public static void main(String[] args)
  {
   Scanner scan =new Scanner(System.in);
   System.out.println("press form the options");
   
   int n1 =scan.nextInt();
   int n2 =scan.nextInt();
   int n3 =scan.nextInt();

   int sum = n1+n2+n3;
   double avg = sum/3.0;
   
   System.out.println("your required result is:"+avg);
  }
}  