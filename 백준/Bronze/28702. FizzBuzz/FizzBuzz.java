import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			String[] userInput = new String[3];
			
			for(int i = 0; i < userInput.length; i++) {
				userInput[i] = br.readLine();
			}
			
			System.out.println(compare(userInput[0], userInput[1], userInput[2]));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String compare(String a,String b, String c) {
		
		if(isNumeric(a)) {
			int num = Integer.parseInt(a);
			if ((num + 3) % 15 == 0) {
				return "FizzBuzz";
			} else if((num + 3) % 3 == 0) {
				return "Fizz"; 
			} else if((num + 3) % 5 == 0) {
				return "Buzz"; 
			} else {
				return (num + 3) + "";
			}
		} else if(isNumeric(b)) {
			int num = Integer.parseInt(b);
			if ((num + 2) % 15 == 0) {
				return "FizzBuzz";
			} else if((num + 2) % 3 == 0) {
				return "Fizz"; 
			} else if((num + 2) % 5 == 0) {
				return "Buzz"; 
			} else {
				return (num + 2) + "";
			}
		} else if(isNumeric(c)) {
			int num = Integer.parseInt(c);
			if ((num + 1) % 15 == 0) {
				return "FizzBuzz";
			} else if((num + 1) % 3 == 0) {
				return "Fizz"; 
			} else if((num + 1) % 5 == 0) {
				return "Buzz"; 
			} else {
				return (num + 1) + "";
			}
		} else {
			return "";
		}
	}
	
	public static boolean isNumeric(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}