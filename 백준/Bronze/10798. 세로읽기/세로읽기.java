import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
             
        try {
        	
        	// 접근 방법 : 
        	// 1. 배열이던 리스트이던 입력 받은 값을 저장하고 최대 길이를 구하기
        	// 2. 세로로 읽는 것은 중첩 for문 활용
        	// 3. 한 글자씩 출력하는 것은 charAt() 메소드 활용

        	
            // 5줄로 입력 받는다 (각 줄은 1~15 글자)
            List<String> strList = new ArrayList<>();
            
            // 최대 열의 개수
            int maxLength = 0;

            // 입력 5줄을 받음
            for(int i = 0; i < 5; i++) {
                String inputLine = br.readLine();
                strList.add(inputLine);
                // 최대 길이를 업데이트
                maxLength = Math.max(maxLength, inputLine.length());
            }
            
            // 세로로 읽기
            // 중첩 for문을 이용해서 첫 번째 for문에서 1줄씩 접근
            // 두 번째 for문과 charAt() 메소드로 세로로 있는 한 글자씩 바로바로 출력
            /*
             *  -> i
             * 	ABCDE / 한 줄씩 horizontalLine
             * 	ab
             * 	123456
             * 	FGHI
             * 
             * */   
            
            for (int i = 0; i < maxLength; i++) {
                for (String horizontalLine : strList) {
                    // 범위를 벗어나지 않는다면 해당 문자 추가
                    if (i < horizontalLine.length()) {
                        bw.write(horizontalLine.charAt(i));
                    }
                }
            }
            
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}