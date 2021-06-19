import java.util.Scanner;

public class Day6_Lets_Review {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // open scanner
		int noOfInput = scan.nextInt();
		for (int k = 0; k < noOfInput; k++) {
			String s = scan.next();
			char[] c = s.toCharArray();
			StringBuffer even = new StringBuffer();
			StringBuffer odd = new StringBuffer();
			for (int i = 0; i < c.length; i++) {
				if (i % 2 == 0) {
					even.append(c[i]);
				} else {
					odd.append(c[i]);
				}
			}
			System.out.println(even.toString() + " " + odd.toString());
		}
		scan.close(); // close scanner
	}
}
/*Input:
		2
		Hacker
		Rank
Output:
		Hce akr
		Rn ak*/