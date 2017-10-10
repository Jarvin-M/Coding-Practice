// Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//For example:Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
class Repeat{
	public static void main(String[] args){
		Repeat cv = new Repeat();
		System.out.println(cv.repeatAdd(96));
	}
	int sum;
	
	public char[] repeatAdd(int num){
		String x = Integer.toString(num);
		char[] xArrray = x.toCharArray();
		for(int i =0; i<xArrray.length; i++){
			sum += Character.getNumericValue(xArrray[i]);
		}
		
		if(sum>9){
			repeatAdd(sum);
		}else{

		}
	
	return xArrray;
		
		
	}
}