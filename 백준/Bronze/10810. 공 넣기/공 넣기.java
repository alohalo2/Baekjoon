import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] intArr = new int[N];

		for (int i = 0; i < N; i++) {
			intArr[i] = 0;
		}

		for (int i = 0; i < M; i++) {

			int I = sc.nextInt();
			int J = sc.nextInt();
			int K = sc.nextInt();

			for (int j = I - 1; j < J; j++) {
				intArr[j] = K;
			}

		}

		for (int i = 0; i < N; i++) {
			System.out.print(intArr[i] + " ");
		}
	}
}