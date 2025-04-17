import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int height = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			String[][] wbArry = new String[height][width];

			// WB 문자 그대로 이차원 배열에 담기
			for (int i = 0; i < height; i++) {
				String[] lineWBArry = br.readLine().split("");
				for (int j = 0; j < width; j++) {
					wbArry[i][j] = lineWBArry[j];
				}
			}

			for (int i = 0; i <= height - 8; i++) {
				for (int j = 0; j <= width - 8; j++) {
					int repaint = repaintCount(wbArry, i, j);
					min = Math.min(min, repaint);
				}
			}

			System.out.println(min);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int repaintCount(String[][] wbArry, int x, int y) {
		int count1 = 0; // 'W' 시작
		int count2 = 0; // 'B' 시작

		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				char expected1 = ((i + j) % 2 == 0) ? 'W' : 'B';
				char expected2 = ((i + j) % 2 == 0) ? 'B' : 'W';

				if (!wbArry[i][j].equals(String.valueOf(expected1)))
					count1++;
				if (!wbArry[i][j].equals(String.valueOf(expected2)))
					count2++;
			}
		}

		return Math.min(count1, count2);
	}
}