import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		
		Integer[] scoreArr = new Integer[N]; 
		
		for(int i = 0; i < N; i++) {
			scoreArr[i] = sc.nextInt();
		}
		
		Arrays.sort(scoreArr);
		Arrays.sort(scoreArr, (Collections.reverseOrder()));
		
		System.out.println(scoreArr[k-1]);
		
		sc.close();
	}
}