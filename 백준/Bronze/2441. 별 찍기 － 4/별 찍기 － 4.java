import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			int N = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(j >= i) {
						bw.write("*");
					} else {
						bw.write(" ");
					}
				}
				bw.newLine();
			}

			bw.flush();
			bw.close();
		} catch (Exception e) {
			
		}
		
	}

}