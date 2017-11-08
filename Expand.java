// Write a program that , given a sequence of letters like 2aeb4c produces an output like aabbbcccc
import java.util.*;
class Expand{
	public static void main(String[] args){
		Expand v = new Expand();
		System.out.println(v.strexpand("2a3b4c"));
	}

	

	public String strexpand(String input){
		ArrayList<Character> newstr = new ArrayList<Character>();
		char[] x = input.toCharArray();
		
		for(int i =0; i<x.length; i+=2){

			for(int j=0; j<Character.getNumericValue(x[i]); j++ ){
				 newstr.add(x[i+1]);
			}
		}
	StringBuilder res = new StringBuilder(newstr.size());
	for(Character c: newstr){
		res.append(c);
	}
	String output = res.toString();
	return output;
	}
}