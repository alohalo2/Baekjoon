import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int N = Integer.parseInt(br.readLine());
			String[] nStrArry = br.readLine().split(" ");
			int[] NArry = new int[N];

			for (int i = 0; i < N; i++) {
				NArry[i] = Integer.parseInt(nStrArry[i]);
			}

			int M = Integer.parseInt(br.readLine());
			String[] mStrArry = br.readLine().split(" ");
			int[] MArry = new int[M];

			for (int i = 0; i < M; i++) {
				MArry[i] = Integer.parseInt(mStrArry[i]);
			}

			StringBuilder sb = new StringBuilder();
			Set<Integer> set = new HashSet<>();
			for (int num : NArry)
				set.add(num);

			for (int num : MArry) {
				sb.append(set.contains(num) ? 1 : 0).append("\n");
			}
			System.out.println(sb);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}