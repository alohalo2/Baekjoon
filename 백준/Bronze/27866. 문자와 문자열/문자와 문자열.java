import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String userStringInput = br.readLine();
			int userIntInput = Integer.parseInt(br.readLine());
			
			Character[] charArry = new Character[userStringInput.length()];
			
			for(int i = 0; i < userStringInput.length(); i++) {
				charArry[i] = userStringInput.charAt(i);
			}
			
			bw.write(charArry[userIntInput - 1]);
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}