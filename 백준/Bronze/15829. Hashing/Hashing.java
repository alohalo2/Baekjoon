import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int L = Integer.parseInt(br.readLine());

			String input = br.readLine();

			System.out.println(hashFunction(L, input));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int hashFunction(int L, String input) {

		long sum = 0;
		long r = 31;
		long mod = 1234567891;

		for (int i = 0; i < L; i++) {
			int charValue = input.charAt(i) - 'a' + 1;
			sum += (charValue * Math.pow(r, i)) % mod;
		}

		return (int) sum;
	}
}