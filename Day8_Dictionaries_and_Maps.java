import java.util.HashMap;
import java.util.Scanner;

public class Day8_Dictionaries_and_Maps {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			hm.put(name, Integer.valueOf(phone));
		}
		while (in.hasNext()) {
			String s = in.next();
			if (hm.containsKey(s)) {
				System.out.println(s + "=" + hm.get(s).intValue());
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
/*Input:
	3
	sam 99912222
	tom 11122222
	harry 12299933
	sam
	edward
	harry
Output:
	sam=99912222
	Not found
	harry=12299933*/