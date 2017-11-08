// Rotate an array of n elements to the right by k steps.

// For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
import java.util.*;
class Rotate{
	public static void main(String[] args){
		Rotate x = new Rotate();
		int num[] = {1,2,3,4,5,6,7};
		System.out.println(x.rotateArray(num, 3));
	}
	public ArrayList<Integer> rotateArray(int[] input, int k){
		ArrayList<Integer> newlist = new ArrayList<Integer>();
		for(int i=k+1; i<input.length; i++){
			newlist.add(input[i]);
		}
		for(int j=0; j<=k; j++){
			newlist.add(input[j]);
		}

		return newlist;
	}
}