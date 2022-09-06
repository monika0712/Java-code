import java.util.*;
class CheckEvenOdd
{
    public static void main(String[] args) 
    {
        //int n;

        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check even or odd:");
        int n = sc.nextInt();
        
      if(n % 2 == 0)
        {
            System.out.println(" Even number");
        }
        else
        {
            System.out.println(" Odd number");
	}
    }
}