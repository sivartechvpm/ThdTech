package learn.java.practice;

public class TryCatch {

	public static void main(String[] args) {

		
		
		
		try {
			//throw new Exception("Is Exception");
			throw new Error("Its Error");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("FROM Finally");
		}
	}
}


class CustomException extends Exception{

	public CustomException(String string) {
		//super(string);
	}
	
	
	
	
}
