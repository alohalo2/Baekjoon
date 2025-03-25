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
		int r = 31;
		int mod = 1234567891;

		for (int i = 0; i < L; i++) {
			int charValue = input.charAt(i) - 'a' + 1;
			long term = (charValue * powMod(r, i, mod)) % mod;
			sum = (sum + term) % mod;
		}

		return (int) sum;
	}

	public static long powMod(int r, int range, int mod) {
		long result = 1;

		for (int i = 0; i < range; i++) {
			result = (result * r) % mod;
		}

		return result;
	}
}