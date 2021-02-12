
public class ChangeMoney {

	    public static void main(String[] args) {
		// Arrays to perform tests
		long[] tests = { 1, 17, 22, 29,6 };

		for (long s : tests) {
		    Change m = Solution.optimalChange(s);
		    Solution.printResult(m, s);
		}
	    }
	}

	// Do not modify Change
	class Change {
	    long coin2 = 0;
	    long bill5 = 0;
	    long bill10 = 0;
	}
	class Solution {

	    static void printResult(Change m, long s) {
		if (m == null)
		    System.out.println("impossible de faire le change de " + s );
		else {
		    System.out.println("Coin(s)  2€: " + m.coin2);
		    System.out.println("Bill(s)  5€: " + m.bill5);
		    System.out.println("Bill(s) 10€: " + m.bill10);
		}
	    }

	    // Do not modify this method​​​​​​​‌‌‌‌‌​​‌‌​‌‌‌‌​​‌​‌​​‌‌‌ signature
	    static Change optimalChange(long s) {

		// Integral values
		long rest = 0;
		long NbrOfBill10 = 0;
		long NbrOfBill5 = 0;
		long NbrOfCoin2 = 0;

		NbrOfBill10 = s / 10;
		rest = s % 10;

		NbrOfBill5 = rest / 5;
		rest = rest % 5;

		if (rest >= 2) {
		    NbrOfCoin2 = rest / 2;
		    rest = rest % 2;
		}

		System.out.println("------------------------");
		System.out.println("Somme à changer ==> " + s);
		System.out.println("NbrOfCoin2  2€: " + NbrOfCoin2);
		System.out.println("NbrOfBill5  5€: " + NbrOfBill5);
		System.out.println("NbrOfBill10 10€: " + NbrOfBill10);

		System.out.println("rest : " + rest);

		// return null if change cannot be rendered
		if (rest != 0)
		    return null;

		Change change = new Change();
		change.coin2 = NbrOfCoin2;
		change.bill5 = NbrOfBill5;
		change.bill10 = NbrOfBill10;
		return change;
	    }

}
