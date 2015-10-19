package cumSum;

import java.util.*;

public class EvenOddThing {
	public static Scanner stdin = new Scanner(System.in);

	public static void main(String[] args) {

	}

	public static ArrayList<Integer> getNumsFromConsole() {
		// Integer necessary because ArrayList<int> is illegal
		ArrayList<Integer> result = new ArrayList<Integer>();
		System.out.println("Enter numbers followed by -1:");
		Integer num = -1; // didn't know you could do that
		/*
		 * This do statement ensures the while comparison is at the end, when
		 * num has the chance to be the valued entered into stdin. It also
		 * ensures that the last value of the array becomes -1, which is why we
		 * remove it in the final line of the method.
		 */
		do {
			num = stdin.nextInt(); // assign to num integer from console
			result.add(num); // append num to result
		} while (num.compareTo(-1) != 0); // while sentinel isn't there
		result.remove(result.size() - 1); // remove final -1 (sentinel)
		return result;
	}

	public static ArrayList<Integer> removeOdds(ArrayList<Integer> ints) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < ints.size(); i++)
			if (ints.get(i) % 2 == 0)
				result.add(ints.get(i));
		// for each element of ints, if it's even, add it to result
		return result;
	}
}