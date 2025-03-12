import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int userInput = Integer.parseInt(br.readLine()); // 정수 입력받기

			for (int i = 1; i <= userInput; i++) { // 1부터 userInput까지 출력
				bw.write(i + "\n");
			}

			br.close();
			bw.flush();
			bw.close();

		} catch (Exception e) {
			e.printStackTrace(); // 예외 발생 시 로그 출력
		}
	}
}