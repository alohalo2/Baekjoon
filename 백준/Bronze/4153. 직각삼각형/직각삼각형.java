import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			while (true) {

				String[] userInput = br.readLine().split(" ");
				int A = Integer.parseInt(userInput[0]);
				int B = Integer.parseInt(userInput[1]);
				int C = Integer.parseInt(userInput[2]);
				int maxLength = 0, remainDiv = 0;

				if (A == 0 && B == 0 && C == 0) {
					break;
				}

				if (A < B) {
					if (B < C) {
						maxLength = C;
						remainDiv = A * A + B * B;
					} else {
						maxLength = B;
						remainDiv = A * A + C * C;
					}
				} else {
					maxLength = A;
					remainDiv = C * C + B * B;
				}

				if (maxLength * maxLength == remainDiv) {
					System.out.println("right");
				} else {
					System.out.println("wrong");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}