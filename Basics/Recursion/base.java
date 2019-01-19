/*
	@Author - Sachin Kr. Shukla
	@Date - 19 Jan, 2019
	About - Recursion in java - Factorial of a number
*/
import java.util.Scanner;
public class base{
	public static int fact(int n){
		if(n <= 1){
			return 1;
		}
		else{
			return (n * fact (n - 1));
		}
	}





	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a variable : ");
		int userInput = scan.nextInt();

		base a = new base();
		int x = a.fact(userInput);
		System.out.println("The answer is " + " " + x);
	}
}