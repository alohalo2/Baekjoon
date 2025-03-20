import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			String userInput = br.readLine().toLowerCase();
			
			int[] resultArry = new int[26];

			Arrays.fill(resultArry, -1);
			
			for(int i = 0; i < userInput.length(); i++) {
				char ch = userInput.charAt(i);
				int index = ch - 'a';
				
				if(resultArry[index] == -1) {
					resultArry[index] = i;
				}
			}
			
			for (int i : resultArry) {
				System.out.print(i + " ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}