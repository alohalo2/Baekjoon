import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int N = Integer.parseInt(br.readLine());

			int result = -1;
			for (int i = N / 5; i >= 0; i--) { 
				int remain = N - (i * 5);
				if (remain % 3 == 0) {
					int j = remain / 3;
					result = i + j;
					break; 
				}
			}

			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}