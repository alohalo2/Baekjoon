import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			String[] userInput = br.readLine().split(" ");
			
			int N = Integer.parseInt(userInput[0]);
			int K = Integer.parseInt(userInput[1]);
			
			System.out.println(calc(N, K));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static int calc(int n, int k) {
		return factorial(n) / (factorial(k) * factorial(n-k));
	}
	
	public static int factorial(int num) {
		if(num == 0 || num == 1)return 1; 
		return num *= (factorial(num - 1));
	}
}