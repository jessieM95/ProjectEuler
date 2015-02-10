import java.math.BigInteger;



public class prob20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = Factorial(100) + "";
		int sum = 0;
		for(int i = 0; i < answer.length(); i++)
		{
			String number = answer.substring(i, i+1);
			int num2 = Integer.parseInt(number);
			sum = sum + num2;
		}
		
		System.out.print(sum);
		
	}
	
	public static long Factorial(long num)
	{
		long temp = 1;
		for(long i = num; i >= 1; i --)
		{
			temp = temp * i;
		}
		
		return temp;
		
	}
}
