import java.util.ArrayList;

public class prob3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>  primefactors = new ArrayList<Integer>();
        long num = 600851475143L;
        
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                primefactors.add(i); // prime factor
                num /= i;
                i--;
            }
        }
        int largest = primefactors.get(0);
        for(int p = 0; p <primefactors.size(); p++)
        {
        	if(primefactors.get(p) > largest)
        		largest = primefactors.get(p);
        }
        
        System.out.print(largest);

	}

}
