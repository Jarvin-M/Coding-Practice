// String Compression: Implement a method to perform basic string compression using the counts of repeated characters.
 // For example, the string "aabcccccaaa" would become "a2b1c5a3". If the "compressed" string would not become smaller than
 // the original string, your method should return the original string. You can assume the string has only uppercase and
 // lowercase letters (a-z, A-Z).
import java.util.*;
class StringCompress{
	public static void main(String[] args){
		StringCompress x = new StringCompress();
		System.out.println(x.compress("aabcccccaaaddd"));
	}

	public String compress(String input){
		
		char[] inp = input.toLowerCase().toCharArray();
		Arrays.sort(inp);
		String workwith =new String(inp);

		StringBuilder output = new StringBuilder();
		
 		int count=1;
 		
		for(int i=0; i<workwith.length()-1; i++){
			
			if(workwith.charAt(i)==workwith.charAt(i+1)){
				count++;
			}else {
			output.append(count);
            output.append(workwith.charAt(i));
            
            count = 1;
        }

		}
		return output.toString();
	}
}