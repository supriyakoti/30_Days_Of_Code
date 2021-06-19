import java.util.Scanner;

class Person {
	private int age;

	public Person(int initialAge) {
		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			age = 0;
		} else {
			age = initialAge;
		}

	}

	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");
		} else if (13 <= age && age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}

	public void yearPasses() {
		// Increment this person's age.
		age = age + 1;
	}
}

public class Day4_ClassvsInstance {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int T = sc.nextInt();
			for (int i = 0; i < T; i++) {
				int age = sc.nextInt();
				Person p = new Person(age);
				p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();
				}
				p.amIOld();
				System.out.println();
			}
			sc.close();
		}
}
/*Input:
		4
		-1
		10
		16
		18
Output:
 		Age is not valid, setting age to 0.
		You are young.
		You are young.
		You are young.
		You are a teenager.
		You are a teenager.
		You are old.
		You are old.
		You are old. */