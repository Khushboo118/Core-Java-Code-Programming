import java.util.Scanner;

class Conditional
{
 public static void main(String[] args)
  {
   Scanner scan =new Scanner(System.in);
   System.out.println("Press buttons from options(1-4).");
   
   int n = scan.nextInt();
   
   if(n==1)
    {
    System.out.println("addition is possible");
    }
    
    else if(n==2)
    {
    System.out.println("subtraction is possible");
    }

    
    else if(n==3)
    {
    System.out.println("multiplication is possible");
    }

    else if(n==4)
    {
    System.out.println("division is possible");
    }
   
    else
    {
    System.out.println("please press from options");
    }

  }
}