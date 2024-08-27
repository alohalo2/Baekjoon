import java.util.Scanner;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);
		
		int index = 0;

		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			
			System.out.println(input);

			index++;
			
			if(index >= 100)
				break;
		}
		
		sc.close();
	}
}