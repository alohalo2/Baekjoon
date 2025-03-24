import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int max = 0;
	
	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String[] userInput = br.readLine().split(" ");
			int N = Integer.parseInt(userInput[0]);
			int M = Integer.parseInt(userInput[1]);

			int[] cardArry = new int[N];
			String[] cards = br.readLine().split(" ");

			for (int i = 0; i < cardArry.length; i++) {
				cardArry[i] = Integer.parseInt(cards[i]);
			}

			combine(cardArry, new int[3], 0, 0, M);
			System.out.println(max);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void combine(int[] cardArry, int[] selected, int start, int depth, int M) {
		
		if(depth == 3) {
			int result = selected[0] + selected[1] + selected[2];
			if (result <= M && result > max) {
				max = result;
			}
			return;
		}
		
		for(int i = start; i < cardArry.length;	i++) {
			selected[depth] = cardArry[i];
			combine(cardArry, selected, i + 1, depth + 1, M);
		}
	}
}