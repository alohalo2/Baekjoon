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
            
        	int M = Integer.parseInt(br.readLine());
        	int[] intArr = {1, 0, 0};
        	
        	for(int i = 0; i < M; i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine());
        		int firstCupNum = Integer.parseInt(st.nextToken()) - 1;
        		int secondCupNum = Integer.parseInt(st.nextToken()) - 1;
        		int temp = 0;
        		
        		temp = intArr[firstCupNum];
        		intArr[firstCupNum] = intArr[secondCupNum];
        		intArr[secondCupNum] = temp;
        		
        	}
        	for(int i = 0; i < intArr.length; i++) {
        		if(intArr[i] == 1) {
        			bw.write((i+1) + "\n");
        		}
        	}

            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}