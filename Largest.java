
class Largest{
	public static void main(String[] args){
		Largest x = new Largest();
		int testing[] ={2,3,4,5,89};
		System.out.println(x.finding(testing));
	}
	
	int max = Integer.MIN_VALUE;
	public int finding(int numberArray[]){
		for(int i=0; i < numberArray.length; i++){
			if (numberArray[i] > max) max=numberArray[i];
		}
		return max;
		
	}

}