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
        	int result = 0;
        	
//        	접근 방법 : 창문이 열리는 수를 찾기(약수의 개수가 홀수인 수) / ex) 열고 - 닫고 - 열고       	
//        	n번째 창문이 열려 있으려면, 그 창문을 열고 닫은 횟수가 홀수여야한다.
//        	n = 4일 경우,
//        	첫번째 사람, 두번째 사람, 네번째 사람이 네번째 문을 열고 닫고 연다.
//        	n = 9일 경우,
//        	첫번째 사람, 세번째 사람, 아홉번째 사람이 9번째 문을 열고 닫고 연다.
//        	즉, 약수의 갯수가 3인 n번째 창문이 열려 있다.
//        	따라서 1, 4, 9, 16, 25 .... 를 기점으로 열린 창문의 갯수가 하나씩 증가하는 것을 알 수 있다.

        	for(int i = 1; i * i <= N; i++) {
        		result++;
        	}
        	
        	bw.write(result + "\n");
 
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}