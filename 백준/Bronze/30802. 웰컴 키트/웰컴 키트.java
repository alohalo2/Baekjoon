import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int peopleCount = Integer.parseInt(br.readLine());
			String[] tSizeCount = br.readLine().split(" ");
			String[] quantityCount = br.readLine().split(" ");
			int T = Integer.parseInt(quantityCount[0]);
			int P = Integer.parseInt(quantityCount[1]);
			int sum = 0, penSetCount = 0, penCount = 0;

			for (String string : tSizeCount) {
				int count = Integer.parseInt(string);
				int packs = (int) Math.ceil((double) count / T);
				sum += packs;
			}

			penSetCount = peopleCount / P;
			penCount = peopleCount % P;

			System.out.println(sum);
			System.out.print(penSetCount + " " + penCount);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}