import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			StringBuilder sb = new StringBuilder();

			int N = Integer.parseInt(br.readLine());

			List<Big> bigs = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				String[] str = br.readLine().split(" ");
				int weight = Integer.parseInt(str[0]);
				int height = Integer.parseInt(str[1]);
				bigs.add(new Big(weight, height));
			}

			for (int i = 0; i < N; i++) {
				int index = i;
				sb.append(countGreaterPoints(bigs, index) + 1).append(" ");
			}

			System.out.println(sb);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int countGreaterPoints(List<Big> bigs, int index) {
		int count = 0;
		Big base = bigs.get(index);

		for (int i = 0; i < bigs.size(); i++) {
			if (i == index)
				continue;

			Big other = bigs.get(i);

			// base가 다른 점보다 크면 +1
			if (base.compareToBig(other)) {
				count++;
			}
		}

		return count;
	}

}

class Big {
	int x, y;

	public Big(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean compareToBig(Big other) {
		if (this.x < other.x && this.y < other.y) {
			return true;
		} else {
			return false;
		}

	}
}