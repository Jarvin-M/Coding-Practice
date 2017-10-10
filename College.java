public class College{

public static void main(String []args){
 
 Unit School = new Unit(){
   public void printUnit(int value){
   System.out.println("Enrollment is " + value);
   }
 };
 School.printUnit(4000);
}

}