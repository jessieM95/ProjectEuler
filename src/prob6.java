
public class prob6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sqr = 0;        
		int sumOfSquares = 0;
	    int squareOfSums = 0;
	        
	        for (int i = 0; i <101; i ++)
	        {
	        	int square = i * i;
	        	sumOfSquares = sumOfSquares + square;
	        	
	        }
	        
	        for (int i = 0; i <101; i ++)
	        {
	        	sqr = sqr + i;
	        }
	        squareOfSums = sqr * sqr;
	        
	        
	        System.out.println(squareOfSums - sumOfSquares);

	}

}
