// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
			// Reciving inputs
			int maxNumbers = Integer.parseInt(args[0]);
			String mode = args[1];

			//main loop
			for (int i = 1; i < maxNumbers + 1; i++) {
				int count = 0;
				int seed = 1;
				String answer = "";
				// dividing or muntiplis
				while (seed != 1 && i != 1) {
					answer = answer + seed + " ";
					if (seed % 2 == 0) {
						seed = seed / 2;
					} else {
						seed = (seed * 3) + 1;
					}
					count++;
				}
				if (mode.equals("v")) {
					System.out.println(answer + "(" + count + ")");
				
			}
			//summery line
			System.out.println("Every one of the first " + maxNumbers +
								" hailstone sequences reached 1.");
		}
	}
}
