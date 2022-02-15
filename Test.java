import java.util.Scanner;

public class Test {


	public static void main(String[] args) {
		// 1 step 
		int[] array = new int[10];
		System.out.println("please enter 10 numbers to find the average");
		
		//2 step
		Scanner scan= new Scanner(System.in);
		for(int i = 0; i< array.length; i++) {
			array[i] = scan.nextInt();	
		}
		// 3 step
		int sum = 0;
		double average = 0d;
		for(int e : array) {
			sum = sum + e;
		}
		
		average = sum/array.length;
		System.out.println("The Average is: "+ average);
		
		
	}

}