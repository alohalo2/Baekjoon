import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int N = Integer.parseInt(br.readLine());
			String userInput = br.readLine();
			
			System.out.println(average(N, userInput));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static double average(int N, String userInput) {
		double [] scores = new double[N];
		double max = 0;
		double sum = 0;
		
	    String[] tokens = userInput.split(" ");

	    for (int i = 0; i < N; i++) {
	        scores[i] = Double.parseDouble(tokens[i]);
	        if (scores[i] > max) {
	            max = scores[i];
	        }
	    }

	    for (int i = 0; i < N; i++) {
	        sum += (scores[i] / max) * 100;
	    }

	    return sum / N;
	}
}