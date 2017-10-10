public class Demo{
public static void main(String[] Arg){
 NumberCarrier byt = new NumberCarrier(){
 private int number;
 public void setNumber(int value){
  number = value;
 }
 public int getNumber(){
 return number;
 }
 };
 
 NumberCarrier bytxx = new NumberCarrier(){
 private int number;
 public void setNumber(int value){
  number = 2*value;
 }
 public int getNumber(){
 return number;
 }
 };
 byt.setNumber(42);
 bytxx.setNumber(42);
 showNumber(byt);
 showNumber(bytxx);
 System.out.println("End of Pogram");
 
 
}
 public static void showNumber(NumberCarrier o){
 System.out.println(o.getNumber());
 }
}