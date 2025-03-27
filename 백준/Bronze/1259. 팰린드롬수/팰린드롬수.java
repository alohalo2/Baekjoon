import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			while(true) {
				String userInput = br.readLine();
				
				if(userInput.equals("0")) break;
				
				System.out.println(check(userInput));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String check(String userInput) {
	    int len = userInput.length();
	    
	    for (int i = 0; i < len / 2; i++) {
	        if (userInput.charAt(i) != userInput.charAt(len - 1 - i)) {
	            return "no";
	        }
	    }
	    return "yes";
	}
}