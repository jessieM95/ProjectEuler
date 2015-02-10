import java.math.BigDecimal;


public class prob16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = powerOf(2.0,1000) + "";
		int sum = 0;
		for(int i = 0; i < answer.length(); i++)
		{
			String number = answer.substring(i, i+1);
			int num = Integer.parseInt(number);
			sum = sum + num;
		}
		
		System.out.println(sum);
		//System.out.println(powerOf(2.0,1000));
	}
	
	public static BigDecimal powerOf(double first, int power)
	{
		BigDecimal answer = new BigDecimal(0);
		BigDecimal firstNum = new BigDecimal(first);
		
		answer = firstNum.pow(power);
		return answer;
	}

}
