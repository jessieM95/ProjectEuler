
public class prob10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long n = 2;
		long sum = 0;
		   while (n < 2000000){
		       if (Prime(n)==true)
		       {
		           sum = sum + n;
		       }
		       n++;
		   }
		   System.out.println(sum);

	}
	
	public static boolean Prime(long number)
	{
		for (int i = 2; i <= number/2; i++) 
		{
	           if (number % i == 0) // if number is divisible by any number that is <= half of it, then number is NOT prime
	               return false;
	    }
	       return true;
	}

}


  