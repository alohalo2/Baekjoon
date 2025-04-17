import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int N = Integer.parseInt(br.readLine());
			List<int[]> intArryList = new ArrayList<>();
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int[] intArry = new int[2];
				intArry[0] = Integer.parseInt(st.nextToken());
				intArry[1] = Integer.parseInt(st.nextToken());
				intArryList.add(intArry);
			}

			intArryList.sort(
					Comparator.comparingInt((int[] num) -> num[0])
							.thenComparingInt(num -> num[1]));

			for (int i = 0; i < N; i++) {
				sb.append(intArryList.get(i)[0]).append(" ").append(intArryList.get(i)[1]).append("\n");
			}

			System.out.println(sb);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
