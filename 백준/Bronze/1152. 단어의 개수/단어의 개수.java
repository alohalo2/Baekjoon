import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
             
        try {
        	
        	// 공백만 주어지거나 빈 문자열일 경우 0을 반환해야함
        	
        	String str = br.readLine().trim();
        	
        	if(str.isEmpty()) {
        		bw.write(0 + "\n");
        	} else {
        		StringTokenizer st = new StringTokenizer(str);
        		bw.write(st.countTokens() + "\n");
        	}
        	
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}