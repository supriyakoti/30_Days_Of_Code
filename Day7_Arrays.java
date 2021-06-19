import java.util.Scanner;

public class Day7_Arrays {
	
	private static final Scanner scanner = new Scanner(System.in);

	private static void reverseArray(int[] arr) {
		for (int i = arr.length; i > 0; i--) {
			System.out.print(arr[i - 1] + " ");
		}
	}

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		reverseArray(arr);
		scanner.close();
	}
}
/*Input:
		4
		1 4 3 2
Output:
 		2 3 4 1*/