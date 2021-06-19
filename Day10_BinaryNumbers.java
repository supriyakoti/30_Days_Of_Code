import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10_BinaryNumbers {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int max = 0, count = 0;
        
        while (n > 0) {
            if(n % 2 == 1) {
                count++;
            } else {
                count = 0;
            }
            if(max < count) {
                max = count;
            }
            n = n/2;
        }
        System.out.println(max);
        bufferedReader.close();
    }
}
/*Input:
		5
		6
Output:
 		1 - The binary representation of 5(10) is 101(2), so the maximum number of consecutive 1's is 1.
		2 - The binary representation of 6(10) is 110(2), so the maximum number of consecutive 1's is 2.
 */