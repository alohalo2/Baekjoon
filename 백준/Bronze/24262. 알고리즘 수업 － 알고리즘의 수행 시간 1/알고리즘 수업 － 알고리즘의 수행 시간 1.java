import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			bw.write(1 + "\n");
			bw.write(0 + "\n");
			
			bw.flush();
			bw.close();
		} catch (Exception e) {
			
		}
		
	}

}