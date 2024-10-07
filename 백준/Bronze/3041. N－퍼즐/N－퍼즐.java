import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
        	
//        	접근 방법 : 맨해튼 거리(위치 좌표 상의 차이)에 대한 이해
//        			 
        	
//        	맨허튼 거리(Manhattan Distance) 는 2차원 평면 공간에서 
//        	두 점 p와 q 사이의 거리를 측정하는 방법 중 하나로, 
//        	두 점 사이의 수평 및 수직 이동 거리의 합으로 정의된다.

//        	즉, 맨허튼 거리가 (p1,p2) 와(q1,q2) 사이면
//        	맨허튼 거리 = ∣p1−q1∣+∣p2−q2∣ 이다.

//        	여기서 |p| 또는 |q| 는 절대값을 나타내며, 
//        	수평방향(p) 수직방향(p)의 거리를 모두 더한 값이다.
        	
        	char[][] arr = {{'A','B','C','D'}, {'E','F','G','H'}, {'I','J','K','L'}, {'M','N','O','.'}};
        	char[][] newArr = new char[4][4];
        	int manhattanDistanceSum = 0;
        	
        	for(int i = 0; i < 4; i++) {
        		String line = br.readLine();
        		for(int j = 0; j < 4; j++) {
        			newArr[i][j] = line.charAt(j);
        			
//        			bw.write(newArr[i][j] + " ");
        		}
//        		bw.write("\n");
        	}
        	
        	for(int i = 0; i < arr.length; i++) {
        		for(int j = 0; j < arr[i].length; j++) {
        			if(arr[i][j] != newArr[i][j] && arr[i][j] != '.') {
        				// 원래 위치 (i, j)와 다른 값을 찾았을 때 인덱스 차이 계산
                        int originalRow = -1; // -1을 하는 이유는 인덱스이기 때문에
                        int originalCol = -1;

                        // newArr에서 현재 arr[i][j](arr에서 newArr과 비교했을 때 다른 값)의 위치 찾기
                        outerLoop:
                        for(int k = 0; k < newArr.length; k++) {
                            for(int l = 0; l < newArr[k].length; l++) {
                                if(newArr[k][l] == arr[i][j]) {
                                    originalRow = k;
                                    originalCol = l;
                                    break outerLoop; // 위치를 찾으면 중단
                                }
                            }
                        }

                        // 맨해튼 거리 계산
                        // Math.abs() : 절대값을 구해주는 메소드 |-1| = |1| = 1
                        int rowDifference = Math.abs(originalRow - i);
                        int colDifference = Math.abs(originalCol - j);
                        int manhattanDistance = rowDifference + colDifference;
                        
                        manhattanDistanceSum += manhattanDistance;
        			}
        		}
        	}
        	
        	bw.write(manhattanDistanceSum + "\n");
        	
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
