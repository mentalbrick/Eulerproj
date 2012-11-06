/*

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

*/

public class Sumsofmultiples3x5below1000 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//All else are multiples of 3 & 5
		//3x1,3x2,3x3 below 1000 etc.
		//3 variables: sum, max, # your multiplying from
		// for loop with two nested if statements to see below 1k
		
		final int MAX = 1000;
		int sum = 0;
		for (int i = 1; i <= MAX; i++)
		{
			if (i%3 == 0 && i%5 == 0)
				sum += i;
			else	if (i%3 == 0)
				sum += i;
			else if (i%5 == 0)
				sum += i;
		
		}
		System.out.println(sum);
	}
}
