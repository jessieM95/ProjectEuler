
public class prob4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0;
		for(int i = 100; i <=999; i++)
		{
			for(int j = 100; j <=999; j++)
			{
				int val = i*j;
				String number = val + "";
				String pal = new StringBuilder(number).reverse().toString();
				int palandrom = Integer.parseInt(pal);
				if(palandrom == val && num<val)
					num = val;
			}
		}
		
		System.out.print(num);
		
	}

}
