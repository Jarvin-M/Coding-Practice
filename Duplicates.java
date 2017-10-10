// Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

// Do not allocate extra space for another array, you must do this in place with constant memory.

// For example,
// Given input array nums = [1,1,2],

// Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
import org.apache.commons.lang3.ArrayUtils;
import java.util.*;
class Duplicates{
	public static void main(String[] args){
		Duplicates x =new Duplicates();
		int[] newArray ={1,2,2,3,3,4};
		System.out.println(x.duplicates(newArray));
	}

	private static int duplicates(int[] numberArray){
		for(int i=0; i<numberArray.length; i++){
			if(numberArray[i]== numberArray[i+1]) ArrayUtils.remove(numberArray,i);
		}
		return numberArray.length;
	} 
}