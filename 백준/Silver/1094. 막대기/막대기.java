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

        	int X = Integer.parseInt(br.readLine());
        	int initial = 64;
        	
        	List<Integer> intList = new ArrayList<>();
        	
        	intList.add(initial);
            int sum = initial;
            
            while (sum >= X) {
            	
            	if(X == 64)
            		break;
            	
                int smallest = intList.get(intList.size() - 1);
                intList.remove(intList.size() - 1);
                
                int half = smallest / 2;
                intList.add(half);
                
                sum -= half;

                if (sum < X) {
                    intList.add(half);
                    sum += half;
                }
                
                if(sum == X)
                break;
                
            }
            
            bw.write(intList.size() + "\n");
            
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}