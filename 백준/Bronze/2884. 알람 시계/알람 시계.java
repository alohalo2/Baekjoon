import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		if (H <= 23 && M <= 59) {

			if (H != 0) {
				if (M < 45) {
					System.out.println((H - 1) + " " + (60 - 45 + M));
				} else if (M >= 45) {
					System.out.println(H + " " + (M - 45));
				}
			} else {
				if (M < 45) {
					System.out.println((H + 23) + " " + (60 - 45 + M));
				} else if (M >= 45) {
					System.out.println(H + " " + (M - 45));
				}
			}
		}

	}

}