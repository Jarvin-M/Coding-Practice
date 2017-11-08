// Given a string, find the length of the longest substring without repeating characters.

// Examples:

// Given "abcabcbb", the answer is "abc", which the length is 3.

// Given "bbbbb", the answer is "b", with the length of 1.

// Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
import java.util.*;
class Substr{
	public static void main(String[] args){
		Substr vv = new Substr();
		System.out.println(vv.findSub("abcabcbb"));
	}
		String nonrepsub;
	public ArrayList<String> findSub(String input){
		String subs;
		ArrayList<String> vx = new ArrayList<String>();
		for(int i=0; i<input.length(); i++){
			for(int k =i+1; k<input.length(); k++){
				
				subs = input.substring(i,k);
				
				vx.add(subs);
				
			}
		}
		
		return vx;
	}
}