
// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,

// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

import java.util.*;
class Target{
	public static void main(String[] args){
		Target x = new Target();
		int[] xc = {2,11,15,7};
		System.out.println(x.findtarget(xc, 9));
	}

	public ArrayList<Integer> findtarget(int[] nums, int target){
		int sum;
		ArrayList<Integer> output = new ArrayList<Integer>();

		for(int i=0; i< nums.length; i++){
			for(int j=0; j<nums.length; j++){
				sum = nums[i]+nums[j];
				if(sum == target){
					
					output.add(i);
					output.add(j);
				}
			}
		
		}
		return output;

	}
}
