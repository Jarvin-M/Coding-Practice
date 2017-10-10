// You have a list of integers, and for each index you want to find the product of every integer except 
//the integer at that index.
// Write a function get_products_of_all_ints_except_at_index() that takes a list of integers and returns
// a list of the products.
import java.util.*;
class ListOfInteger{
	ArrayList<Integer> newArray = new ArrayList<Integer>();
	int product = 1;

	public static void main(String[] args){
		ListOfInteger x = new ListOfInteger();
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1); A.add(2); A.add(4);
		System.out.println(x.get_products_of_all_ints_except_at_index(A));
	}
		
	public ArrayList<Integer>  get_products_of_all_ints_except_at_index(ArrayList<Integer> numberArray){
		// int arraysize =numberArray.length();
		 
		for(int i=0; i< numberArray.size(); i++){
			for(int j= 0; j != i; j++){
				int x = numberArray.get(j);
				x *=  1;
				product	=numberArray.get(j);
				newArray.add(product);	
			}
				
		}

		return newArray;
	}
}