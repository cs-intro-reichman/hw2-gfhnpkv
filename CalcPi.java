// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Reciving the inputs
		int terms = Integer.parseInt(args[0]);

		// Printing the java pi
		System.out.println("pi according to Java: " + Math.PI);

		// Calculating pi
		double myPi = 1.0;
		boolean plus = false;
		int count = terms;
		int i = 3;
		while (count != 0) {
			if (plus) {
				myPi = myPi + (1 / i);
			} else {
				myPi = myPi - (1 / i);
			}
			plus = !plus;
			i = i + 2;
			count = count - 1;
		}

		// Printing my Pi
		System.out.println("pi, approximated:     " + (myPi * 4));

	}
}
