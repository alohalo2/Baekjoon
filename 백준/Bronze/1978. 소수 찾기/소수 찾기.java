import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String firstLine = br.readLine();
			int N = Integer.parseInt(firstLine);
			
			String secondLine = br.readLine();
			String[] strArr = secondLine.split(" ");
			
			int[] numArr = new int[N];
            int primeCount = 0; // 소수 개수 카운트

            // 입력된 숫자를 배열에 저장
            for (int i = 0; i < N; i++) {
                numArr[i] = Integer.parseInt(strArr[i]);
            }

            // 소수 판별 및 출력
            for (int i = 0; i < N; i++) {
                if (isPrime(numArr[i])) {
                    primeCount++;
                }
            }

            bw.write(primeCount + "\n");
            
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 소수 판별 함수
	public static boolean isPrime(int num) {
	    if (num < 2) return false; // 2보다 작은 수는 소수가 아님
	    for (int i = 2; i <= num / 2; i++) { // 숫자의 절반까지만 확인
	        if (num % i == 0) return false; // 나누어 떨어지면 소수가 아님
	    }
	    return true; // 소수일 경우 true 반환
	}
}