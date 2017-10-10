// write a function list_pime_numbers that takes an integer as input and and returns all prime numbers up to the integer
 // i.e if the input is 9 the func returns 2,3,5,7
import java.util.*;

class Prime{
	public static void main(String[] args){
		Prime x = new Prime();
		System.out.println(x.list_pime_numbers(9));
	}


	ArrayList<Integer> x = new ArrayList<Integer>();
	public ArrayList<Integer> list_pime_numbers(int input){
		
			for(int i=0; i< input; i++){
				if(isprime(i)){
					x.add(i);
				}
			}
		return x;
	}
	
	public boolean isprime(int num){
		if(num<2){
			return false;
		}else{
			for(int i=2; i<num; i++){
				if(num%i == 0){
					return false;
					}
			}
		return true;
		}
		
	}
	
}