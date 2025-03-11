import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] intArry = new int[5];

		for (int i = 0; i < intArry.length; i++) {
			intArry[i] = sc.nextInt();
		}

		int result = Arrays.stream(intArry)
				.map(n -> n * n)
				.sum();

		System.out.println(result % 10);
	}
}