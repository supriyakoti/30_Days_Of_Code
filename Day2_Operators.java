import java.util.Scanner;

public class Day2_Operators {

	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double tipD = meal_cost * tip_percent / 100;
		double taxD = meal_cost * tax_percent / 100;
		double totalD = meal_cost + tipD + taxD;
		System.out.println(Math.round(totalD));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double meal_cost = scanner.nextDouble();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tip_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int tax_percent = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		solve(meal_cost, tip_percent, tax_percent);

		scanner.close();
	}
}
/*Input:
	12.00
	20
	8
Output:
	15 */