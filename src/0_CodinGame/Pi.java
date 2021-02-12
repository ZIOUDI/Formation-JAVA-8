
public class Pi {

	static double approx(double[][] pts) {
		double ptsTombes = 0;

		while (pts != null) { // Test pts non null

			for (int i = 0; i < pts.length; i++) {
				double x = pts[i][0];
				double y = pts[i][1];

				if ((x * x + y * y) <= 1)
					ptsTombes++;

			}
			return 4 * (ptsTombes / pts.length);
		}
		return 0;
	}

	public static void main(String[] args) {
		double[][] rands = new double[1000000][2];
		for (int i = 0; i < rands.length; i++) {
			rands[i][0] = Math.random(); // x
			rands[i][1] = Math.random(); // y
		}
		System.out.println(Pi.approx(rands));
	}
}
