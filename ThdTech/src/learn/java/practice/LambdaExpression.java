package learn.java.practice;

public class LambdaExpression {
	
	static Integer addNumbers(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		Lam lam = LambdaExpression::addNumbers;
		System.out.println(lam.addVal(1,2));

	}

}


interface Lam{
	
	//String print(String s);
	
	
	Integer addVal(int a,int b);
	
	
}
