import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int numberQauntity = Integer.parseInt(br.readLine());
			
			// HashSet은 중복만 없지만 TreeSet은 중복 + 정렬까지 된다.
			Set<Integer> sortedSet = new TreeSet<>();
			// system.out.println은 출력 버퍼 I/O 비용이 커서 시간초과가 난다.
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < numberQauntity; i++) {
				sortedSet.add(Integer.parseInt(br.readLine()));
			}
			
			for (Integer i : sortedSet) {
				sb.append(i).append("\n");
			}
			
			System.out.print(sb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
