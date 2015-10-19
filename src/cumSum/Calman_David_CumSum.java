package cumSum;
import java.util.Scanner;
public class Calman_David_CumSum {
	public static Scanner stdin = new Scanner(System.in);
	public static void main(String[] args) {
		int total = cumSum();
		System.out.println("Sum of numbers: "+total);
	}
	public static int cumSum() { // returns cumulative sum of integers
		int sum = 1; // -1 will always be added, so init sum to 1
		int num = -1; // so that num is within scope for while clause
		System.out.println("Please input a list of numbers followed by -1:");
		do {
			num = stdin.nextInt(); // get number from console
			sum += num; // and add it to sum
		} while(num!=-1); // while number isn't -1 (sentinel)
		return sum;
	}
}
