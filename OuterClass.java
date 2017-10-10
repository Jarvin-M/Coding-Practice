public class OuterClass{
    static int outVariable = 100;
	
	static class MemberClass{
	    int innervariable =20;
		int getSum(int parameter){
		return innervariable + outVariable + parameter;
		}
	}
    public static void main (String [] args){
	 //OuterClass outer = new OuterClass();
	 OuterClass.MemberClass inner = new OuterClass.MemberClass();
	 System.out.println(inner.getSum(40));
	 //inner.run();
	}
	
	//static void run(){
	//OuterClass.MemberClass loc = new OuterClass.MemberClass();
	//System.out.println(loc.getSum(8));}
}