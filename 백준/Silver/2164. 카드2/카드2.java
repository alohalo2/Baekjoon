import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int N = Integer.parseInt(br.readLine());
			Queue<Integer> queue = new LinkedList<>();

			for (int i = 1; i <= N; i++) {
				queue.offer(i); // 값을 맨 뒤부터 추가
			}

			while (queue.size() > 1) {
				queue.poll(); // 첫 번째 값 제거
				queue.offer(queue.poll()); // 다음 값을 제거 후 제거한 값을 맨 뒤에 추가
			}

			System.out.println(queue.peek()); // 앞에부터 요소 조회

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}