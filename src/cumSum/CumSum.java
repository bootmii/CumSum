package cumSum;
import java.util.Scanner;
public class CumSum {
	public static Scanner stdin = new Scanner(System.in);
	public static int cumSum() { // returns cumulative sum of integers
		int sum = 1; // since -1 will always be added to t
		int num = -1;
		do {
			num = stdin.nextInt();
			sum += num;
		} while(num!=-1);
	}
}
