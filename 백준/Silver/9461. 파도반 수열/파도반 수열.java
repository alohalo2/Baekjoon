import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
             
        try {
        	
//        	접근 방법 : 피보나치 수를 이해하고 문제에 적용
        	
//        	피보나치 수(영어: Fibonacci numbers)는 첫째 및 둘째 항이 1이며 
//		        	그 뒤의 모든 항은 바로 앞 두 항의 합인 수열이다. 
//		        	처음 여섯 항은 각각 1, 1, 2, 3, 5, 8이다. 
//		        	편의상 0번째 항을 0으로 두기도 한다.
        	
            // 테스트 케이스의 수를 읽어들임
            int T = Integer.parseInt(br.readLine()); 
            int[] inputN = new int[T]; // 각 테스트 케이스의 N을 저장할 배열

            // 각 테스트 케이스의 N을 읽어들임
            int maxN = 0; // N의 최대값을 저장할 변수
            for (int i = 0; i < T; i++) {
                inputN[i] = Integer.parseInt(br.readLine());
                if (inputN[i] > maxN) {
                    maxN = inputN[i]; // 최대값 갱신
                }
            }

            // 최대값을 기준으로 피보나치 수열 배열 생성
            long[] fibArr = new long[maxN];

            // 피보나치 수열 초기값 설정
            if (maxN > 0) fibArr[0] = 1;
            if (maxN > 1) fibArr[1] = 1;
            if (maxN > 2) fibArr[2] = 1;

            // 최대값까지 피보나치 수열 계산
            for (int j = 3; j < maxN; j++) {
                fibArr[j] = fibArr[j - 3] + fibArr[j - 2];
            }

//            for(int i = 0; i < maxN; i++) {
//            	bw.write("fibArr[" + i + "]:" + fibArr[i] + " ");
//            }
            
            // 각 테스트 케이스 결과 출력
            for (int i = 0; i < T; i++) {
                long N = inputN[i];
                bw.write(fibArr[(int) (N - 1)] + "\n");
            }

            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}