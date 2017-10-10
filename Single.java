// Given an array of integers, every element appears twice except for one. Find that single one.
import java.util.*;
class Single{
	public static void main(String[] args){
		Single x = new Single();
		int[] new1 = {2,5,5,3,4,4,3};
		System.out.println(x.singleone(new1));
	}
int singleone;
	private int singleone(int[] newinput){
		Arrays.sort(newinput);
		
		for(int i=0; i< newinput.length-1; i+=2){
			if(newinput[i] != newinput[i+1]) return newinput[i];

		}
		return newinput[newinput.length];
	}
}