import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int testCount = Integer.parseInt(br.readLine());
			
			while(true) {
				if(testCount == 0) break;

				String[] userInput = br.readLine().split(" ");
				int numberOfFloor = Integer.parseInt(userInput[0]);
				int roomQuantity = Integer.parseInt(userInput[1]);
				int numberOfCustomer = Integer.parseInt(userInput[2]);
				
				System.out.println(calcRoomNumber(numberOfFloor, roomQuantity, numberOfCustomer));
				
				testCount--;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static int calcRoomNumber(int numberOfFloor, int roomQuantity, int numberOfCustomer) {
		
		
		int customerFloor; 
		int customerRoomNumber = (numberOfCustomer - 1) / numberOfFloor + 1;
				
		if(numberOfCustomer % numberOfFloor == 0) {
			customerFloor = numberOfFloor;
		} else {
			customerFloor = numberOfCustomer % numberOfFloor;
		}
		
		int result;
		
		if (customerRoomNumber < 10) {
			result = Integer.parseInt(customerFloor + "0" + customerRoomNumber);
		} else {
			result = Integer.parseInt(customerFloor + "" + customerRoomNumber);
		}
		
		return result;
	}

}