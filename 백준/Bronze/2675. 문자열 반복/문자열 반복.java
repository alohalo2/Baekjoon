import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int testCase = Integer.parseInt(br.readLine());
			
			while(testCase > 0) {
				
				String[] userInput = br.readLine().split(" ");
				
				int repetition = Integer.parseInt(userInput[0]);
				
				String[] strArry = userInput[1].split("");
				
				for(int i = 0; i < strArry.length; i++) {
						strArry[i] = strArry[i].repeat(repetition);
				}
				
				String result = String.join("", strArry);
				
				System.out.println(result);
				
				testCase--;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}