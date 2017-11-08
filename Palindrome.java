// Determine whether an integer is a palindrome. Do this without extra space.
class Palindrome{
	public static void main(String[] args){
		Palindrome x = new Palindrome();
		System.out.println(x.isPali(12321));
	}
	
	public int reverse(int num){
		int rev =0;
		while(num != 0){
			int digit = num % 10;
			rev = rev*10 + digit;
			num = num/10;
		}
		return rev;
	}
	public boolean isPali(int input){
		if(reverse(input) == input){
			return true;
		}else{
		 return false;
		}
	}
}