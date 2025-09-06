package in.co.rays.basic;

public class HramonicSeries {
	public static void main(String[] args) {

		int n = 5; // Kitne terms tak chahiye
		double sum = 0.0;

		System.out.println("Harmonic Series up to " + n + " terms:");

		for (int i = 1; i <= n; i++) {
			sum += (1.0 / i);
			System.out.print("1/" + i);

			if (i != n) {
				System.out.print(" + ");
			}
		}

		System.out.println("\nSum of Harmonic Series = " + sum);

	}
}
