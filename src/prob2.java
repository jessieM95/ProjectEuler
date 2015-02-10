
public class prob2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num1 = 1;
		long num2 = 2;
		long sum = 0;
		
		for(long i =0; i<=32; i++)
		{
			long x = num2;
			num2 = num1 + num2;
			num1 = x;
			if(num1 % 2 ==0)
				sum += num1;
		}
		
		System.out.println(sum);

	}

}
