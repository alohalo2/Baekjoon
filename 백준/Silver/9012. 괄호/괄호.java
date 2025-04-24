import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int T = Integer.parseInt(br.readLine());

			while (T-- > 0) {
				String str = br.readLine();

				if (isVPS(str)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isVPS(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}