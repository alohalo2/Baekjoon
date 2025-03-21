import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int N = Integer.parseInt(br.readLine());
			int M = 0;
			
			for(int i = N - 9*String.valueOf(N).length(); i < N; i++) {
				int sum = i;
				int temp = i;
				
				while(temp > 0) {
					sum += temp % 10;
					temp /= 10;
				}
				
				if(sum == N) {
					M = i;
					break;
				}
			}
			
			System.out.println(M);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}