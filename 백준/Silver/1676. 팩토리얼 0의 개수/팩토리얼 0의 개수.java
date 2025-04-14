import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int num = Integer.parseInt(br.readLine());
			
			System.out.println(countZeros(num));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int countZeros(int n) {
		int count = 0;
		while(n >= 5) {
			count += n / 5;
			n /= 5;
		}
		return count;
	}
}