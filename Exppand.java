// Write a program that , given a sequence of letters like 2aeb4c produces an output like aabbbcccc
class Exppand{
	public static void main(String[] args){
		Exppand x = new Exppand();
		System.out.println(x.exp("2a3b4c"));
	}

	public String exp(String seq){
		StringBuilder output = new StringBuilder();
		for(int i=0; i<seq.length(); i+=2){
			for(int j=0; j<Character.getNumericValue(seq.charAt(i)); j++){
				output.append(seq.charAt(i+1));
			}
		}

		return output.toString();
	}
}