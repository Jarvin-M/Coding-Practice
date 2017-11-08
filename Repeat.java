// Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
//For example:Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
class Repeat{
	public static void main(String[] args){
		Repeat cv = new Repeat();
		System.out.println(cv.repeatAdd(96));
	}
	int sum;
	
	public int repeatAdd(int num){
		if(num<10){
			sum = num;
		}
		else{
			String newNum = Integer.toString(num);
		
			for(int i=0; i<newNum.length(); i++){
				sum += Character.getNumericValue(newNum.charAt(i));
			}
		}
		return Integer.toString(num).length();
	}

	public int finalsum(int input){
		if(Integer.toString(repeatAdd(input)).length()> 1){
			repeatAdd(repeatAdd(input));
		}else
			return repeatAdd(input);
		
	}

}