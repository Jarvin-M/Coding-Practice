class Reverse{
	public static void main(String[] args){
		Reverse x = new Reverse();
		System.out.println(x.Reverse(122));
	}

	private static int Reverse(int original)
	{
	    int reverse = 0;
	    while (original != 0)
	    {
	        int digit = original % 10;
	        reverse = reverse*10 + digit;
	        original = original / 10;
	    }
	    return reverse;
	}
}