import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int result = br.read();
			
			// bw.write(result)는 안되는 이유: br.read()로 읽으면 문자열을 
			// 아스키 코드로 읽는데 int인 result를 출력하면 아스키 코드를 다시 문자열로 변환해서 출력
			// 그러나 "\n"을 더해주면 문자열로 바뀌어 "아스키코드\n" 이렇게 출력되어 아스키 코드를 출력 가능
			bw.write(result + "\n");
//			bw.write(String.valueOf(result));
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}