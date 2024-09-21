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

            // 배열 선언
            int[] AWorkTimeArr = new int[3];
            int[] BWorkTimeArr = new int[3];
            int[] CWorkTimeArr = new int[3];

            // 첫 번째 줄 입력
            StringTokenizer st = new StringTokenizer(br.readLine());
            processWorkTime(st, AWorkTimeArr);
            
            // 두 번째 줄 입력
            st = new StringTokenizer(br.readLine());
            processWorkTime(st, BWorkTimeArr);
            
            // 세 번째 줄 입력
            st = new StringTokenizer(br.readLine());
            processWorkTime(st, CWorkTimeArr);

            // 결과 출력
            for (int j : AWorkTimeArr) {
                bw.write(j + " ");
            }
            bw.write("\n");
            
            // BWorkTimeArr 출력
            for (int j : BWorkTimeArr) {
                bw.write(j + " ");
            }
            bw.write("\n");
            
            // CWorkTimeArr 출력
            for (int j : CWorkTimeArr) {
                bw.write(j + " ");
            }
            bw.write("\n");

            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 작업 시간을 계산하는 메서드
    public static void processWorkTime(StringTokenizer st, int[] WorkTimeArr) {
        int inHour = Integer.parseInt(st.nextToken());
        int inMinute = Integer.parseInt(st.nextToken());
        int inSecond = Integer.parseInt(st.nextToken());
        int outHour = Integer.parseInt(st.nextToken());
        int outMinute = Integer.parseInt(st.nextToken());
        int outSecond = Integer.parseInt(st.nextToken());

        // 시간 차 계산
        WorkTimeArr[0] = outHour - inHour;
        
        // 분 차 계산
        if (inMinute > outMinute) {
            WorkTimeArr[0]--;  // 한 시간 감소
            outMinute += 60;
        }
        WorkTimeArr[1] = outMinute - inMinute;

        // 초 차 계산
        if (inSecond > outSecond) {
        	if(WorkTimeArr[1] == 0) {
        		WorkTimeArr[0]--;
        		WorkTimeArr[1] += 60;
        		WorkTimeArr[1]--;
        		outSecond += 60;
        	} else {
        		WorkTimeArr[1]--;  // 한 분 감소
        		outSecond += 60;
        	}
        }
        WorkTimeArr[2] = outSecond - inSecond;
    }
}