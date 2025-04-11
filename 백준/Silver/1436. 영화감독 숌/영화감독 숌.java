import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int userInput = Integer.parseInt(br.readLine());
			int count = 0;
	        int num = 666;

	        while (true) {
	            if (Integer.toString(num).contains("666")) {
	                count++;
	                if (count == userInput) {
	                    System.out.println(num);
	                    break;
	                }
	            }
	            num++;
	        }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}