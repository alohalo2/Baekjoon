import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {

    		StringTokenizer st = new StringTokenizer(br.readLine());
    		BigInteger mulPrime = new BigInteger(st.nextToken());
    		BigInteger basedNum = new BigInteger(st.nextToken());
    		BigInteger smallPrime = new BigInteger("1");
    		
    		while(true) {
    			if (smallPrime.compareTo(basedNum) == 1 || smallPrime.compareTo(basedNum) == 0) {
    				bw.write("GOOD\n");
    				bw.flush();
    				bw.close();
    				break;  // 프로그램 종료
    			}
    			
    			smallPrime = smallPrime.add(BigInteger.ONE);
    			
    			//BigInteger I.compareTo(BigInteger J) == 1 => I > J
    			//BigInteger I.compareTo(BigInteger J) == 0 => I == J
    			//BigInteger I.compareTo(BigInteger J) == -1 => I < J
    			
    			if(mulPrime.remainder(smallPrime).compareTo(BigInteger.ZERO) == 0 && smallPrime.compareTo(basedNum) == -1) {
    				bw.write("BAD" + " " + smallPrime + "\n");
    				bw.flush();
    	            bw.close();
					break;
    			}
    		}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}