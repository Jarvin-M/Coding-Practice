public class Tables{
	
	public static void main(String []args){
		Tables x = new Tables();
		x.multipleTables(12);
	}
	
	public void multipleTables(int max){
		for(int i =1; i<= max; i++ ){
			for(int j =1; j<= max; j++ ){
				System.out.println(String.format("%4d",j*i));
			}
			System.out.println( );
		}
	}
}