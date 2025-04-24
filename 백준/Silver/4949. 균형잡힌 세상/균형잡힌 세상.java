import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			while (true) {
				String str = br.readLine();

				if (str.equals("."))
					break;

				if (isBalanced(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return false;
				}
				stack.pop();
			} else if (ch == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return false;
				}
				stack.pop();
			}
		}

		return stack.isEmpty();
	}

}