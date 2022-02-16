import java.util.Scanner;
public class NumberSix {

	
		// TODO Auto-generated method stub
		    public static void main(String args[]) { //forgot to add main
		     Scanner scan = new Scanner(System.in);
		     System.out.println("please enter a number");
		     
		     int num = scan.nextInt(), i = 2;
		     boolean flag = false;
		     while (i <= num / 2) {
		       // condition for nonprime number
		       if (num % i == 0) {
		         flag = true;
		         break;
		       }

		       ++i;
		     }

		     if (!flag)
		       System.out.println(num + " is a prime number.");
		     else
		       System.out.println(num + " is not a prime number.");
		   }
		 
		     
		     
		     
		     
		    }
